package TestSwap;

import Swap.Swap;
import Swap.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class TestSwap {

    Swap swap;

    @Before
    public void createObject() {
        swap = new Swap();
    }

    @Test//минимум и максимум
    public void boundaryValuesTest() {


        //region (max/2,max)&(max,max/2)
        test(0, MAX_VALUE);
        test(1, MAX_VALUE);
        test(MAX_VALUE, MAX_VALUE);
        test(MAX_VALUE - 1, MAX_VALUE);
        test(MIN_VALUE, MAX_VALUE);

        //region random
        test(2, MAX_VALUE);
        test(21, MAX_VALUE);
        test(56, MAX_VALUE);
        test(107, MAX_VALUE);
        test(356, MAX_VALUE);
        test(762, MAX_VALUE);
        test(1890, MAX_VALUE);
        test(3729, MAX_VALUE);
        test(9982, MAX_VALUE);
        test(12876, MAX_VALUE);
        test(17563, MAX_VALUE);
        test(25638, MAX_VALUE);
        test(46539, MAX_VALUE);
        test(93872, MAX_VALUE);
        test(183732, MAX_VALUE);
        test(436731, MAX_VALUE);
        test(883764, MAX_VALUE);
        test(1736473, MAX_VALUE);
        test(3746428, MAX_VALUE);
        test(7361933, MAX_VALUE);
        test(16384831, MAX_VALUE);
        test(46383629, MAX_VALUE);
        test(83631634, MAX_VALUE);
        test(135137102, MAX_VALUE);
        test(344823741, MAX_VALUE);
        test(730134104, MAX_VALUE);
        test(971364181, MAX_VALUE);
        test(1362836493, MAX_VALUE);
        test(1833143523, MAX_VALUE);
        test(2054638142, MAX_VALUE);
        //endregion

        //region special
        test(MAX_VALUE / 2, MAX_VALUE);
        test(MAX_VALUE / 4, MAX_VALUE);
        test(MAX_VALUE / 6, MAX_VALUE);
        test(MAX_VALUE / 8, MAX_VALUE);
        test(MAX_VALUE / 10, MAX_VALUE);

        test((MAX_VALUE / 4) + MAX_VALUE / 2, MAX_VALUE);
        test((MAX_VALUE / 6) + MAX_VALUE / 2, MAX_VALUE);
        test((MAX_VALUE / 8) + MAX_VALUE / 2, MAX_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 2, MAX_VALUE);

        test((MAX_VALUE / 6) + MAX_VALUE / 4, MAX_VALUE);
        test((MAX_VALUE / 8) + MAX_VALUE / 4, MAX_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 4, MAX_VALUE);

        test((MAX_VALUE / 8) + MAX_VALUE / 6, MAX_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 6, MAX_VALUE);

        test((MAX_VALUE / 10) + MAX_VALUE / 8, MAX_VALUE);
        //endregion
        //endregion

        //region (min/2,max)&(max,min/2)
        test(0, MAX_VALUE);
        test(-1, MAX_VALUE);
        test(MIN_VALUE, MAX_VALUE);
        test(MAX_VALUE - 1, MAX_VALUE);
        test(MIN_VALUE + 1, MAX_VALUE);

        //region random
        test(-2, MAX_VALUE);
        test(-21, MAX_VALUE);
        test(-56, MAX_VALUE);
        test(-107, MAX_VALUE);
        test(-356, MAX_VALUE);
        test(-762, MAX_VALUE);
        test(-1890, MAX_VALUE);
        test(-3729, MAX_VALUE);
        test(-9982, MAX_VALUE);
        test(-12876, MAX_VALUE);
        test(-17563, MAX_VALUE);
        test(-25638, MAX_VALUE);
        test(-46539, MAX_VALUE);
        test(-93872, MAX_VALUE);
        test(-183732, MAX_VALUE);
        test(-436731, MAX_VALUE);
        test(-883764, MAX_VALUE);
        test(-1736473, MAX_VALUE);
        test(-3746428, MAX_VALUE);
        test(-7361933, MAX_VALUE);
        test(-16384831, MAX_VALUE);
        test(-46383629, MAX_VALUE);
        test(-83631634, MAX_VALUE);
        test(-135137102, MAX_VALUE);
        test(-344823741, MAX_VALUE);
        test(-730134104, MAX_VALUE);
        test(-971364181, MAX_VALUE);
        test(-1362836493, MAX_VALUE);
        test(-1833143523, MAX_VALUE);
        test(-2054638142, MAX_VALUE);
        //endregion

        //region special
        test(MIN_VALUE / 2, MAX_VALUE);
        test(MIN_VALUE / 4, MAX_VALUE);
        test(MIN_VALUE / 6, MAX_VALUE);
        test(MIN_VALUE / 8, MAX_VALUE);
        test(MIN_VALUE / 10, MAX_VALUE);

        test((MIN_VALUE / 4) - MIN_VALUE / 2, MAX_VALUE);
        test((MIN_VALUE / 6) - MIN_VALUE / 2, MAX_VALUE);
        test((MIN_VALUE / 8) - MIN_VALUE / 2, MAX_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 2, MAX_VALUE);

        test((MIN_VALUE / 6) - MIN_VALUE / 4, MAX_VALUE);
        test((MIN_VALUE / 8) - MIN_VALUE / 4, MAX_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 4, MAX_VALUE);

        test((MIN_VALUE / 8) - MIN_VALUE / 6, MAX_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 6, MAX_VALUE);

        test((MIN_VALUE / 10) - MIN_VALUE / 8, MAX_VALUE);
        //endregion
        //endregion

        //region (min,max/2)&(max/2,min)
        test(MIN_VALUE, 0);
        test(MIN_VALUE, 1);
        test(MIN_VALUE, MAX_VALUE - 1);
        test(MIN_VALUE, MAX_VALUE + 1);

        //region random
        test(MIN_VALUE, 2);
        test(MIN_VALUE, 21);
        test(MIN_VALUE, 56);
        test(MIN_VALUE, 107);
        test(MIN_VALUE, 356);
        test(MIN_VALUE, 762);
        test(MIN_VALUE, 1890);
        test(MIN_VALUE, 3729);
        test(MIN_VALUE, 9982);
        test(MIN_VALUE, 12876);
        test(MIN_VALUE, 17563);
        test(MIN_VALUE, 25638);
        test(MIN_VALUE, 46539);
        test(MIN_VALUE, 93872);
        test(MIN_VALUE, 183732);
        test(MIN_VALUE, 436731);
        test(MIN_VALUE, 883764);
        test(MIN_VALUE, 1736473);
        test(MIN_VALUE, 3746428);
        test(MIN_VALUE, 7361933);
        test(MIN_VALUE, 16384831);
        test(MIN_VALUE, 46383629);
        test(MIN_VALUE, 83631634);
        test(MIN_VALUE, 135137102);
        test(MIN_VALUE, 344823741);
        test(MIN_VALUE, 730134104);
        test(MIN_VALUE, 971364181);
        test(MIN_VALUE, 1362836493);
        test(MIN_VALUE, 1833143523);
        test(MIN_VALUE, 2054638142);
        //endregion

        //region special
        test(MAX_VALUE / 2, MIN_VALUE);
        test(MAX_VALUE / 4, MIN_VALUE);
        test(MAX_VALUE / 6, MIN_VALUE);
        test(MAX_VALUE / 8, MIN_VALUE);
        test(MAX_VALUE / 10, MIN_VALUE);

        test((MAX_VALUE / 4) + MAX_VALUE / 2, MIN_VALUE);
        test((MAX_VALUE / 6) + MAX_VALUE / 2, MIN_VALUE);
        test((MAX_VALUE / 8) + MAX_VALUE / 2, MIN_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 2, MIN_VALUE);

        test((MAX_VALUE / 6) + MAX_VALUE / 4, MIN_VALUE);
        test((MAX_VALUE / 8) + MAX_VALUE / 4, MIN_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 4, MIN_VALUE);

        test((MAX_VALUE / 8) + MAX_VALUE / 6, MIN_VALUE);
        test((MAX_VALUE / 10) + MAX_VALUE / 6, MIN_VALUE);

        test((MAX_VALUE / 10) + MAX_VALUE / 8, MIN_VALUE);
        //endregion
        //endregion

        //region (min/2,min)&(min,min/2)
        test(-1, MIN_VALUE);
        test(MIN_VALUE, MIN_VALUE);
        test(MAX_VALUE, MIN_VALUE - 1);
        test(MIN_VALUE + 1, MIN_VALUE);

        //region random
        test(-2, MIN_VALUE);
        test(-21, MIN_VALUE);
        test(-56, MIN_VALUE);
        test(-107, MIN_VALUE);
        test(-356, MIN_VALUE);
        test(-762, MIN_VALUE);
        test(-1890, MIN_VALUE);
        test(-3729, MIN_VALUE);
        test(-9982, MIN_VALUE);
        test(-12876, MIN_VALUE);
        test(-17563, MIN_VALUE);
        test(-25638, MIN_VALUE);
        test(-46539, MIN_VALUE);
        test(-93872, MIN_VALUE);
        test(-183732, MIN_VALUE);
        test(-436731, MIN_VALUE);
        test(-883764, MIN_VALUE);
        test(-1736473, MIN_VALUE);
        test(-3746428, MIN_VALUE);
        test(-7361933, MIN_VALUE);
        test(-16384831, MIN_VALUE);
        test(-46383629, MIN_VALUE);
        test(-83631634, MIN_VALUE);
        test(-135137102, MIN_VALUE);
        test(-344823741, MIN_VALUE);
        test(-730134104, MIN_VALUE);
        test(-971364181, MIN_VALUE);
        test(-1362836493, MIN_VALUE);
        test(-1833143523, MIN_VALUE);
        test(-2054638142, MIN_VALUE);
        //endregion

        //region special
        test(MIN_VALUE / 2, MIN_VALUE);
        test(MIN_VALUE / 4, MIN_VALUE);
        test(MIN_VALUE / 6, MIN_VALUE);
        test(MIN_VALUE / 8, MIN_VALUE);
        test(MIN_VALUE / 10, MIN_VALUE);

        test((MIN_VALUE / 4) - MIN_VALUE / 2, MIN_VALUE);
        test((MIN_VALUE / 6) - MIN_VALUE / 2, MIN_VALUE);
        test((MIN_VALUE / 8) - MIN_VALUE / 2, MIN_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 2, MIN_VALUE);

        test((MIN_VALUE / 6) - MIN_VALUE / 4, MIN_VALUE);
        test((MIN_VALUE / 8) - MIN_VALUE / 4, MIN_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 4, MIN_VALUE);

        test((MIN_VALUE / 8) - MIN_VALUE / 6, MIN_VALUE);
        test((MIN_VALUE / 10) - MIN_VALUE / 6, MIN_VALUE);

        test((MIN_VALUE / 10) - MIN_VALUE / 8, MIN_VALUE);
        //endregion
        //endregion
    }

    @Test//с нулем и минусами
    public void equivalenceClasses() {

        //region |_
        test(0, MIN_VALUE);
        test(0, MAX_VALUE - 1);
        test(0, 0);
        test(0, 1);

        test(0, 2);
        test(0, 10);
        test(0, 15);
        test(0, 77);
        test(0, 100);
        test(0, 122);
        test(0, 234);
        test(0, 500);
        test(0, 666);
        test(0, 837);
        test(0, 1525);
        test(0, 6666);
        test(0, 9373);
        test(0, 12453);
        test(0, 13426);
        test(0, 25473);
        test(0, 26536);
        test(0, 34572);
        test(0, 38497);
        test(0, 76312);
        test(0, 234561);
        test(0, 579642);
        test(0, 635635);
        test(0, 1298131);
        test(0, 2313412);
        test(0, 3423431);
        test(0, 11473648);
        test(0, 14734691);
        test(0, 333333333);
        test(0, 855120148);
        test(0, 999999999);
        test(0, 1147473648);
        test(0, 1409587544);

        test(0, MAX_VALUE / 2);
        test(0, MAX_VALUE / 4);
        test(0, MAX_VALUE / 6);
        test(0, MAX_VALUE / 8);
        test(0, MAX_VALUE / 10);

        test(0, (MAX_VALUE / 4) + MAX_VALUE / 2);
        test(0, (MAX_VALUE / 6) + MAX_VALUE / 2);
        test(0, (MAX_VALUE / 8) + MAX_VALUE / 2);
        test(0, (MAX_VALUE / 10) + MAX_VALUE / 2);

        test(0, (MAX_VALUE / 6) + MAX_VALUE / 4);
        test(0, (MAX_VALUE / 8) + MAX_VALUE / 4);
        test(0, (MAX_VALUE / 10) + MAX_VALUE / 4);

        test(0, (MAX_VALUE / 8) + MAX_VALUE / 6);
        test(0, (MAX_VALUE / 10) + MAX_VALUE / 6);

        test(0, (MAX_VALUE / 10) + MAX_VALUE / 8);
        //endregion

        //region -|
        test(0, MIN_VALUE + 1);
        test(0, MIN_VALUE - 1);
        test(0, -1);

        test(0, -2);
        test(0, -11);
        test(0, -15);
        test(0, -56);
        test(0, -100);
        test(0, -213);
        test(0, -500);
        test(0, -742);
        test(0, -1258);
        test(0, -1525);
        test(0, -3193);
        test(0, -5232);
        test(0, -7373);
        test(0, -8765);
        test(0, -12443);
        test(0, -15426);
        test(0, -18872);
        test(0, -26536);
        test(0, -54567);
        test(0, -98719);
        test(0, -121594);
        test(0, -156312);
        test(0, -234561);
        test(0, -545681);
        test(0, -548769);
        test(0, -635635);
        test(0, -764831);
        test(0, -1298131);
        test(0, -14734691);
        test(0, -23456789);
        test(0, -855120148);
        test(0, -1409587544);

        test(0, MIN_VALUE / 2);
        test(0, MIN_VALUE / 4);
        test(0, MIN_VALUE / 6);
        test(0, MIN_VALUE / 8);
        test(0, MIN_VALUE / 10);

        test(0, (MIN_VALUE / 4) - MIN_VALUE / 2);
        test(0, (MIN_VALUE / 6) - MIN_VALUE / 2);
        test(0, (MIN_VALUE / 8) - MIN_VALUE / 2);
        test(0, (MIN_VALUE / 10) - MIN_VALUE / 2);

        test(0, (MIN_VALUE / 6) - MIN_VALUE / 4);
        test(0, (MIN_VALUE / 8) - MIN_VALUE / 4);
        test(0, (MIN_VALUE / 10) - MIN_VALUE / 4);

        test(0, (MIN_VALUE / 8) - MIN_VALUE / 6);
        test(0, (MIN_VALUE / 10) - MIN_VALUE / 6);

        test(0, (MIN_VALUE / 10) - MIN_VALUE / 8);
        //endregion

        //region rundom/special
        test(-99999, 11111);
        test(-11, 222);
        test(-444, 6666);
        test(-44, 88);
        test(-333, 2);
        test(-7777, 99999);
        test(-555, 2222);
        test(-2, 88888888);
        test(-6666666, 222222);
        test(-888888, 5555555);
        test(-77777777, 1111111111);
        test(-333333333, 4444444);
        test(-5555, 9999);
        test(-2233, 3322);
        test(-6699, 5566);

        test(779933, 11113333);
        test(535353, 898989);
        test(212121, 676767676);
        test(99999999, 33);
        test(88, 1);
        test(22, 777);
        test(555, 888888);
        test(33333, 22);
        test(888888, 444444444);
        test(1, 999999999);
        test(22222, 333333333);
        test(666, 777);
        test(99999, 6666);
        test(100, 200);
        test(7, 666);


        //endregion
    }

    @Test//рядом стоящие которые хочется свапнуть
    public void subjectArea() {
        test(3, 5);
        test(4, 5);
        test(5, 6);
        test(7, 8);
        test(8, 9);
        test(2, 10);
        test(3, 13);
        test(10, 15);
        test(22, 33);
        test(30, 62);
        test(42, 53);
        test(63, 71);
        test(63, 2);
        test(3, 89);
        test(3, 23);
        test(96, 69);
        test(123, 152);
        test(12, 32);
        test(43, 54);
        test(737, 887);
        test(252, 25);
        test(25, 41);
        test(99, 11);
        test(44, 565);
        test(325, 13);
        test(14, 51);
        test(55, 18);
        test(19, 91);
        test(81, 71);
        test(15, 93);
    }

    @Test//с минусами
    public void implementation() {
        test(10, MAX_VALUE);
        test(100, MAX_VALUE);
        test(1000, MAX_VALUE);
        test(10000, MAX_VALUE);
        test(100000, MAX_VALUE);
        test(-30, MIN_VALUE);
        test(-300, MIN_VALUE);
        test(-3000, MIN_VALUE);
        test(-30000, MIN_VALUE);
        test(-300000, MIN_VALUE);
    }

    @Test//рандомные
    public void randomValues() {
        test(28, 69);
        test(12, 34);
        test(89, 76);
        test(63, 98);
        test(63, 63);
        test(98, 78);
        test(123, 6678);
        test(1, 2277272);
        test(98765, 87654);
        test(34567, 45678);
        test(123456, 456789);
        test(87654, 123);
        test(543, 329800);
        test(4011155, 31323);
        test(36877, 7187902);
        test(8342656, 45);
        test(4231, 11442177);
        test(23, 14133244);
        test(15698462, 3432);
        test(15771128, 2131);
        test(122, 17176969);
        test(17388436, 1734);
        test(19717666, 8484848);
        test(23461469, 647382);
        test(28857828, 987);
        test(323919752, 73773);
        test(417411330, 939321);
        test(568063480, 113);
        test(692253678, 87);
        test(873197880, 734894);
    }

    @Test//почти рандомные, но больше обычных
    public void otherSpecialMeanings() {

        test(666, 888);
        test(777, 888);
        test(7, 666);
        test(12, 2002);
        test(1, 2020);
        test(21, 13);
        test(33, 12);
        test(21, 21);
        test(12, 12);
        test(-16, 32);
        test(-11, 11);
        test(-123456789, 987654321);
        test(-12345678, 87654321);
        test(-1234567, 123456);
        test(-123456, 123456789);
        test(-7654321, 8976543);
        test(-23456789, 3456789);
        test(-9876543, 34567);
        test(1234, 9876);
        test(98, 1234);
        test(1, 9);
        test(9876543, 876543);
        test(5678, 9876543);
        test(123456, 7656);
        test(123, 54321);
        test(7654321, 12345);
        test(2345, 345);
        test(987, 7890);
        test(6543, 5678);
    }

    private void test(int firstNumber, int secondNumber) {
        check(firstNumber, secondNumber);
        check(-1 * firstNumber, secondNumber);
        check(firstNumber, -1 * secondNumber);
        check(-1 * firstNumber, -1 * secondNumber);

        check(secondNumber, firstNumber);
        check(secondNumber, -1 * firstNumber);
        check(-1 * secondNumber, firstNumber);
        check(-1 * secondNumber, -1 * firstNumber);
    }

    private void check(int firstNumber, int secondNumber) {
        String data = firstNumber + " " + secondNumber;
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String expectedResult = firstNumber + " " + secondNumber + " after swap = " + secondNumber + " " + firstNumber + "\r\n";

        Main.main(new String[]{});
        String actualResult = outputStream.toString();

        Assert.assertEquals(expectedResult, actualResult);
    }


}

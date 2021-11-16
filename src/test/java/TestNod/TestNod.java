package TestNod;

import Nod.Numbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.*;

public class TestNod {

    Numbers numbers;
    int a = 0;

    @Before
    public void createObject() {
        numbers = new Numbers();
    }

    @Test// Int.Max и Int.Min
    public void boundaryValuesTest() {
        test(MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE);//1111
        test(1, MAX_VALUE + 1, MAX_VALUE, MAX_VALUE, MAX_VALUE);//1111
        test(1, MAX_VALUE - 1, MAX_VALUE, MAX_VALUE, MAX_VALUE);//1111
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE, MAX_VALUE);//1111
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE);//1111
        test(MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);//1111
        test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE, MIN_VALUE);//1112
        test(1, MAX_VALUE - 1, MAX_VALUE, MAX_VALUE, MIN_VALUE);//1112
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE, MIN_VALUE);//1112
        test(2, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MIN_VALUE);//1112
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MIN_VALUE + 1);//1112
        test(MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, MIN_VALUE - 1);//1112
        test(1, MAX_VALUE - 1, MAX_VALUE, MAX_VALUE, MIN_VALUE - 1);//1112
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE, MIN_VALUE - 1);//1112
        test(1, MAX_VALUE, MAX_VALUE, MIN_VALUE, MIN_VALUE);//1122
        test(1, MAX_VALUE - 1, MAX_VALUE, MIN_VALUE, MIN_VALUE);//1122
        test(2, MAX_VALUE - 1, MAX_VALUE - 1, MIN_VALUE, MIN_VALUE);//1122
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MIN_VALUE + 1, MIN_VALUE);//1122
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, MIN_VALUE + 1, MIN_VALUE + 1);//1122
        test(1, MAX_VALUE, MAX_VALUE, MIN_VALUE - 1, MIN_VALUE);//1122
        test(1, MAX_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);//1222
        test(2, MAX_VALUE - 1, MIN_VALUE, MIN_VALUE, MIN_VALUE);//1222
        test(1, MAX_VALUE - 1, MIN_VALUE + 1, MIN_VALUE, MIN_VALUE);//1222
        test(1, MAX_VALUE - 1, MIN_VALUE + 1, MIN_VALUE + 1, MIN_VALUE);//1222
        test(1, MAX_VALUE - 1, MIN_VALUE + 1, MIN_VALUE + 1, MIN_VALUE + 1);//1222
        test(1, MAX_VALUE, MIN_VALUE - 1, MIN_VALUE, MIN_VALUE);//1222
        test(Math.abs(MIN_VALUE), MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);//2222

        test(1, MAX_VALUE + 1, MIN_VALUE, MAX_VALUE, MIN_VALUE);//1212
        test(1, MAX_VALUE, MAX_VALUE + 1, MIN_VALUE, MAX_VALUE);//1121
    }

    @Test//с минусами и одинаковым выходом
    public void equivalenceClasses() {

        test(1, 1, 1, 1, 1);
        test(1, 2, 3, 4, 5);
        test(1, 3, 5, 7, 11);
        test(1, 14, 56, 121, 871);

        test(2, 4, 6, 10, 14);
        test(2, 8, 12, 18, 20);
        test(2, 16, 20, 24, 30);

        test(5, 5, 10, 15, 20);
        test(5, 10, 15, 20, 25);
        test(5, 5, 40, 50, 60);

        test(13, 26, 39, 65, 91);
        test(13, 52, 78, 117, 130);
        test(13, 104, 130, 156, 195);

        test(125, 250, 375, 625, 875);
        test(125, 500, 750, 1125, 1250);
        test(125, 1000, 1250, 1500, 1875);

        test(1430, 2860, 4290, 7150, 10010);
        test(1430, 5720, 8580, 12870, 14300);
        test(1430, 11440, 14300, 17160, 21450);

        test(9321, 18642, 27963, 46605, 65247);
        test(9321, 37284, 55926, 83889, 93210);
        test(9321, 74568, 93210, 111852, 139815);

        test(38265, 76530, 114795, 191325, 267855);
        test(38265, 153060, 229590, 344385, 382650);
        test(38265, 306120, 382650, 459180, 573975);

        test(1426378, 2852756, 4279134, 7131890, 9984646);
        test(1426378, 5705512, 8558268, 12837402, 14263780);
        test(1426378, 11411024, 14263780, 17116536, 21395670);

        test(47843265, 95686530, 143529795, 239216325, 334902855);
        test(47843265, 191373060, 287059590, 430589385, 478432650);
        test(47843265, 382746120, 478432650, 574119180, 717648975);

        test(163066666, 326133332, 489199998, 815333330, 1141466662);
        test(163066666, 652266664, 978399996, 1467599994, 1630666660);
        test(163066666, 1304533328, 1630666660, 1956799992, 2119866658);

        test(222184601, 444369202, 666553803, 1110923005, 1555292207);
        test(222184601, 444369202, 666553803, 888738404, 1110923005);
        test(222184601, 1333107606, 1555292207, 1777476808, 1999661409);

        test(262184691, 262184691, 524369382, 786554073, 1048738764);
        test(262184691, 524369382, 786554073, 1048738764, 1310923455);
        test(262184691, 786554073, 1048738764, 1310923455, 1573108146);
        test(262184691, 1048738764, 1310923455, 1573108146, 1835292837);
        test(262184691, 1310923455, 1573108146, 1835292837, 2097477528);

        /*test(5, 695, 1565, 2515, 3595);
        test(5, 21985, 30715, 38015, 48595);
        test(5, 4425665, 4466285, 4507835, 4556465);
        test(5, 14503855, 14548355, 14598335, 14646655);
        test(5, 214595945, 214649665, 214702135, 214753705);
        test(5, 2147372965, 2147377465, 2147424005, 2147447495);
        test(5, 2147464205, 2147468495, 2147481155, 2147483645);

        test(13, 154531, 155051, 156091, 157391);
        test(13, 102005137, 108504097, 117239473, 120329443);
        test(13, 510355781, 535787993, 1445782897, 2138016179);

        test(125, 71375, 78875, 86375, 95125);
        test(125, 1485875, 1490875, 1500875, 1513375);
        test(125, 11239625, 122513375, 897570875, 2147469125);

        test(1430, 825110, 916630, 1002430, 1099670);
        test(1430, 14001130, 132099110, 719586010, 2147298010);

        test(9321, 5583279, 6086613, 6776367, 7428837);
        test(9321, 16563417, 16992183, 17719221, 18576753);
        test(9321, 91261911, 861046017, 1875692793, 2146728831);

        test(38265, 481258905, 701359185, 929112465, 1407654555);
        test(38265, 374652615, 1406889255, 1646122035, 2143184385);

        test(1426378, 58481498, 118389374, 195413786, 272438198);
        test(1426378, 7131890, 58481498, 118389374, 195413786);
        test(1426378, 917161054, 1102590194, 1310841382, 1499123278);
        test(1426378, 1516239814, 1735902026, 1949858726, 2138140622);

        test(47843265, 909022035, 1100395095, 1387454685, 1483141215);
        test(47843265, 1674514275, 1770200805, 1961573865, 2057260395);

        test(163066666, 815333330, 978399996, 1141466662, 1304533328);
        test(163066666, 1304533328, 1467599994, 1630666660, 1793733326);*/

    }

    @Test//просто маленькие понятные числа
    public void subjectArea() {
        test(2, 4, 6, 8, 10);
        test(3, 6, 9, 12, 15);
        test(4, 8, 12, 16, 20);
        test(5, 5, 10, 15, 20);
        test(6, 12, 18, 24, 30);
        test(7, 14, 21, 28, 35);
        test(8, 16, 24, 32, 40);
        test(9, 18, 27, 36, 45);
        test(10, 20, 30, 40, 50);
        test(11, 22, 33, 44, 55);
        test(13, 26, 39, 52, 65);
        test(14, 28, 42, 56, 70);
        test(15, 30, 45, 60, 75);
        test(16, 32, 48, 64, 80);
        test(17, 34, 51, 68, 85);
        test(18, 36, 54, 72, 90);
        test(19, 38, 57, 76, 95);
        test(20, 40, 60, 80, 100);
        test(21, 42, 63, 84, 105);
        test(22, 44, 66, 88, 110);
        test(23, 46, 69, 92, 115);
        test(24, 48, 72, 96, 120);
        test(25, 50, 75, 100, 125);
        test(26, 52, 78, 104, 130);
        test(27, 54, 81, 108, 135);
        test(28, 56, 84, 112, 140);
        test(29, 58, 87, 116, 145);
        test(30, 60, 90, 120, 150);
        test(31, 62, 93, 124, 155);
    }

    @Test//разные нули
    public void implementation() {

        test(0, 0, 0, 0, 0);

        test(1, 1, 0, 0, 0);
        test(2, 2, 0, 0, 0);
        test(5, 5, 0, 0, 0);
        test(32, 0, 0, 32, 0);
        test(1234, 1234, 0, 0, 0);
        test(12_345, 12_345, 0, 0, 0);
        test(125_678, 125_678, 0, 0, 0);
        test(636_363_663, 636_363_663, 0, 0, 0);
        test(1_636_363_663, 1_636_363_663, 0, 0, 0);
        test(MAX_VALUE - 1, MAX_VALUE - 1, 0, 0, 0);
        test(MAX_VALUE, MAX_VALUE, 0, 0, 0);

        test(1, 1, 2, 0, 0);
        test(2, 2, 4, 0, 0);
        test(5, 0, 0, 15, 20);
        test(14, 14, 28, 0, 0);
        test(195, 1402325535, 1402379355, 0, 0);
        test(270, 1941679890, 1941713910, 0, 0);
        test(MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, 0, 0);
        test(MAX_VALUE, MAX_VALUE, MAX_VALUE, 0, 0);

        test(1, 1, 2, 3, 0);
        test(2, 4, 6, 8, 0);
        test(5, 0, 10, 15, 20);
        test(5, 364655, 398495, 432335, 0);
        test(6, 6, 12, 18, 0);
        test(90, 647226630, 647237970, 647248410, 0);
        test(MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, 0);
        test(MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE, 0);

    }

    @Test//разные числа
    public void randomValues() {
        test(1, 3, 45, 56, 89);
        test(1, 5, 32, 43, 65);
        test(2, 8, 12, 22, 46);
        test(2, 10, 8, 6, 4);
        test(3, 6, 9, 12, 18);
        test(5, 5, 10, 15, 20);
        test(5, 10, 15, 20, 25);
        test(5, 325, 455, 575, 1125);
        test(9, 81, 18, 27, 45);
        test(14, 14, 28, 56, 84);
        test(23, 9407, 22931, 180941, 165412711);
        test(24, 24216, 72456, 148728, 172604616);
        test(25, 2825, 27725, 69425, 179796425);
        test(26, 11674, 38246, 127114, 186988282);
        test(27, 17847, 89073, 239949, 194180139);
        test(28, 40684, 186508, 192164, 201371996);
        test(29, 7453, 37729, 100543, 208563853);
        test(30, 30270, 83310, 299190, 215755710);
        test(31, 222933617, 222937523, 222941119, 222947567);

        test(1, 7, 8, 9, 10);
        test(3, 9, 18, 33, 39);
        test(5, 10, 15, 20, 30);
        test(13, 403, 949, 1651, 2327);
        test(125, 71375, 78875, 86375, 95125);
        test(167, 96359, 107047, 117067, 128423);
        test(1561, 916307, 1003723, 1106749, 1206653);
        test(5783, 3429319, 3741601, 4157977, 4551221);
        test(9321, 5583279, 6086613, 6776367, 7428837);
        test(14679, 8822079, 9673461, 10759707, 11875311);
        test(38265, 76530, 1186215, 2793345, 4859655);
        test(86665, 259995, 3206605, 6846535, 11353115);
        test(274621, 1373105, 11259461, 22793543, 37623077);
        test(576813, 4037691, 24802959, 51336357, 80177007);
        test(839719, 9236909, 39466793, 81452743, 125118131);
        test(1738739, 22603607, 92153167, 175612639, 262549589);
        test(3725123, 7450246, 11175369, 18625615, 26075861);
        test(6731647, 20194941, 33658235, 47121529, 74048117);
        test(16353833, 81769165, 114476831, 179892163, 212599829);
        test(47843265, 95686530, 143529795, 239216325, 334902855);
        test(86465927, 259397781, 432329635, 605261489, 951125197);
        test(162866651, 325733302, 488599953, 814333255, 1140066557);
        test(262184691, 524369382, 786554073, 1310923455, 1835292837);

        test(2,16,22,24,32);
        test(4,16,24,28,32);
        test(12, 12, 24, 36, 48);
        test(124, 70556, 76756, 84692, 93868);
        test(146, 83366, 92126, 100886, 111106);
        test(1430, 825110, 916630, 1002430, 1099670);
        test(5472, 3212064, 3518496, 3879648, 4229856);
        test(9870, 5852910, 6385890, 7096530, 7767690);
        test(15366, 9204234, 10033998, 11171082, 12246702);
        test(193872, 116517072, 127761648, 142108176, 156842448);
        test(393874, 787748, 12210094, 28752802, 50021998);
        test(794822, 2384466, 29408414, 62790938, 104121682);
        test(1426378, 7131890, 58481498, 118389374, 195413786);
        test(3934898, 27544286, 169200614, 350205922, 546950822);
        test(6837726, 75214986, 321373122, 663259422, 1018821174);
        test(13717290, 178324770, 727016370, 1385446290, 2071310790);
        test(43039622, 86079244, 129118866, 215198110, 301277354);
        test(83036622, 249109866, 415183110, 581256354, 913402842);

        test(291736288, 583472576, 875208864, 1458681440, 2042154016);
    }

    @Test//те что сразу не поймешь
    public void otherSpecialMeanings() {
        test(15, 107871105, 107872995, 107874735, 107877855);
        test(30, 215742210, 215745990, 215749470, 215755710);
        test(45, 323613315, 323618985, 323624205, 323633565);
        test(60, 431484780, 431492340, 431501340, 431511540);
        test(75, 539355525, 539364975, 539373675, 539389275);
        test(90, 647226630, 647237970, 647248410, 647267130);
        test(105, 755097735, 755110965, 755123145, 755144985);
        test(120, 862968840, 862983960, 862997880, 863022840);
        test(135, 970839945, 970856955, 970872615, 970900695);
        test(150, 1078711050, 1078729950, 1078747350, 1078778550);
        test(165, 1186582155, 1186602945, 1186622085, 1186656405);
        test(180, 1294453260, 1294475940, 1294496820, 1294534260);
        test(195, 1402325535, 1402350105, 1402379355, 1402412505);
        test(210, 1510195470, 1510221930, 1510246290, 1510289970);
        test(225, 1618066575, 1618094925, 1618121025, 1618167825);
        test(240, 1725937680, 1725967920, 1725995760, 1726045680);
        test(255, 1833808785, 1833840915, 1833870495, 1833923535);
        test(270, 1941679890, 1941713910, 1941745230, 1941801390);
        test(285, 2049550995, 2049586905, 2049619965, 2049679245);
        test(300, 25242900, 25271700, 25313100, 25337100);
        test(315, 26511345, 26537805, 26582535, 26605845);
        test(330, 27767190, 27798870, 27844410, 27870810);
        test(345, 29029335, 29062455, 29110065, 29137665);
        test(360, 30291480, 30326040, 30375720, 30404520);
        test(375, 31553625, 31589625, 31641375, 31671375);
        test(390, 32815770, 32853210, 32907030, 32938230);
        test(405, 34077915, 34116795, 34172685, 34205085);
        test(420, 35340060, 35380380, 35438340, 35471940);
        test(666, 115218, 334998, 699966, 2070594);
        test(777, 108003, 7716387, 43641759, 355571517);
        test(888, 885336, 5524248, 86040984, 707637432);
        test(MAX_VALUE - 4, MAX_VALUE - 4, MAX_VALUE - 4, MAX_VALUE - 4, MAX_VALUE - 4);
        test(MAX_VALUE - 2, MAX_VALUE - 2, MAX_VALUE - 2, MAX_VALUE - 2, MAX_VALUE - 2);
        test(MAX_VALUE - 3, MAX_VALUE - 3, MAX_VALUE - 3, MAX_VALUE - 3, MAX_VALUE - 3);
        test(MAX_VALUE + 1, MAX_VALUE + 1, MAX_VALUE + 1, MAX_VALUE + 1, MAX_VALUE + 1);
        System.out.println(a);
    }

    private void test(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        testFirst(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecond(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThird(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFours(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private void testFirst(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        check(expectedNod, firstNumber, secondNumber, fourthNumber, thirdNumber);
        check(expectedNod, firstNumber, thirdNumber, secondNumber, fourthNumber);
        check(expectedNod, firstNumber, thirdNumber, fourthNumber, secondNumber);
        check(expectedNod, firstNumber, fourthNumber, secondNumber, thirdNumber);
        check(expectedNod, firstNumber, fourthNumber, thirdNumber, secondNumber);

        testFirstWithFirstMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFirstWithSecondMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFirstWithThirdMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFirstWithFoursMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFirstWithFifthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFirstWithSixthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private void check(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        Assert.assertEquals(expectedNod, numbers.findNodForFourNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber));
        a++;
    }

    private void testFirstWithFirstMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, secondNumber, thirdNumber, fourthNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, thirdNumber, fourthNumber);
        check(expectedNod, firstNumber, secondNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, firstNumber, secondNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, thirdNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, secondNumber, -1 * thirdNumber, -1 * fourthNumber);
    }

    private void testFirstWithSixthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, fourthNumber, thirdNumber, secondNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, thirdNumber, secondNumber);
        check(expectedNod, firstNumber, fourthNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, firstNumber, fourthNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, thirdNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, fourthNumber, -1 * thirdNumber, -1 * secondNumber);
    }

    private void testFirstWithFifthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, fourthNumber, secondNumber, thirdNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, secondNumber, thirdNumber);
        check(expectedNod, firstNumber, fourthNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, firstNumber, fourthNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, secondNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, fourthNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * fourthNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, -1 * fourthNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, fourthNumber, -1 * secondNumber, -1 * thirdNumber);
    }

    private void testFirstWithFoursMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, thirdNumber, fourthNumber, secondNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, fourthNumber, secondNumber);
        check(expectedNod, firstNumber, thirdNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, firstNumber, thirdNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, fourthNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, firstNumber, thirdNumber, -1 * fourthNumber, -1 * secondNumber);
    }

    private void testFirstWithThirdMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, thirdNumber, secondNumber, fourthNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, secondNumber, fourthNumber);
        check(expectedNod, firstNumber, thirdNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, firstNumber, thirdNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, secondNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, thirdNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * firstNumber, -1 * thirdNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, -1 * thirdNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, firstNumber, thirdNumber, -1 * secondNumber, -1 * fourthNumber);
    }

    private void testFirstWithSecondMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * firstNumber, secondNumber, fourthNumber, thirdNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, fourthNumber, thirdNumber);
        check(expectedNod, firstNumber, secondNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, firstNumber, secondNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, fourthNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, -1 * secondNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * firstNumber, secondNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, -1 * secondNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, firstNumber, secondNumber, -1 * fourthNumber, -1 * thirdNumber);
    }

    private void testSecond(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, secondNumber, firstNumber, thirdNumber, fourthNumber);
        check(expectedNod, secondNumber, firstNumber, fourthNumber, thirdNumber);
        check(expectedNod, secondNumber, thirdNumber, firstNumber, fourthNumber);
        check(expectedNod, secondNumber, thirdNumber, fourthNumber, firstNumber);
        check(expectedNod, secondNumber, fourthNumber, firstNumber, thirdNumber);
        check(expectedNod, secondNumber, fourthNumber, thirdNumber, firstNumber);

        testSecondWithFirstMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecondWithSecondMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecondWithThirdMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecondWithFoursMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecondWithFifthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testSecondWithSixthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private void testSecondWithFirstMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, firstNumber, thirdNumber, fourthNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, thirdNumber, fourthNumber);
        check(expectedNod, secondNumber, firstNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, secondNumber, firstNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, thirdNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, -1 * thirdNumber, fourthNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, thirdNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, -1 * thirdNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, firstNumber, -1 * thirdNumber, -1 * fourthNumber);

    }

    private void testSecondWithFifthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, fourthNumber, firstNumber, thirdNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, firstNumber, thirdNumber);
        check(expectedNod, secondNumber, fourthNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, secondNumber, fourthNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, firstNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, fourthNumber, -1 * firstNumber, -1 * thirdNumber);

    }

    private void testSecondWithSixthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, fourthNumber, thirdNumber, firstNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, thirdNumber, firstNumber);
        check(expectedNod, secondNumber, fourthNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, secondNumber, fourthNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, thirdNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, fourthNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * fourthNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, -1 * fourthNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, fourthNumber, -1 * thirdNumber, -1 * firstNumber);

    }

    private void testSecondWithFoursMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, thirdNumber, fourthNumber, firstNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, fourthNumber, firstNumber);
        check(expectedNod, secondNumber, thirdNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, secondNumber, thirdNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, fourthNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, secondNumber, thirdNumber, -1 * fourthNumber, -1 * firstNumber);

    }

    private void testSecondWithThirdMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, thirdNumber, firstNumber, fourthNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, firstNumber, fourthNumber);
        check(expectedNod, secondNumber, thirdNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, secondNumber, thirdNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, firstNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, thirdNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * secondNumber, -1 * thirdNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, -1 * thirdNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, secondNumber, thirdNumber, -1 * firstNumber, -1 * fourthNumber);

    }

    private void testSecondWithSecondMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * secondNumber, firstNumber, fourthNumber, thirdNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, fourthNumber, thirdNumber);
        check(expectedNod, secondNumber, firstNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, secondNumber, firstNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, fourthNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, firstNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, -1 * secondNumber, -1 * firstNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, -1 * fourthNumber, thirdNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, fourthNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, -1 * firstNumber, -1 * fourthNumber, -1 * thirdNumber);
        check(expectedNod, secondNumber, firstNumber, -1 * fourthNumber, -1 * thirdNumber);

    }

    private void testThird(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, thirdNumber, firstNumber, secondNumber, fourthNumber);
        check(expectedNod, thirdNumber, firstNumber, fourthNumber, secondNumber);
        check(expectedNod, thirdNumber, secondNumber, firstNumber, fourthNumber);
        check(expectedNod, thirdNumber, secondNumber, fourthNumber, firstNumber);
        check(expectedNod, thirdNumber, fourthNumber, firstNumber, secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, firstNumber, secondNumber);

        testThirdWithFirstMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThirdWithSecondMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThirdWithThirdMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThirdWithFoursMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThirdWithFifthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testThirdWithSixthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private void testThirdWithFirstMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, firstNumber, secondNumber, fourthNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, secondNumber, fourthNumber);
        check(expectedNod, thirdNumber, firstNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, thirdNumber, firstNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, secondNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, -1 * secondNumber, fourthNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, secondNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, -1 * secondNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, firstNumber, -1 * secondNumber, -1 * fourthNumber);

    }

    private void testThirdWithFifthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, fourthNumber, firstNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, firstNumber, secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, -1 * firstNumber, -1 * secondNumber);

    }

    private void testThirdWithSixthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, fourthNumber, firstNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, firstNumber, secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, fourthNumber, -1 * firstNumber, -1 * secondNumber);

    }

    private void testThirdWithFoursMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, secondNumber, fourthNumber, firstNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, fourthNumber, firstNumber);
        check(expectedNod, thirdNumber, secondNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, thirdNumber, secondNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, fourthNumber, firstNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, -1 * fourthNumber, firstNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, fourthNumber, -1 * firstNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, -1 * fourthNumber, -1 * firstNumber);
        check(expectedNod, thirdNumber, secondNumber, -1 * fourthNumber, -1 * firstNumber);


    }

    private void testThirdWithThirdMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, secondNumber, firstNumber, fourthNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, firstNumber, fourthNumber);
        check(expectedNod, thirdNumber, secondNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, thirdNumber, secondNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, firstNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, secondNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, -1 * thirdNumber, -1 * secondNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, -1 * firstNumber, fourthNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, firstNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, -1 * secondNumber, -1 * firstNumber, -1 * fourthNumber);
        check(expectedNod, thirdNumber, secondNumber, -1 * firstNumber, -1 * fourthNumber);

    }

    private void testThirdWithSecondMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * thirdNumber, firstNumber, fourthNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, fourthNumber, secondNumber);
        check(expectedNod, thirdNumber, firstNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, thirdNumber, firstNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, fourthNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, firstNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, -1 * thirdNumber, -1 * firstNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, -1 * fourthNumber, secondNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, fourthNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, -1 * firstNumber, -1 * fourthNumber, -1 * secondNumber);
        check(expectedNod, thirdNumber, firstNumber, -1 * fourthNumber, -1 * secondNumber);

    }

    private void testFours(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, fourthNumber, firstNumber, secondNumber, thirdNumber);
        check(expectedNod, fourthNumber, firstNumber, thirdNumber, secondNumber);
        check(expectedNod, fourthNumber, secondNumber, firstNumber, thirdNumber);
        check(expectedNod, fourthNumber, secondNumber, thirdNumber, firstNumber);
        check(expectedNod, fourthNumber, thirdNumber, firstNumber, secondNumber);
        check(expectedNod, fourthNumber, thirdNumber, secondNumber, firstNumber);

        testFoursWithFirstMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFoursWithSecondMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFoursWithThirdMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFoursWithFoursMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFoursWithFifthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
        testFoursWithSixthMinus(expectedNod, firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private void testFoursWithSixthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, thirdNumber, secondNumber, firstNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, secondNumber, firstNumber);
        check(expectedNod, fourthNumber, thirdNumber, -1 * secondNumber, firstNumber);
        check(expectedNod, fourthNumber, thirdNumber, secondNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, secondNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, -1 * secondNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, secondNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, -1 * secondNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, secondNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, -1 * secondNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, -1 * secondNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, -1 * secondNumber, firstNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, secondNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, -1 * secondNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, thirdNumber, -1 * secondNumber, -1 * firstNumber);

    }

    private void testFoursWithFoursMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, secondNumber, thirdNumber, firstNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, thirdNumber, firstNumber);
        check(expectedNod, fourthNumber, secondNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, fourthNumber, secondNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, thirdNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, -1 * thirdNumber, firstNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, thirdNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, -1 * thirdNumber, -1 * firstNumber);
        check(expectedNod, fourthNumber, secondNumber, -1 * thirdNumber, -1 * firstNumber);

    }

    private void testFoursWithFifthMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, thirdNumber, firstNumber, secondNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, firstNumber, secondNumber);
        check(expectedNod, fourthNumber, thirdNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, fourthNumber, thirdNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, firstNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, thirdNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * thirdNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, -1 * firstNumber, secondNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, firstNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, -1 * thirdNumber, -1 * firstNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, thirdNumber, -1 * firstNumber, -1 * secondNumber);

    }

    private void testFoursWithThirdMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, secondNumber, firstNumber, thirdNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, firstNumber, thirdNumber);
        check(expectedNod, fourthNumber, secondNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, fourthNumber, secondNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, firstNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, secondNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * secondNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, -1 * firstNumber, thirdNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, firstNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, -1 * secondNumber, -1 * firstNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, secondNumber, -1 * firstNumber, -1 * thirdNumber);

    }

    private void testFoursWithSecondMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, firstNumber, thirdNumber, secondNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, thirdNumber, secondNumber);
        check(expectedNod, fourthNumber, firstNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, fourthNumber, firstNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, thirdNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, -1 * thirdNumber, secondNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, thirdNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, -1 * thirdNumber, -1 * secondNumber);
        check(expectedNod, fourthNumber, firstNumber, -1 * thirdNumber, -1 * secondNumber);

    }

    private void testFoursWithFirstMinus(int expectedNod, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        check(expectedNod, -1 * fourthNumber, firstNumber, secondNumber, thirdNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, secondNumber, thirdNumber);
        check(expectedNod, fourthNumber, firstNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, fourthNumber, firstNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, secondNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, firstNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, -1 * fourthNumber, -1 * firstNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, -1 * secondNumber, thirdNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, secondNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, -1 * firstNumber, -1 * secondNumber, -1 * thirdNumber);
        check(expectedNod, fourthNumber, firstNumber, -1 * secondNumber, -1 * thirdNumber);

    }

}

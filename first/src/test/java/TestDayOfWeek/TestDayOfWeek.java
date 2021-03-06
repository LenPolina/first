package TestDayOfWeek;

import DayOfWeek.InvalidValuesException;
import DayOfWeek.Main;
import DayOfWeek.Year;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestDayOfWeek {

    Year year;

    @Before
    public void createObject() {
        year = new Year();
    }

    @Test
    public void invalidTest()  {
        //1
        exceptionTest(8, 1, 1);
        exceptionTest(7, 0, 1);
        exceptionTest(7, -1, 1);
        exceptionTest(7, 1, 0);
        exceptionTest(7, 1, -1);
        //2
        exceptionTest(-1, 1, 1);
        exceptionTest(0, 1, 1);
        exceptionTest(1, 0, 1);
        exceptionTest(1, -1, 1);
        exceptionTest(1, 1, 0);
        exceptionTest(1, 1, -1);
        //3
        exceptionTest(-1, 31, 1);
        exceptionTest(0, 31, 1);
        exceptionTest(1, 32, 1);
        exceptionTest(1, 31, 0);
        exceptionTest(1, 31, -1);
        exceptionTest(1, 31, 2);
        //4
        exceptionTest(8, 31, 1);
        exceptionTest(7, 32, 1);
        exceptionTest(7, 31, 0);
        exceptionTest(7, 31, -1);
        exceptionTest(7, 31, 2);
        //5
        exceptionTest(8, 1, 12);
        exceptionTest(7, 0, 12);
        exceptionTest(7, -1, 12);
        exceptionTest(7, 1, 13);
        //6
        exceptionTest(-1, 1, 12);
        exceptionTest(0, 1, 12);
        exceptionTest(1, 0, 12);
        exceptionTest(1, -1, 12);
        exceptionTest(1, 1, 13);
        //7
        exceptionTest(-1, 31, 12);
        exceptionTest(0, 31, 12);
        exceptionTest(1, 32, 12);
        exceptionTest(1, 31, 13);
        exceptionTest(1, 31, 11);
        //8
        exceptionTest(8, 31, 12);
        exceptionTest(7, 32, 12);
        exceptionTest(7, 31, 13);
        exceptionTest(7, 31, 11);
        //9
        exceptionTest(7, 31, 11);
        exceptionTest(8, 30, 11);
        //10
        exceptionTest(7, 32, 10);
        exceptionTest(8, 31, 10);
        //11
        exceptionTest(7, 31, 9);
        exceptionTest(8, 30, 9);
        //12
        exceptionTest(7, 32, 8);
        exceptionTest(8, 31, 8);
        //13
        exceptionTest(7, 32, 7);
        exceptionTest(8, 31, 7);
        //14
        exceptionTest(7, 31, 6);
        exceptionTest(8, 30, 6);
        //15
        exceptionTest(7, 32, 5);
        exceptionTest(8, 31, 5);
        //16
        exceptionTest(7, 31, 4);
        exceptionTest(8, 30, 4);
        //17
        exceptionTest(7, 32, 3);
        exceptionTest(8, 31, 3);
        //18
        exceptionTest(7, 29, 2);
        exceptionTest(8, 28, 2);
        //19
        exceptionTest(1, 31, 11);
        exceptionTest(0, 30, 11);
        exceptionTest(-1, 30, 11);
        //20
        exceptionTest(1, 32, 10);
        exceptionTest(0, 31, 10);
        exceptionTest(-1, 31, 10);
        //21
        exceptionTest(1, 31, 9);
        exceptionTest(0, 30, 9);
        exceptionTest(-1, 30, 9);
        //22
        exceptionTest(1, 32, 8);
        exceptionTest(0, 31, 8);
        exceptionTest(-1, 31, 8);
        //23
        exceptionTest(1, 32, 7);
        exceptionTest(0, 31, 7);
        exceptionTest(-1, 31, 7);
        //24
        exceptionTest(1, 31, 6);
        exceptionTest(0, 30, 6);
        exceptionTest(-1, 30, 6);
        //25
        exceptionTest(1, 32, 5);
        exceptionTest(0, 31, 5);
        exceptionTest(-1, 31, 5);
        //26
        exceptionTest(1, 31, 4);
        exceptionTest(0, 30, 4);
        exceptionTest(-1, 30, 4);
        //27
        exceptionTest(1, 32, 3);
        exceptionTest(0, 31, 3);
        exceptionTest(-1, 31, 3);
        //28
        exceptionTest(1, 29, 2);
        exceptionTest(0, 28, 2);
        exceptionTest(-1, 28, 2);
    }

    @Test
    public void boundaryValuesTest() throws InvalidValuesException {

        //region all day of first month in 2018 пн (1)
        test(1, 1, 1, "Понедельник");
        test(1, 7, 1, "Воскресенье");
        test(1, 11, 1, "Четверг");
        test(1, 19, 1, "Пятница");
        test(1, 23, 1, "Вторник");
        test(1, 27, 1, "Суббота");
        test(1, 31, 1, "Среда");
        //endregion

        //region all day of first month in 2019 вт (1.1)
        test(2, 2, 1, "Среда");
        test(2, 6, 1, "Воскресенье");
        test(2, 8, 1, "Вторник");
        test(2, 12, 1, "Суббота");
        test(2, 14, 1, "Понедельник");
        test(2, 18, 1, "Пятница");
        test(2, 24, 1, "Четверг");
        test(2, 30, 1, "Среда");
        //endregion(1

        //region all day of second month 2019 пн (1.2)
        test(1, 2, 2, "Пятница");
        test(1, 6, 2, "Вторник");
        test(1, 4, 2, "Воскресенье");
        test(1, 10, 2, "Суббота");
        test(1, 12, 2, "Понедельник");
        test(1, 28, 2, "Среда");
        //endregion

        //region last day in first month of all year (2)
        test(3, 31, 1, "Пятница");
        test(4, 31, 1, "Суббота");
        test(5, 31, 1, "Воскресенье");
        test(6, 31, 1, "Понедельник");
        test(7, 31, 1, "Вторник");
        //endregion

        //region penultimate day in first month of all year (2.1)
        test(3, 30, 1, "Четверг");
        test(4, 30, 1, "Пятница");
        test(5, 30, 1, "Суббота");
        test(6, 30, 1, "Воскресенье");
        test(7, 30, 1, "Понедельник");
        //endregion

        //region last day in second month of all year (2.2)
        test(2, 28, 2, "Четверг");
        test(3, 28, 2, "Пятница");
        test(4, 28, 2, "Суббота");
        test(5, 28, 2, "Воскресенье");
        test(6, 28, 2, "Понедельник");
        test(7, 28, 2, "Вторник");
        //endregion

        //region all day of first month in 2017 вс (3)
        test(7, 2, 1, "Понедельник");
        test(7, 6, 1, "Пятница");
        test(7, 10, 1, "Вторник");
        test(7, 14, 1, "Суббота");
        test(7, 18, 1, "Среда");
        test(7, 22, 1, "Воскресенье");
        test(7, 26, 1, "Четверг");
        //endregion

        //region all day of first month in 2022 сб (3.1)
        test(6, 1, 1, "Суббота");
        test(6, 3, 1, "Понедельник");
        test(6, 9, 1, "Воскресенье");
        test(6, 17, 1, "Понедельник");
        test(6, 23, 1, "Воскресенье");
        test(6, 27, 1, "Четверг");
        test(6, 29, 1, "Суббота");
        //endregion

        //region all day of second month in 2017 вс (3.2)
        test(7, 6, 2, "Понедельник");
        test(7, 8, 2, "Среда");
        test(7, 12, 2, "Воскресенье");
        test(7, 20, 2, "Понедельник");
        test(7, 24, 2, "Пятница");
        test(7, 26, 2, "Воскресенье");

        //endregion

        //region first day in first month of all year (4)
        test(3, 1, 1, "Среда");
        test(4, 1, 1, "Четверг");
        test(5, 1, 1, "Пятница");
        //endregion

        //region second day in first month of all year (4.1)
        test(3, 2, 1, "Четверг");
        test(4, 2, 1, "Пятница");
        test(5, 2, 1, "Суббота");
        //endregion

        //region first day in second month of all year (4.2)
        test(2, 1, 2, "Пятница");
        test(3, 1, 2, "Суббота");
        test(4, 1, 2, "Воскресенье");
        test(5, 1, 2, "Понедельник");
        test(6, 1, 2, "Вторник");
        //endregion

        //region all day of last month in 2018 пн (5)
        test(1, 2, 12, "Воскресенье");
        test(1, 4, 12, "Вторник");
        test(1, 6, 12, "Четверг");
        test(1, 10, 12, "Понедельник");
        test(1, 14, 12, "Пятница");
        test(1, 18, 12, "Вторник");
        test(1, 24, 12, "Понедельник");
        test(1, 28, 12, "Пятница");
        test(1, 30, 12, "Воскресенье");
        //endregion

        //region all day of last month in 2019 вт (5.1)
        test(2, 2, 12, "Понедельник");
        test(2, 6, 12, "Пятница");
        test(2, 8, 12, "Воскресенье");
        test(2, 14, 12, "Суббота");
        test(2, 16, 12, "Понедельник");
        test(2, 22, 12, "Воскресенье");
        test(2, 28, 12, "Суббота");
        test(2, 30, 12, "Понедельник");
        //endregion

        //region all day of penultimate month in 2018 пн (5.2)
        test(1, 3, 11, "Суббота");
        test(1, 5, 11, "Понедельник");
        test(1, 11, 11, "Воскресенье");
        test(1, 17, 11, "Суббота");
        test(1, 19, 11, "Понедельник");
        test(1, 23, 11, "Пятница");
        test(1, 29, 11, "Четверг");
        //endregion

        //region last day in last month of all year (6)
        test(3, 31, 12, "Среда");
        test(4, 31, 12, "Четверг");
        test(5, 31, 12, "Пятница");
        test(6, 31, 12, "Суббота");
        test(7, 31, 12, "Воскресенье");
        //endregion

        //region penultimate day in last month of all year (6.1)
        test(3, 30, 12, "Вторник");
        test(4, 30, 12, "Среда");
        test(5, 30, 12, "Четверг");
        test(6, 30, 12, "Пятница");
        test(7, 30, 12, "Суббота");
        //endregion

        //region last day in penultimate month of all year (6.2)
        test(2, 30, 11, "Суббота");
        test(3, 30, 11, "Воскресенье");
        test(4, 30, 11, "Понедельник");
        test(5, 30, 11, "Вторник");
        test(6, 30, 11, "Среда");
        test(7, 30, 11, "Четверг");
        //endregion

        //region all day of last month in 2017 вс (7)
        test(7, 1, 12, "Пятница");
        test(7, 3, 12, "Воскресенье");
        test(7, 9, 12, "Суббота");
        test(7, 11, 12, "Понедельник");
        test(7, 17, 12, "Воскресенье");
        test(7, 23, 12, "Суббота");
        test(7, 25, 12, "Понедельник");
        //endregion

        //region all day of last month in 2022 сб (7.1)
        test(6, 2, 12, "Пятница");
        test(6, 4, 12, "Воскресенье");
        test(6, 10, 12, "Суббота");
        test(6, 12, 12, "Понедельник");
        test(6, 18, 12, "Воскресенье");
        test(6, 22, 12, "Четверг");
        test(6, 26, 12, "Понедельник");
        test(6, 28, 12, "Среда");
        //endregion

        //region all day of last month in 2017 вс (7.2)
        test(7, 2, 11, "Четверг");
        test(7, 6, 11, "Понедельник");
        test(7, 8, 11, "Среда");
        test(7, 12, 11, "Воскресенье");
        test(7, 16, 11, "Четверг");
        test(7, 20, 11, "Понедельник");
        test(7, 26, 11, "Воскресенье");
        //endregion

        //region first day in last month of all year (8)
        test(3, 1, 12, "Понедельник");
        test(4, 1, 12, "Вторник");
        test(5, 1, 12, "Среда");
        //endregion

        //region second day in last month of all year (8.1)
        test(3, 2, 12, "Вторник");
        test(4, 2, 12, "Среда");
        test(5, 2, 12, "Четверг");
        //endregion

        //region first day in last month of all year (8.2)
        test(2, 1, 11, "Пятница");
        test(3, 1, 11, "Суббота");
        test(4, 1, 11, "Воскресенье");
        test(5, 1, 11, "Понедельник");
        test(6, 1, 11, "Вторник");
        //endregion

        //region last day in all month пн (9)
        test(1, 30, 4, "Понедельник");
        test(1, 31, 5, "Четверг");
        test(1, 30, 6, "Суббота");
        test(1, 31, 7, "Вторник");
        test(1, 31, 8, "Пятница");
        test(1, 30, 9, "Воскресенье");
        test(1, 31, 10, "Среда");
        //endregion

        //region penultimate day in all month пн (9.1)
        test(1, 29, 4, "Воскресенье");
        test(1, 30, 5, "Среда");
        test(1, 29, 6, "Пятница");
        test(1, 30, 7, "Понедельник");
        test(1, 30, 8, "Четверг");
        test(1, 29, 9, "Суббота");
        test(1, 30, 10, "Вторник");
        //endregion

        //region last day in all month вт (9.2)
        test(2, 30, 4, "Вторник");
        test(2, 31, 5, "Пятница");
        test(2, 30, 6, "Воскресенье");
        test(2, 31, 7, "Среда");
        test(2, 31, 8, "Суббота");
        test(2, 30, 9, "Понедельник");
        test(2, 31, 10, "Четверг");
        //endregion

        //region last day in all month вс (10)
        test(7, 30, 4, "Воскресенье");
        test(7, 31, 5, "Среда");
        test(7, 30, 6, "Пятница");
        test(7, 31, 7, "Понедельник");
        test(7, 31, 8, "Четверг");
        test(7, 30, 9, "Суббота");
        test(7, 31, 10, "Вторник");
        //endregion

        //region last day in all month сб (10.1)
        test(6, 30, 4, "Суббота");
        test(6, 31, 5, "Вторник");
        test(6, 30, 6, "Четверг");
        test(6, 31, 7, "Воскресенье");
        test(6, 31, 8, "Среда");
        test(6, 30, 9, "Пятница");
        test(6, 31, 10, "Понедельник");
        //endregion

        //region last day in all month вс (10.2)
        test(7, 29, 4, "Суббота");
        test(7, 30, 5, "Вторник");
        test(7, 29, 6, "Четверг");
        test(7, 30, 7, "Воскресенье");
        test(7, 30, 8, "Среда");
        test(7, 29, 9, "Пятница");
        test(7, 30, 10, "Понедельник");
        //endregion

        //region first day in all month вс (11)
        test(7, 1, 4, "Суббота");
        test(7, 1, 5, "Понедельник");
        test(7, 1, 6, "Четверг");
        test(7, 1, 7, "Суббота");
        test(7, 1, 8, "Вторник");
        test(7, 1, 9, "Пятница");
        test(7, 1, 10, "Воскресенье");
        //endregion

        //region second day in all month вс (11.1)
        test(7, 2, 4, "Воскресенье");
        test(7, 2, 5, "Вторник");
        test(7, 2, 6, "Пятница");
        test(7, 2, 7, "Воскресенье");
        test(7, 2, 8, "Среда");
        test(7, 2, 9, "Суббота");
        test(7, 2, 10, "Понедельник");
        //endregion

        //region first day in all month сб (11.2)
        test(6, 1, 4, "Пятница");
        test(6, 1, 5, "Воскресенье");
        test(6, 1, 6, "Среда");
        test(6, 1, 7, "Пятница");
        test(6, 1, 8, "Понедельник");
        test(6, 1, 9, "Четверг");
        test(6, 1, 10, "Суббота");
        //endregion

        //region first day in all month пн (12)
        test(1, 1, 4, "Воскресенье");
        test(1, 1, 5, "Вторник");
        test(1, 1, 6, "Пятница");
        test(1, 1, 7, "Воскресенье");
        test(1, 1, 8, "Среда");
        test(1, 1, 9, "Суббота");
        test(1, 1, 10, "Понедельник");
        //endregion

        //region first day in all month вт (12.1)
        test(2, 1, 4, "Понедельник");
        test(2, 1, 5, "Среда");
        test(2, 1, 6, "Суббота");
        test(2, 1, 7, "Понедельник");
        test(2, 1, 8, "Четверг");
        test(2, 1, 9, "Воскресенье");
        test(2, 1, 10, "Вторник");
        //endregion

        //region first day in all month пн (12.2)
        test(1, 2, 4, "Понедельник");
        test(1, 2, 5, "Среда");
        test(1, 2, 6, "Суббота");
        test(1, 2, 7, "Понедельник");
        test(1, 2, 8, "Четверг");
        test(1, 2, 9, "Воскресенье");
        test(1, 2, 10, "Вторник");
        //endregion

    }

    @Test//на выходе один день недели 2019?
    public void equivalenceClasses() throws InvalidValuesException {
        //region NY пн
        test(1, 4, 6, "Понедельник");
        test(1, 3, 9, "Понедельник");

        test(1, 28, 5, "Понедельник");
        test(1, 27, 8, "Понедельник");
        test(1, 29, 10, "Понедельник");

        test(1, 13, 8, "Понедельник");
        test(1, 14, 5, "Понедельник");
        test(1, 16, 7, "Понедельник");

        test(1, 3, 4, "Вторник");
        test(1, 3, 7, "Вторник");
        test(1, 4, 9, "Вторник");

        test(1, 29, 5, "Вторник");
        test(1, 28, 8, "Вторник");

        test(1, 14, 8, "Вторник");
        test(1, 8, 5, "Вторник");
        test(1, 24, 7, "Вторник");

        test(1, 6, 6, "Среда");
        test(1, 5, 9, "Среда");

        test(1, 27, 6, "Среда");
        test(1, 29, 8, "Среда");

        test(1, 8, 8, "Среда");
        test(1, 9, 5, "Среда");
        test(1, 19, 9, "Среда");

        test(1, 5, 4, "Четверг");
        test(1, 7, 6, "Четверг");
        test(1, 6, 9, "Четверг");

        test(1, 28, 6, "Четверг");
        test(1, 27, 9, "Четверг");

        test(1, 9, 8, "Четверг");
        test(1, 10, 5, "Четверг");
        test(1, 14, 6, "Четверг");

        test(1, 6, 4, "Пятница");
        test(1, 6, 7, "Пятница");
        test(1, 7, 9, "Пятница");

        test(1, 27, 4, "Пятница");
        test(1, 27, 7, "Пятница");
        test(1, 26, 10, "Пятница");

        test(1, 10, 8, "Пятница");
        test(1, 11, 5, "Пятница");
        test(1, 21, 9, "Пятница");

        test(1, 7, 4, "Суббота");
        test(1, 7, 7, "Суббота");
        test(1, 6, 10, "Суббота");

        test(1, 28, 4, "Суббота");
        test(1, 28, 7, "Суббота");
        test(1, 27, 10, "Суббота");

        test(1, 20, 10, "Суббота");

        test(1, 3, 6, "Воскресенье");
        test(1, 7, 10, "Воскресенье");

        test(1, 27, 5, "Воскресенье");
        test(1, 29, 7, "Воскресенье");
        test(1, 28, 10, "Воскресенье");

        test(1, 12, 8, "Воскресенье");
        test(1, 13, 5, "Воскресенье");
        test(1, 16, 9, "Воскресенье");
        //endregion

        //region NY вт
        test(2, 3, 6, "Понедельник");
        test(2, 2, 9, "Понедельник");
        test(2, 4, 11, "Понедельник");

        test(2, 27, 5, "Понедельник");
        test(2, 29, 7, "Понедельник");
        test(2, 28, 10, "Понедельник");

        test(2, 8, 4, "Понедельник");
        test(2, 15, 7, "Понедельник");
        test(2, 16, 9, "Понедельник");

        test(2, 7, 5, "Вторник");
        test(2, 2, 7, "Вторник");
        test(2, 3, 9, "Вторник");

        test(2, 28, 5, "Вторник");
        test(2, 30, 7, "Вторник");
        test(2, 26, 11, "Вторник");

        test(2, 13, 8, "Вторник");
        test(2, 14, 5, "Вторник");

        test(2, 3, 4, "Среда");
        test(2, 3, 7, "Среда");
        test(2, 4, 9, "Среда");
        test(2, 6, 11, "Среда");

        test(2, 29, 5, "Среда");
        test(2, 28, 8, "Среда");
        test(2, 30, 10, "Среда");

        test(2, 11, 9, "Среда");
        test(2, 10, 7, "Среда");
        test(2, 15, 5, "Среда");

        test(2, 2, 5, "Четверг");
        test(2, 4, 7, "Четверг");
        test(2, 3, 10, "Четверг");

        test(2, 30, 5, "Четверг");
        test(2, 26, 9, "Четверг");

        test(2, 18, 7, "Четверг");
        test(2, 10, 10, "Четверг");
        test(2, 14, 3, "Четверг");

        test(2, 3, 5, "Пятница");
        test(2, 5, 7, "Пятница");
        test(2, 6, 9, "Пятница");

        test(2, 28, 6, "Пятница");
        test(2, 30, 8, "Пятница");

        test(2, 12, 7, "Пятница");
        test(2, 15, 11, "Пятница");
        test(2, 15, 3, "Пятница");

        test(2, 4, 5, "Суббота");
        test(2, 3, 8, "Суббота");
        test(2, 5, 10, "Суббота");

        test(2, 27, 4, "Суббота");
        test(2, 29, 6, "Суббота");
        test(2, 28, 9, "Суббота");

        test(2, 19, 10, "Суббота");
        test(2, 20, 7, "Суббота");

        test(2, 2, 6, "Воскресенье");
        test(2, 4, 8, "Воскресенье");
        test(2, 3, 11, "Воскресенье");

        test(2, 26, 5, "Воскресенье");
        test(2, 25, 8, "Воскресенье");
        test(2, 27, 10, "Воскресенье");

        test(2, 20, 10, "Воскресенье");
        //endregion

        //region NY ср
        test(3, 5, 5, "Понедельник");
        test(3, 2, 6, "Понедельник");
        test(3, 4, 8, "Понедельник");
        test(3, 1, 9, "Понедельник");
        test(3, 3, 11, "Понедельник");

        test(3, 26, 5, "Понедельник");
        test(3, 28, 7, "Понедельник");
        test(3, 29, 9, "Понедельник");
        test(3, 29, 12, "Понедельник");

        test(3, 11, 8, "Понедельник");
        test(3, 12, 5, "Понедельник");
        test(3, 8, 12, "Понедельник");

        test(3, 1, 4, "Вторник");
        test(3, 1, 7, "Вторник");
        test(3, 2, 9, "Вторник");
        test(3, 4, 11, "Вторник");

        test(3, 29, 4, "Вторник");
        test(3, 27, 5, "Вторник");
        test(3, 30, 9, "Вторник");
        test(3, 28, 10, "Вторник");

        test(3, 9, 12, "Вторник");
        test(3, 21, 10, "Вторник");

        test(3, 2, 4, "Среда");
        test(3, 4, 6, "Среда");
        test(3, 2, 7, "Среда");
        test(3, 1, 10, "Среда");

        test(3, 29, 1, "Среда");
        test(3, 30, 4, "Среда");
        test(3, 30, 7, "Среда");
        test(3, 29, 10, "Среда");

        test(3, 17, 9, "Среда");
        test(3, 20, 8, "Среда");
        test(3, 14, 5, "Среда");

        test(3, 3, 4, "Четверг");
        test(3, 5, 6, "Четверг");
        test(3, 2, 10, "Четверг");
        test(3, 4, 12, "Четверг");

        test(3, 27, 3, "Четверг");
        test(3, 28, 8, "Четверг");
        test(3, 27, 11, "Четверг");

        test(3, 10, 7, "Четверг");
        test(3, 18, 12, "Четверг");
        test(3, 13, 3, "Четверг");

        test(3, 7, 2, "Пятница");
        test(3, 4, 4, "Пятница");
        test(3, 3, 10, "Пятница");
        test(3, 5, 12, "Пятница");

        test(3, 25, 4, "Пятница");
        test(3, 27, 6, "Пятница");
        test(3, 31, 10, "Пятница");
        test(3, 26, 12, "Пятница");

        test(3, 18, 7, "Пятница");
        test(3, 19, 12, "Пятница");
        test(3, 14, 3, "Пятница");

        test(3, 5, 4, "Суббота");
        test(3, 7, 6, "Суббота");
        test(3, 2, 8, "Суббота");
        test(3, 4, 10, "Суббота");

        test(3, 18, 1, "Суббота");
        test(3, 29, 3, "Суббота");
        test(3, 27, 9, "Суббота");
        test(3, 29, 11, "Суббота");

        test(3, 11, 1, "Суббота");
        test(3, 12, 4, "Суббота");
        test(3, 13, 9, "Суббота");

        test(3, 5, 1, "Воскресенье");
        test(3, 6, 7, "Воскресенье");
        test(3, 7, 9, "Воскресенье");
        test(3, 2, 11, "Воскресенье");

        test(3, 23, 2, "Воскресенье");
        test(3, 29, 6, "Воскресенье");
        test(3, 26, 10, "Воскресенье");

        test(3, 16, 3, "Воскресенье");
        test(3, 19, 10, "Воскресенье");
        //endregion

        //region NY чт
        test(4, 2, 2, "Понедельник");
        test(4, 1, 6, "Понедельник");
        test(4, 3, 8, "Понедельник");
        test(4, 7, 12, "Понедельник");

        test(4, 26, 1, "Понедельник");
        test(4, 25, 5, "Понедельник");
        test(4, 28, 9, "Понедельник");
        test(4, 28, 12, "Понедельник");

        test(4, 17, 8, "Понедельник");
        test(4, 11, 5, "Понедельник");
        test(4, 14, 12, "Понедельник");

        test(4, 3, 2, "Вторник");
        test(4, 7, 4, "Вторник");
        test(4, 4, 8, "Вторник");
        test(4, 6, 10, "Вторник");

        test(4, 27, 1, "Вторник");
        test(4, 31, 3, "Вторник");
        test(4, 28, 7, "Вторник");
        test(4, 29, 9, "Вторник");

        test(4, 15, 12, "Вторник");
        test(4, 10, 3, "Вторник");
        test(4, 20, 10, "Вторник");

        test(4, 4, 2, "Среда");
        test(4, 1, 4, "Среда");
        test(4, 2, 9, "Среда");
        test(4, 4, 11, "Среда");

        test(4, 29, 4, "Среда");
        test(4, 27, 5, "Среда");
        test(4, 30, 9, "Среда");
        test(4, 28, 10, "Среда");

        test(4, 9, 12, "Среда");
        test(4, 20, 5, "Среда");

        test(4, 2, 4, "Четверг");
        test(4, 2, 7, "Четверг");
        test(4, 1, 10, "Четверг");
        test(4, 3, 12, "Четверг");

        test(4, 29, 1, "Четверг");
        test(4, 30, 4, "Четверг");
        test(4, 27, 8, "Четверг");
        test(4, 29, 10, "Четверг");

        test(4, 17, 9, "Четверг");
        test(4, 13, 8, "Четверг");

        test(4, 3, 4, "Пятница");
        test(4, 5, 6, "Пятница");
        test(4, 4, 9, "Пятница");
        test(4, 2, 10, "Пятница");

        test(4, 29, 5, "Пятница");
        test(4, 31, 7, "Пятница");
        test(4, 28, 8, "Пятница");
        test(4, 30, 10, "Пятница");
        test(4, 27, 11, "Пятница");

        test(4, 12, 6, "Пятница");
        test(4, 11, 9, "Пятница");

        test(4, 3, 1, "Суббота");
        test(4, 4, 4, "Суббота");
        test(4, 4, 7, "Суббота");
        test(4, 3, 10, "Суббота");
        test(4, 5, 12, "Суббота");

        test(4, 28, 3, "Суббота");
        test(4, 30, 5, "Суббота");
        test(4, 26, 9, "Суббота");
        test(4, 31, 10, "Суббота");

        test(4, 17, 1, "Суббота");
        test(4, 14, 3, "Суббота");
        test(4, 19, 9, "Суббота");

        test(4, 8, 2, "Воскресенье");
        test(4, 7, 6, "Воскресенье");
        test(4, 2, 8, "Воскресенье");
        test(4, 4, 10, "Воскресенье");

        test(4, 29, 3, "Воскресенье");
        test(4, 31, 5, "Воскресенье");
        test(4, 30, 8, "Воскресенье");
        test(4, 27, 9, "Воскресенье");
        test(4, 29, 11, "Воскресенье");

        test(4, 9, 8, "Воскресенье");
        test(4, 17, 5, "Воскресенье");
        test(4, 13, 12, "Воскресенье");
        //endregion

        //region NY пт
        test(5, 4, 1, "Понедельник");
        test(5, 5, 4, "Понедельник");
        test(5, 5, 7, "Понедельник");
        test(5, 6, 9, "Понедельник");
        test(5, 6, 12, "Понедельник");

        test(5, 29, 3, "Понедельник");
        test(5, 30, 8, "Понедельник");
        test(5, 29, 11, "Понедельник");
        test(5, 27, 12, "Понедельник");

        test(5, 15, 3, "Понедельник");
        test(5, 11, 10, "Понедельник");

        test(5, 2, 2, "Вторник");
        test(5, 4, 5, "Вторник");
        test(5, 1, 6, "Вторник");
        test(5, 3, 8, "Вторник");
        test(5, 2, 11, "Вторник");

        test(5, 30, 3, "Вторник");
        test(5, 29, 6, "Вторник");
        test(5, 28, 9, "Вторник");

        test(5, 14, 12, "Вторник");
        test(5, 17, 8, "Вторник");
        test(5, 18, 5, "Вторник");

        test(5, 3, 2, "Среда");
        test(5, 7, 4, "Среда");
        test(5, 2, 6, "Среда");
        test(5, 4, 8, "Среда");
        test(5, 6, 10, "Среда");

        test(5, 31, 3, "Среда");
        test(5, 28, 4, "Среда");
        test(5, 28, 7, "Среда");
        test(5, 27, 10, "Среда");

        test(5, 8, 9, "Среда");
        test(5, 11, 8, "Среда");
        test(5, 14, 4, "Среда");

        test(5, 4, 2, "Четверг");
        test(5, 1, 4, "Четверг");
        test(5, 1, 7, "Четверг");

        test(5, 29, 4, "Четверг");
        test(5, 27, 5, "Четверг");
        test(5, 30, 9, "Четверг");
        test(5, 28, 10, "Четверг");

        test(5, 8, 7, "Четверг");
        test(5, 23, 12, "Четверг");
        test(5, 18, 3, "Четверг");

        test(5, 5, 3, "Пятница");
        test(5, 4, 6, "Пятница");
        test(5, 3, 9, "Пятница");

        test(5, 29, 1, "Пятница");
        test(5, 28, 5, "Пятница");
        test(5, 29, 10, "Пятница");

        test(5, 12, 2, "Пятница");
        test(5, 23, 7, "Пятница");
        test(5, 19, 11, "Пятница");

        test(5, 6, 3, "Суббота");
        test(5, 3, 7, "Суббота");
        test(5, 6, 11, "Суббота");

        test(5, 27, 3, "Суббота");
        test(5, 31, 7, "Суббота");
        test(5, 30, 10, "Суббота");

        test(5, 16, 1, "Суббота");
        test(5, 17, 4, "Суббота");
        test(5, 18, 9, "Суббота");

        test(5, 3, 1, "Воскресенье");
        test(5, 2, 5, "Воскресенье");
        test(5, 3, 10, "Воскресенье");

        test(5, 28, 3, "Воскресенье");
        test(5, 27, 6, "Воскресенье");
        test(5, 26, 12, "Воскресенье");

        test(5, 8, 8, "Воскресенье");
        test(5, 16, 5, "Воскресенье");
        test(5, 19, 12, "Воскресенье");
        //endregion

        //region NY сб
        test(6, 7, 3, "Понедельник");
        test(6, 3, 10, "Понедельник");
        test(6, 7, 11, "Понедельник");

        test(6, 28, 3, "Понедельник");
        test(6, 29, 8, "Понедельник");
        test(6, 28, 11, "Понедельник");

        test(6, 15, 8, "Понедельник");
        test(6, 16, 5, "Понедельник");
        test(6, 14, 11, "Понедельник");

        test(6, 5, 4, "Вторник");
        test(6, 2, 8, "Вторник");
        test(6, 4, 10, "Вторник");

        test(6, 29, 3, "Вторник");
        test(6, 26, 7, "Вторник");
        test(6, 29, 11, "Вторник");

        test(6, 16, 8, "Вторник");
        test(6, 17, 5, "Вторник");

        test(6, 2, 3, "Среда");
        test(6, 3, 8, "Среда");
        test(6, 2, 11, "Среда");

        test(6, 30, 3, "Среда");
        test(6, 27, 7, "Среда");
        test(6, 26, 10, "Среда");

        test(6, 16, 11, "Среда");
        test(6, 11, 5, "Среда");

        test(6, 3, 3, "Четверг");
        test(6, 2, 6, "Четверг");
        test(6, 3, 11, "Четверг");

        test(6, 28, 4, "Четверг");
        test(6, 28, 7, "Четверг");
        test(6, 29, 9, "Четверг");

        test(6, 14, 7, "Четверг");
        test(6, 17, 11, "Четверг");
        test(6, 17, 3, "Четверг");

        test(6, 4, 2, "Пятница");
        test(6, 5, 8, "Пятница");
        test(6, 4, 11, "Пятница");

        test(6, 29, 4, "Пятница");
        test(6, 27, 5, "Пятница");
        test(6, 28, 10, "Пятница");

        test(6, 17, 6, "Пятница");
        test(6, 9, 9, "Пятница");

        test(6, 5, 2, "Суббота");
        test(6, 4, 6, "Суббота");
        test(6, 5, 11, "Суббота");

        test(6, 28, 5, "Суббота");
        test(6, 30, 7, "Суббота");
        test(6, 29, 10, "Суббота");

        test(6, 19, 3, "Суббота");
        test(6, 16, 4, "Суббота");
        test(6, 17, 9, "Суббота");

        test(6, 3, 4, "Воскресенье");
        test(6, 3, 7, "Воскресенье");
        test(6, 2, 10, "Воскресенье");

        test(6, 27, 2, "Воскресенье");
        test(6, 28, 8, "Воскресенье");
        test(6, 30, 10, "Воскресенье");

        test(6, 13, 3, "Воскресенье");
        test(6, 16, 10, "Воскресенье");
        //endregion

        //region NY вс
        test(7, 3, 4, "Понедельник");
        test(7, 3, 7, "Понедельник");
        test(7, 4, 9, "Понедельник");

        test(7, 27, 3, "Понедельник");
        test(7, 29, 5, "Понедельник");
        test(7, 28, 8, "Понедельник");

        test(7, 14, 8, "Понедельник");
        test(7, 15, 5, "Понедельник");
        test(7, 12, 6, "Понедельник");

        test(7, 4, 4, "Вторник");
        test(7, 4, 7, "Вторник");
        test(7, 3, 10, "Вторник");

        test(7, 28, 3, "Вторник");
        test(7, 27, 6, "Вторник");
        test(7, 29, 8, "Вторник");

        test(7, 17, 10, "Вторник");
        test(7, 16, 5, "Вторник");

        test(7, 5, 4, "Среда");
        test(7, 9, 8, "Среда");
        test(7, 4, 10, "Среда");

        test(7, 29, 3, "Среда");
        test(7, 27, 9, "Среда");
        test(7, 25, 10, "Среда");

        test(7, 15, 3, "Среда");
        test(7, 9, 8, "Среда");
        test(7, 12, 4, "Среда");

        test(7, 4, 5, "Четверг");
        test(7, 6, 7, "Четверг");
        test(7, 5, 10, "Четверг");

        test(7, 27, 4, "Четверг");
        test(7, 27, 7, "Четверг");
        test(7, 28, 9, "Четверг");

        test(7, 8, 6, "Четверг");
        test(7, 14, 9, "Четверг");
        test(7, 16, 3, "Четверг");

        test(7, 3, 3, "Пятница");
        test(7, 5, 5, "Пятница");
        test(7, 4, 8, "Пятница");

        test(7, 28, 4, "Пятница");
        test(7, 28, 7, "Пятница");
        test(7, 27, 10, "Пятница");

        test(7, 24, 3, "Пятница");
        test(7, 9, 6, "Пятница");
        test(7, 22, 9, "Пятница");

        test(7, 4, 3, "Суббота");
        test(7, 10, 6, "Суббота");
        test(7, 7, 10, "Суббота");

        test(7, 27, 5, "Суббота");
        test(7, 28, 10, "Суббота");

        test(7, 18, 3, "Суббота");
        test(7, 15, 4, "Суббота");
        test(7, 16, 9, "Суббота");

        test(7, 5, 3, "Воскресенье");
        test(7, 4, 6, "Воскресенье");
        test(7, 3, 9, "Воскресенье");

        test(7, 28, 5, "Воскресенье");
        test(7, 27, 8, "Воскресенье");
        test(7, 29, 10, "Воскресенье");

        test(7, 9, 7, "Воскресенье");
        test(7, 14, 5, "Воскресенье");
        //endregion
    }

    @Test//праздники в разные года
    public void subjectArea() throws InvalidValuesException {
        test(5, 28, 6, "Понедельник");
        test(6, 8, 3, "Вторник");
        test(4, 7, 1, "Среда");
        test(2, 9, 5, "Четверг");
        test(3, 9, 5, "Пятница");
        test(7, 14, 10, "Суббота");
        test(1, 14, 10, "Воскресенье");

    }

    @Test//НГ в субботу или воскресенье
    public void implementation() throws InvalidValuesException {
        test(1, 8, 4, "Воскресенье");
        test(1, 10, 6, "Воскресенье");
        test(1, 22, 7, "Воскресенье");

        test(6, 12, 2, "Суббота");
        test(6, 14, 5, "Суббота");
        test(6, 9, 7, "Суббота");
        test(6, 10, 9, "Суббота");
        test(6, 19, 11, "Суббота");

        test(7, 9, 4, "Воскресенье");
        test(7, 11, 6, "Воскресенье");
        test(7, 13, 8, "Воскресенье");
        test(7, 8, 10, "Воскресенье");
    }

    @Test//любые дни
    public void randomValues() throws InvalidValuesException {
        test(3, 16, 6, "Понедельник");
        test(2, 11, 6, "Вторник");
        test(7, 19, 4, "Среда");
        test(1, 12, 4, "Четверг");
        test(4, 18, 12, "Пятница");
        test(5, 9, 1, "Суббота");
        test(6, 17, 4, "Воскресенье");
    }

    @Test//чьи-то др
    public void otherSpecialMeanings() throws InvalidValuesException {
        test(1, 11, 7, "Среда");
        test(1, 20, 4, "Пятница");

        test(2, 11, 7, "Четверг");
        test(2, 11, 11, "Понедельник");
        test(2, 20, 4, "Суббота");

        test(3, 12, 12, "Пятница");
        test(3, 11, 11, "Вторник");
        test(3, 29, 7, "Вторник");

        test(4, 11, 7, "Суббота");
        test(4, 29, 7, "Среда");
        test(4, 3, 6, "Среда");

        test(5, 12, 12, "Воскресенье");
        test(5, 25, 1, "Понедельник");
        test(5, 28, 1, "Четверг");

        test(6, 11, 7, "Понедельник");
        test(6, 3, 6, "Пятница");

        test(7, 11, 11, "Суббота");
        test(7, 29, 7, "Суббота");
    }

    private void test(int newYearDay, int day, int month, String expectedDay) throws InvalidValuesException {
        String data = newYearDay + " " + day + " " + month;
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String expectedResult = expectedDay + "\r\n";

        Main.main(new String[]{});
        String actualResult = outputStream.toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    private void exceptionTest(int newYearDay, int day, int month)  {
        try {
            String data = newYearDay + " " + day + " " + month;
            InputStream inputStream = new ByteArrayInputStream(data.getBytes());
            System.setIn(inputStream);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);

            Main.main(new String[]{});
        }catch (InvalidValuesException ex){
            Assert.assertEquals("Вы ввели невалидное значение", ex.getMessage());
        }
    }
}

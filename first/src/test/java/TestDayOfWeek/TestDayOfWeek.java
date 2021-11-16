package TestDayOfWeek;

import DayOfWeek.Year;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDayOfWeek {

    Year year;

    private final int[] dayInMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] nameOfDayOfTheWeek = new String[]{"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};


    @Before
    public void createObject() {
        year = new Year();
    }

    @Test
    public void boundaryValuesTest() {

        //region all day of first month in 2018 пн (1)
        test(1, 1, 1, "Понедельник");
        test(1, 2, 1, "Вторник");
        test(1, 3, 1, "Среда");
        test(1, 4, 1, "Четверг");
        test(1, 5, 1, "Пятница");
        test(1, 6, 1, "Суббота");
        test(1, 7, 1, "Воскресенье");
        test(1, 8, 1, "Понедельник");
        test(1, 9, 1, "Вторник");
        test(1, 10, 1, "Среда");
        test(1, 11, 1, "Четверг");
        test(1, 12, 1, "Пятница");
        test(1, 13, 1, "Суббота");
        test(1, 14, 1, "Воскресенье");
        test(1, 15, 1, "Понедельник");
        test(1, 16, 1, "Вторник");
        test(1, 17, 1, "Среда");
        test(1, 18, 1, "Четверг");
        test(1, 19, 1, "Пятница");
        test(1, 20, 1, "Суббота");
        test(1, 21, 1, "Воскресенье");
        test(1, 22, 1, "Понедельник");
        test(1, 23, 1, "Вторник");
        test(1, 24, 1, "Среда");
        test(1, 25, 1, "Четверг");
        test(1, 26, 1, "Пятница");
        test(1, 27, 1, "Суббота");
        test(1, 28, 1, "Воскресенье");
        test(1, 29, 1, "Понедельник");
        test(1, 30, 1, "Вторник");
        test(1, 31, 1, "Среда");
        //endregion(1

        //region all day of first month in 2019 вт (1.1)
        test(2, 1, 1, "Вторник");
        test(2, 2, 1, "Среда");
        test(2, 3, 1, "Четверг");
        test(2, 4, 1, "Пятница");
        test(2, 5, 1, "Суббота");
        test(2, 6, 1, "Воскресенье");
        test(2, 7, 1, "Понедельник");
        test(2, 8, 1, "Вторник");
        test(2, 9, 1, "Среда");
        test(2, 10, 1, "Четверг");
        test(2, 11, 1, "Пятница");
        test(2, 12, 1, "Суббота");
        test(2, 13, 1, "Воскресенье");
        test(2, 14, 1, "Понедельник");
        test(2, 15, 1, "Вторник");
        test(2, 16, 1, "Среда");
        test(2, 17, 1, "Четверг");
        test(2, 18, 1, "Пятница");
        test(2, 19, 1, "Суббота");
        test(2, 20, 1, "Воскресенье");
        test(2, 21, 1, "Понедельник");
        test(2, 22, 1, "Вторник");
        test(2, 23, 1, "Среда");
        test(2, 24, 1, "Четверг");
        test(2, 25, 1, "Пятница");
        test(2, 26, 1, "Суббота");
        test(2, 27, 1, "Воскресенье");
        test(2, 28, 1, "Понедельник");
        test(2, 29, 1, "Вторник");
        test(2, 30, 1, "Среда");
        test(2, 31, 1, "Четверг");
        //endregion(1

        //region all day of second month 2019 пн (1.2)
        test(1, 1, 2, "Четверг");
        test(1, 2, 2, "Пятница");
        test(1, 3, 2, "Суббота");
        test(1, 4, 2, "Воскресенье");
        test(1, 5, 2, "Понедельник");
        test(1, 6, 2, "Вторник");
        test(1, 7, 2, "Среда");
        test(1, 8, 2, "Четверг");
        test(1, 9, 2, "Пятница");
        test(1, 10, 2, "Суббота");
        test(1, 11, 2, "Воскресенье");
        test(1, 12, 2, "Понедельник");
        test(1, 13, 2, "Вторник");
        test(1, 14, 2, "Среда");
        test(1, 15, 2, "Четверг");
        test(1, 16, 2, "Пятница");
        test(1, 17, 2, "Суббота");
        test(1, 18, 2, "Воскресенье");
        test(1, 19, 2, "Понедельник");
        test(1, 20, 2, "Вторник");
        test(1, 21, 2, "Среда");
        test(1, 22, 2, "Четверг");
        test(1, 23, 2, "Пятница");
        test(1, 24, 2, "Суббота");
        test(1, 25, 2, "Воскресенье");
        test(1, 26, 2, "Понедельник");
        test(1, 27, 2, "Вторник");
        test(1, 28, 2, "Среда");
        test(1, 29, 2, "Четверг");
        test(1, 30, 2, "Пятница");
        test(1, 31, 2, "Суббота");
        //endregion

        //region last day in first month of all year (2)
        test(1, 31, 1, "Среда");
        test(2, 31, 1, "Четверг");
        test(3, 31, 1, "Пятница");
        test(4, 31, 1, "Суббота");
        test(5, 31, 1, "Воскресенье");
        test(6, 31, 1, "Понедельник");
        test(7, 31, 1, "Вторник");
        //endregion

        //region penultimate day in first month of all year (2.1)
        test(1, 30, 1, "Вторник");
        test(2, 30, 1, "Среда");
        test(3, 30, 1, "Четверг");
        test(4, 30, 1, "Пятница");
        test(5, 30, 1, "Суббота");
        test(6, 30, 1, "Воскресенье");
        test(7, 30, 1, "Понедельник");
        //endregion

        //region last day in second month of all year (2.2)
        test(1, 28, 2, "Среда");
        test(2, 28, 2, "Четверг");
        test(3, 28, 2, "Пятница");
        test(4, 28, 2, "Суббота");
        test(5, 28, 2, "Воскресенье");
        test(6, 28, 2, "Понедельник");
        test(7, 28, 2, "Вторник");
        //endregion

        //region all day of first month in 2017 вс (3)
        test(7, 1, 1, "Воскресенье");
        test(7, 2, 1, "Понедельник");
        test(7, 3, 1, "Вторник");
        test(7, 4, 1, "Среда");
        test(7, 5, 1, "Четверг");
        test(7, 6, 1, "Пятница");
        test(7, 7, 1, "Суббота");
        test(7, 8, 1, "Воскресенье");
        test(7, 9, 1, "Понедельник");
        test(7, 10, 1, "Вторник");
        test(7, 11, 1, "Среда");
        test(7, 12, 1, "Четверг");
        test(7, 13, 1, "Пятница");
        test(7, 14, 1, "Суббота");
        test(7, 15, 1, "Воскресенье");
        test(7, 16, 1, "Понедельник");
        test(7, 17, 1, "Вторник");
        test(7, 18, 1, "Среда");
        test(7, 19, 1, "Четверг");
        test(7, 20, 1, "Пятница");
        test(7, 21, 1, "Суббота");
        test(7, 22, 1, "Воскресенье");
        test(7, 23, 1, "Понедельник");
        test(7, 24, 1, "Вторник");
        test(7, 25, 1, "Среда");
        test(7, 26, 1, "Четверг");
        test(7, 27, 1, "Пятница");
        test(7, 28, 1, "Суббота");
        test(7, 29, 1, "Воскресенье");
        test(7, 30, 1, "Понедельник");
        test(7, 31, 1, "Вторник");
        //endregion

        //region all day of first month in 2022 сб (3.1)
        test(6, 1, 1, "Суббота");
        test(6, 2, 1, "Воскресенье");
        test(6, 3, 1, "Понедельник");
        test(6, 4, 1, "Вторник");
        test(6, 5, 1, "Среда");
        test(6, 6, 1, "Четверг");
        test(6, 7, 1, "Пятница");
        test(6, 8, 1, "Суббота");
        test(6, 9, 1, "Воскресенье");
        test(6, 10, 1, "Понедельник");
        test(6, 11, 1, "Вторник");
        test(6, 12, 1, "Среда");
        test(6, 13, 1, "Четверг");
        test(6, 14, 1, "Пятница");
        test(6, 15, 1, "Суббота");
        test(6, 16, 1, "Воскресенье");
        test(6, 17, 1, "Понедельник");
        test(6, 18, 1, "Вторник");
        test(6, 19, 1, "Среда");
        test(6, 20, 1, "Четверг");
        test(6, 21, 1, "Пятница");
        test(6, 22, 1, "Суббота");
        test(6, 23, 1, "Воскресенье");
        test(6, 24, 1, "Понедельник");
        test(6, 25, 1, "Вторник");
        test(6, 26, 1, "Среда");
        test(6, 27, 1, "Четверг");
        test(6, 28, 1, "Пятница");
        test(6, 29, 1, "Суббота");
        test(6, 30, 1, "Воскресенье");
        test(6, 31, 1, "Понедельник");
        //endregion

        //region all day of second month in 2017 вс (3.2)
        test(7, 1, 2, "Среда");
        test(7, 2, 2, "Четверг");
        test(7, 3, 2, "Пятница");
        test(7, 4, 2, "Суббота");
        test(7, 5, 2, "Воскресенье");
        test(7, 6, 2, "Понедельник");
        test(7, 7, 2, "Вторник");
        test(7, 8, 2, "Среда");
        test(7, 9, 2, "Четверг");
        test(7, 10, 2, "Пятница");
        test(7, 11, 2, "Суббота");
        test(7, 12, 2, "Воскресенье");
        test(7, 13, 2, "Понедельник");
        test(7, 14, 2, "Вторник");
        test(7, 15, 2, "Среда");
        test(7, 16, 2, "Четверг");
        test(7, 17, 2, "Пятница");
        test(7, 18, 2, "Суббота");
        test(7, 19, 2, "Воскресенье");
        test(7, 20, 2, "Понедельник");
        test(7, 21, 2, "Вторник");
        test(7, 22, 2, "Среда");
        test(7, 23, 2, "Четверг");
        test(7, 24, 2, "Пятница");
        test(7, 25, 2, "Суббота");
        test(7, 26, 2, "Воскресенье");
        test(7, 27, 2, "Понедельник");
        test(7, 28, 2, "Вторник");
        test(7, 29, 2, "Среда");
        test(7, 30, 2, "Четверг");
        test(7, 31, 2, "Пятница");
        //endregion

        //region first day in first month of all year (4)
        test(1, 1, 1, "Понедельник");
        test(2, 1, 1, "Вторник");
        test(3, 1, 1, "Среда");
        test(4, 1, 1, "Четверг");
        test(5, 1, 1, "Пятница");
        test(6, 1, 1, "Суббота");
        test(7, 1, 1, "Воскресенье");
        //endregion

        //region second day in first month of all year (4.1)
        test(1, 2, 1, "Вторник");
        test(2, 2, 1, "Среда");
        test(3, 2, 1, "Четверг");
        test(4, 2, 1, "Пятница");
        test(5, 2, 1, "Суббота");
        test(6, 2, 1, "Воскресенье");
        test(7, 2, 1, "Понедельник");
        //endregion

        //region first day in second month of all year (4.2)
        test(1, 1, 2, "Четверг");
        test(2, 1, 2, "Пятница");
        test(3, 1, 2, "Суббота");
        test(4, 1, 2, "Воскресенье");
        test(5, 1, 2, "Понедельник");
        test(6, 1, 2, "Вторник");
        test(7, 1, 2, "Среда");
        //endregion

        //region all day of last month in 2018 пн (5)
        test(1, 1, 12, "Суббота");
        test(1, 2, 12, "Воскресенье");
        test(1, 3, 12, "Понедельник");
        test(1, 4, 12, "Вторник");
        test(1, 5, 12, "Среда");
        test(1, 6, 12, "Четверг");
        test(1, 7, 12, "Пятница");
        test(1, 8, 12, "Суббота");
        test(1, 9, 12, "Воскресенье");
        test(1, 10, 12, "Понедельник");
        test(1, 11, 12, "Вторник");
        test(1, 12, 12, "Среда");
        test(1, 13, 12, "Четверг");
        test(1, 14, 12, "Пятница");
        test(1, 15, 12, "Суббота");
        test(1, 16, 12, "Воскресенье");
        test(1, 17, 12, "Понедельник");
        test(1, 18, 12, "Вторник");
        test(1, 19, 12, "Среда");
        test(1, 20, 12, "Четверг");
        test(1, 21, 12, "Пятница");
        test(1, 22, 12, "Суббота");
        test(1, 23, 12, "Воскресенье");
        test(1, 24, 12, "Понедельник");
        test(1, 25, 12, "Вторник");
        test(1, 26, 12, "Среда");
        test(1, 27, 12, "Четверг");
        test(1, 28, 12, "Пятница");
        test(1, 29, 12, "Суббота");
        test(1, 30, 12, "Воскресенье");
        test(1, 31, 12, "Понедельник");
        //endregion

        //region all day of last month in 2019 вт (5.1)
        test(2, 1, 12, "Воскресенье");
        test(2, 2, 12, "Понедельник");
        test(2, 3, 12, "Вторник");
        test(2, 4, 12, "Среда");
        test(2, 5, 12, "Четверг");
        test(2, 6, 12, "Пятница");
        test(2, 7, 12, "Суббота");
        test(2, 8, 12, "Воскресенье");
        test(2, 9, 12, "Понедельник");
        test(2, 10, 12, "Вторник");
        test(2, 11, 12, "Среда");
        test(2, 12, 12, "Четверг");
        test(2, 13, 12, "Пятница");
        test(2, 14, 12, "Суббота");
        test(2, 15, 12, "Воскресенье");
        test(2, 16, 12, "Понедельник");
        test(2, 17, 12, "Вторник");
        test(2, 18, 12, "Среда");
        test(2, 19, 12, "Четверг");
        test(2, 20, 12, "Пятница");
        test(2, 21, 12, "Суббота");
        test(2, 22, 12, "Воскресенье");
        test(2, 23, 12, "Понедельник");
        test(2, 24, 12, "Вторник");
        test(2, 25, 12, "Среда");
        test(2, 26, 12, "Четверг");
        test(2, 27, 12, "Пятница");
        test(2, 28, 12, "Суббота");
        test(2, 29, 12, "Воскресенье");
        test(2, 30, 12, "Понедельник");
        test(2, 31, 12, "Вторник");
        //endregion

        //region all day of penultimate month in 2018 пн (5.2)
        test(1, 1, 11, "Четверг");
        test(1, 2, 11, "Пятница");
        test(1, 3, 11, "Суббота");
        test(1, 4, 11, "Воскресенье");
        test(1, 5, 11, "Понедельник");
        test(1, 6, 11, "Вторник");
        test(1, 7, 11, "Среда");
        test(1, 8, 11, "Четверг");
        test(1, 9, 11, "Пятница");
        test(1, 10, 11, "Суббота");
        test(1, 11, 11, "Воскресенье");
        test(1, 12, 11, "Понедельник");
        test(1, 13, 11, "Вторник");
        test(1, 14, 11, "Среда");
        test(1, 15, 11, "Четверг");
        test(1, 16, 11, "Пятница");
        test(1, 17, 11, "Суббота");
        test(1, 18, 11, "Воскресенье");
        test(1, 19, 11, "Понедельник");
        test(1, 20, 11, "Вторник");
        test(1, 21, 11, "Среда");
        test(1, 22, 11, "Четверг");
        test(1, 23, 11, "Пятница");
        test(1, 24, 11, "Суббота");
        test(1, 25, 11, "Воскресенье");
        test(1, 26, 11, "Понедельник");
        test(1, 27, 11, "Вторник");
        test(1, 28, 11, "Среда");
        test(1, 29, 11, "Четверг");
        test(1, 30, 11, "Пятница");
        //endregion

        //region last day in last month of all year (6)
        test(1, 31, 12, "Понедельник");
        test(2, 31, 12, "Вторник");
        test(3, 31, 12, "Среда");
        test(4, 31, 12, "Четверг");
        test(5, 31, 12, "Пятница");
        test(6, 31, 12, "Суббота");
        test(7, 31, 12, "Воскресенье");
        //endregion

        //region penultimate day in last month of all year (6.1)
        test(1, 30, 12, "Воскресенье");
        test(2, 30, 12, "Понедельник");
        test(3, 30, 12, "Вторник");
        test(4, 30, 12, "Среда");
        test(5, 30, 12, "Четверг");
        test(6, 30, 12, "Пятница");
        test(7, 30, 12, "Суббота");
        //endregion

        //region last day in penultimate month of all year (6.2)
        test(1, 30, 11, "Пятница");
        test(2, 30, 11, "Суббота");
        test(3, 30, 11, "Воскресенье");
        test(4, 30, 11, "Понедельник");
        test(5, 30, 11, "Вторник");
        test(6, 30, 11, "Среда");
        test(7, 30, 11, "Четверг");
        //endregion

        //region all day of last month in 2017 вс (7)
        test(7, 1, 12, "Пятница");
        test(7, 2, 12, "Суббота");
        test(7, 3, 12, "Воскресенье");
        test(7, 4, 12, "Понедельник");
        test(7, 5, 12, "Вторник");
        test(7, 6, 12, "Среда");
        test(7, 7, 12, "Четверг");
        test(7, 8, 12, "Пятница");
        test(7, 9, 12, "Суббота");
        test(7, 10, 12, "Воскресенье");
        test(7, 11, 12, "Понедельник");
        test(7, 12, 12, "Вторник");
        test(7, 13, 12, "Среда");
        test(7, 14, 12, "Четверг");
        test(7, 15, 12, "Пятница");
        test(7, 16, 12, "Суббота");
        test(7, 17, 12, "Воскресенье");
        test(7, 18, 12, "Понедельник");
        test(7, 19, 12, "Вторник");
        test(7, 20, 12, "Среда");
        test(7, 21, 12, "Четверг");
        test(7, 22, 12, "Пятница");
        test(7, 23, 12, "Суббота");
        test(7, 24, 12, "Воскресенье");
        test(7, 25, 12, "Понедельник");
        test(7, 26, 12, "Вторник");
        test(7, 27, 12, "Среда");
        test(7, 28, 12, "Четверг");
        test(7, 29, 12, "Пятница");
        test(7, 30, 12, "Суббота");
        test(7, 31, 12, "Воскресенье");
        //endregion

        //region all day of last month in 2022 сб (7.1)
        test(6, 1, 12, "Четверг");
        test(6, 2, 12, "Пятница");
        test(6, 3, 12, "Суббота");
        test(6, 4, 12, "Воскресенье");
        test(6, 5, 12, "Понедельник");
        test(6, 6, 12, "Вторник");
        test(6, 7, 12, "Среда");
        test(6, 8, 12, "Четверг");
        test(6, 9, 12, "Пятница");
        test(6, 10, 12, "Суббота");
        test(6, 11, 12, "Воскресенье");
        test(6, 12, 12, "Понедельник");
        test(6, 13, 12, "Вторник");
        test(6, 14, 12, "Среда");
        test(6, 15, 12, "Четверг");
        test(6, 16, 12, "Пятница");
        test(6, 17, 12, "Суббота");
        test(6, 18, 12, "Воскресенье");
        test(6, 19, 12, "Понедельник");
        test(6, 20, 12, "Вторник");
        test(6, 21, 12, "Среда");
        test(6, 22, 12, "Четверг");
        test(6, 23, 12, "Пятница");
        test(6, 24, 12, "Суббота");
        test(6, 25, 12, "Воскресенье");
        test(6, 26, 12, "Понедельник");
        test(6, 27, 12, "Вторник");
        test(6, 28, 12, "Среда");
        test(6, 29, 12, "Четверг");
        test(6, 30, 12, "Пятница");
        test(6, 31, 12, "Суббота");
        //endregion

        //region all day of last month in 2017 вс (7.2)
        test(7, 1, 11, "Среда");
        test(7, 2, 11, "Четверг");
        test(7, 3, 11, "Пятница");
        test(7, 4, 11, "Суббота");
        test(7, 5, 11, "Воскресенье");
        test(7, 6, 11, "Понедельник");
        test(7, 7, 11, "Вторник");
        test(7, 8, 11, "Среда");
        test(7, 9, 11, "Четверг");
        test(7, 10, 11, "Пятница");
        test(7, 11, 11, "Суббота");
        test(7, 12, 11, "Воскресенье");
        test(7, 13, 11, "Понедельник");
        test(7, 14, 11, "Вторник");
        test(7, 15, 11, "Среда");
        test(7, 16, 11, "Четверг");
        test(7, 17, 11, "Пятница");
        test(7, 18, 11, "Суббота");
        test(7, 19, 11, "Воскресенье");
        test(7, 20, 11, "Понедельник");
        test(7, 21, 11, "Вторник");
        test(7, 22, 11, "Среда");
        test(7, 23, 11, "Четверг");
        test(7, 24, 11, "Пятница");
        test(7, 25, 11, "Суббота");
        test(7, 26, 11, "Воскресенье");
        test(7, 27, 11, "Понедельник");
        test(7, 28, 11, "Вторник");
        test(7, 29, 11, "Среда");
        test(7, 30, 11, "Четверг");
        //endregion

        //region first day in last month of all year (8)
        test(1, 1, 12, "Суббота");
        test(2, 1, 12, "Воскресенье");
        test(3, 1, 12, "Понедельник");
        test(4, 1, 12, "Вторник");
        test(5, 1, 12, "Среда");
        test(6, 1, 12, "Четверг");
        test(7, 1, 12, "Пятница");
        //endregion

        //region second day in last month of all year (8.1)
        test(1, 2, 12, "Воскресенье");
        test(2, 2, 12, "Понедельник");
        test(3, 2, 12, "Вторник");
        test(4, 2, 12, "Среда");
        test(5, 2, 12, "Четверг");
        test(6, 2, 12, "Пятница");
        test(7, 2, 12, "Суббота");
        //endregion

        //region first day in last month of all year (8.2)
        test(1, 1, 11, "Четверг");
        test(2, 1, 11, "Пятница");
        test(3, 1, 11, "Суббота");
        test(4, 1, 11, "Воскресенье");
        test(5, 1, 11, "Понедельник");
        test(6, 1, 11, "Вторник");
        test(7, 1, 11, "Среда");
        //endregion

        //region last day in all month пн (9)
        test(1, 31, 1, "Среда");
        test(1, 28, 2, "Среда");
        test(1, 31, 3, "Суббота");
        test(1, 30, 4, "Понедельник");
        test(1, 31, 5, "Четверг");
        test(1, 30, 6, "Суббота");
        test(1, 31, 7, "Вторник");
        test(1, 31, 8, "Пятница");
        test(1, 30, 9, "Воскресенье");
        test(1, 31, 10, "Среда");
        test(1, 30, 11, "Пятница");
        test(1, 31, 12, "Понедельник");
        //endregion

        //region penultimate day in all month пн (9.1)
        test(1, 30, 1, "Вторник");
        test(1, 27, 2, "Вторник");
        test(1, 30, 3, "Пятница");
        test(1, 29, 4, "Воскресенье");
        test(1, 30, 5, "Среда");
        test(1, 29, 6, "Пятница");
        test(1, 30, 7, "Понедельник");
        test(1, 30, 8, "Четверг");
        test(1, 29, 9, "Суббота");
        test(1, 30, 10, "Вторник");
        test(1, 29, 11, "Четверг");
        test(1, 30, 12, "Воскресенье");
        //endregion

        //region last day in all month вт (9.2)
        test(2, 31, 1, "Четверг");
        test(2, 28, 2, "Четверг");
        test(2, 31, 3, "Воскресенье");
        test(2, 30, 4, "Вторник");
        test(2, 31, 5, "Пятница");
        test(2, 30, 6, "Воскресенье");
        test(2, 31, 7, "Среда");
        test(2, 31, 8, "Суббота");
        test(2, 30, 9, "Понедельник");
        test(2, 31, 10, "Четверг");
        test(2, 30, 11, "Суббота");
        test(2, 31, 12, "Вторник");
        //endregion

        //region last day in all month вс (10)
        test(7, 31, 1, "Вторник");
        test(7, 28, 2, "Вторник");
        test(7, 31, 3, "Пятница");
        test(7, 30, 4, "Воскресенье");
        test(7, 31, 5, "Среда");
        test(7, 30, 6, "Пятница");
        test(7, 31, 7, "Понедельник");
        test(7, 31, 8, "Четверг");
        test(7, 30, 9, "Суббота");
        test(7, 31, 10, "Вторник");
        test(7, 30, 11, "Четверг");
        test(7, 31, 12, "Воскресенье");
        //endregion

        //region last day in all month сб (10.1)
        test(6, 31, 1, "Понедельник");
        test(6, 28, 2, "Понедельник");
        test(6, 31, 3, "Четверг");
        test(6, 30, 4, "Суббота");
        test(6, 31, 5, "Вторник");
        test(6, 30, 6, "Четверг");
        test(6, 31, 7, "Воскресенье");
        test(6, 31, 8, "Среда");
        test(6, 30, 9, "Пятница");
        test(6, 31, 10, "Понедельник");
        test(6, 30, 11, "Среда");
        test(6, 31, 12, "Суббота");
        //endregion

        //region last day in all month вс (10.2)
        test(7, 30, 1, "Понедельник");
        test(7, 27, 2, "Понедельник");
        test(7, 30, 3, "Четверг");
        test(7, 29, 4, "Суббота");
        test(7, 30, 5, "Вторник");
        test(7, 29, 6, "Четверг");
        test(7, 30, 7, "Воскресенье");
        test(7, 30, 8, "Среда");
        test(7, 29, 9, "Пятница");
        test(7, 30, 10, "Понедельник");
        test(7, 29, 11, "Среда");
        test(7, 30, 12, "Суббота");
        //endregion

        //region first day in all month вс (11)
        test(7, 1, 1, "Воскресенье");
        test(7, 1, 2, "Среда");
        test(7, 1, 3, "Среда");
        test(7, 1, 4, "Суббота");
        test(7, 1, 5, "Понедельник");
        test(7, 1, 6, "Четверг");
        test(7, 1, 7, "Суббота");
        test(7, 1, 8, "Вторник");
        test(7, 1, 9, "Пятница");
        test(7, 1, 10, "Воскресенье");
        test(7, 1, 11, "Среда");
        test(7, 1, 12, "Пятница");
        //endregion

        //region second day in all month вс (11)
        test(7, 2, 1, "Понедельник");
        test(7, 2, 2, "Четверг");
        test(7, 2, 3, "Четверг");
        test(7, 2, 4, "Воскресенье");
        test(7, 2, 5, "Вторник");
        test(7, 2, 6, "Пятница");
        test(7, 2, 7, "Воскресенье");
        test(7, 2, 8, "Среда");
        test(7, 2, 9, "Суббота");
        test(7, 2, 10, "Понедельник");
        test(7, 2, 11, "Четверг");
        test(7, 2, 12, "Суббота");
        //endregion

        //region first day in all month сб (11)
        test(6, 1, 1, "Суббота");
        test(6, 1, 2, "Вторник");
        test(6, 1, 3, "Вторник");
        test(6, 1, 4, "Пятница");
        test(6, 1, 5, "Воскресенье");
        test(6, 1, 6, "Среда");
        test(6, 1, 7, "Пятница");
        test(6, 1, 8, "Понедельник");
        test(6, 1, 9, "Четверг");
        test(6, 1, 10, "Суббота");
        test(6, 1, 11, "Вторник");
        test(6, 1, 12, "Четверг");
        //endregion

        //region first day in all month пн (12)
        test(1, 1, 1, "Понедельник");
        test(1, 1, 2, "Четверг");
        test(1, 1, 3, "Четверг");
        test(1, 1, 4, "Воскресенье");
        test(1, 1, 5, "Вторник");
        test(1, 1, 6, "Пятница");
        test(1, 1, 7, "Воскресенье");
        test(1, 1, 8, "Среда");
        test(1, 1, 9, "Суббота");
        test(1, 1, 10, "Понедельник");
        test(1, 1, 11, "Четверг");
        test(1, 1, 12, "Суббота");
        //endregion

        //region first day in all month вт (12.1)
        test(2, 1, 1, "Вторник");
        test(2, 1, 2, "Пятница");
        test(2, 1, 3, "Пятница");
        test(2, 1, 4, "Понедельник");
        test(2, 1, 5, "Среда");
        test(2, 1, 6, "Суббота");
        test(2, 1, 7, "Понедельник");
        test(2, 1, 8, "Четверг");
        test(2, 1, 9, "Воскресенье");
        test(2, 1, 10, "Вторник");
        test(2, 1, 11, "Пятница");
        test(2, 1, 12, "Воскресенье");
        //endregion

        //region first day in all month пн (12.2)
        test(1, 2, 1, "Вторник");
        test(1, 2, 2, "Пятница");
        test(1, 2, 3, "Пятница");
        test(1, 2, 4, "Понедельник");
        test(1, 2, 5, "Среда");
        test(1, 2, 6, "Суббота");
        test(1, 2, 7, "Понедельник");
        test(1, 2, 8, "Четверг");
        test(1, 2, 9, "Воскресенье");
        test(1, 2, 10, "Вторник");
        test(1, 2, 11, "Пятница");
        test(1, 2, 12, "Воскресенье");
        //endregion

    }

    @Test//на выходе один день недели 2019?
    public void equivalenceClasses() {
        //region NY пн
        test(1, 1, 1, "Понедельник");
        test(1, 1, 10, "Понедельник");
        test(1, 2, 4, "Понедельник");
        test(1, 2, 7, "Понедельник");
        test(1, 3, 12, "Понедельник");

        test(1, 28, 5, "Понедельник");
        test(1, 29, 1, "Понедельник");
        test(1, 29, 10, "Понедельник");
        test(1, 30, 4, "Понедельник");
        test(1, 30, 7, "Понедельник");

        test(1, 6, 8, "Понедельник");
        //endregion

        //region NY вт
        test(1, 2, 1, "Вторник");
        test(1, 2, 10, "Вторник");
        test(1, 3, 4, "Вторник");
        test(1, 3, 7, "Вторник");
        test(1, 4, 12, "Вторник");

        test(1, 29, 5, "Вторник");
        test(1, 30, 1, "Вторник");
        test(1, 30, 10, "Вторник");
        test(1, 31, 4, "Вторник");
        test(1, 31, 7, "Вторник");

        test(1, 7, 8, "Вторник");
        //endregion

        //region NY ср
        test(1, 3, 1, "Среда");
        test(1, 3, 10, "Среда");
        test(1, 5, 4, "Среда");
        test(1, 5, 7, "Среда");
        test(1, 6, 12, "Среда");

        test(1, 29, 8, "Среда");
        test(1, 30, 5, "Среда");
        test(1, 31, 1, "Среда");
        test(1, 31, 10, "Среда");

        test(1, 8, 8, "Среда");
        //endregion

        //region NY чт
        test(1, 4, 1, "Четверг");
        test(1, 4, 10, "Четверг");
        test(1, 5, 4, "Четверг");
        test(1, 5, 7, "Четверг");
        test(1, 6, 12, "Четверг");

        test(1, 29, 2, "Четверг");
        test(1, 29, 3, "Четверг");
        test(1, 29, 11, "Четверг");
        test(1, 30, 8, "Четверг");
        test(1, 31, 5, "Четверг");

        test(1, 9, 8, "Четверг");
        //endregion

        //region NY пт
        test(1, 5, 1, "Пятница");
        test(1, 5, 10, "Пятница");
        test(1, 6, 4, "Пятница");
        test(1, 6, 7, "Пятница");
        test(1, 7, 12, "Пятница");

        test(1, 30, 5, "Пятница");
        test(1, 31, 1, "Пятница");
        test(1, 31, 10, "Пятница");

        test(1, 8, 8, "Пятница");
        //endregion

        //region NY сб
        test(1, 3, 1, "Суббота");
        test(1, 3, 10, "Суббота");
        test(1, 4, 4, "Суббота");
        test(1, 4, 7, "Суббота");
        test(1, 5, 12, "Суббота");

        test(1, 30, 5, "Суббота");
        test(1, 31, 1, "Суббота");
        test(1, 31, 10, "Суббота");

        test(1, 8, 8, "Суббота");
        //endregion

        //region NY вс
        test(1, 3, 1, "Воскресенье");
        test(1, 3, 10, "Воскресенье");
        test(1, 4, 4, "Воскресенье");
        test(1, 4, 7, "Воскресенье");
        test(1, 5, 12, "Воскресенье");

        test(1, 30, 5, "Воскресенье");
        test(1, 31, 1, "Воскресенье");
        test(1, 31, 10, "Воскресенье");

        test(1, 8, 8, "Воскресенье");
        //endregion
    }

    @Test//праздники в разные года 2018
    public void subjectArea() {
        for (int i = 1; i <= 7; i++) {
            int d = i;
            for (int j = 1; j <= 12; j++) {
                for (int k = 1; k <= dayInMonth[j]; k++) {
                    test(i, k, j, nameOfDayOfTheWeek[d]);
                    if (d == 7) d = 1;
                    else d++;
                }
            }
        }
    }

    @Test//НГ в субботу или воскресенье 2017
    public void implementation() {

    }

    @Test//любые дни 2021
    public void randomValues() {
        test(5, 8, 11, "Понедельник");
        test(5, 16, 2, "Вторник");
        test(5, 24, 3, "Среда");
        test(5, 18, 3, "Четверг");
        test(5, 22, 10, "Пятница");
        test(5, 2, 1, "Суббота");
        test(5, 19, 12, "Воскресенье");
    }

    @Test//чьи-то др 2022
    public void otherSpecialMeanings() {

    }

    private void test(int newYearDay, int day, int month, String expectedDay) {
        Assert.assertEquals(expectedDay, year.findNameOfDayOfTheWeek(newYearDay, day, month));
    }
}

package DayOfWeek;

public class Year {

    private final int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] nameOfDayOfTheWeek = new String[]{"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

    public String findNameOfDayOfTheWeek(int newYearDay, int day, int month) {
        int dayInYear = 0, dayOfTheWeek;
        if (newYearDay - 1 == 0) dayOfTheWeek = 7;
        else
            dayOfTheWeek = newYearDay - 1;
        for (int i = 0; i < month - 1; i++) {
            dayInYear += dayInMonth[i];
        }
        dayInYear += day;
        /*if (dayInYear > 7)*/ dayOfTheWeek += dayInYear % 7;
        /*else dayOfTheWeek += dayInYear;*/
        if (dayOfTheWeek > 7) dayOfTheWeek %= 7;
        return nameOfDayOfTheWeek[dayOfTheWeek];
    }
}

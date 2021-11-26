package DayOfWeek;

public class Year {

    private final int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] nameOfDayOfTheWeek = new String[]{"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

    public String findNameOfDayOfTheWeek(int newYearDay, int day, int month) throws InvalidValuesException {
        if ((newYearDay <= 0 || newYearDay > 7) || (month <= 0 || month > 12) || (day <= 0 || day > dayInMonth[month - 1]) ) {
            throw new InvalidValuesException("Вы ввели невалидное значение");
        } else {
            int dayInYear = 0, dayOfTheWeek;
            if (newYearDay == 1) dayOfTheWeek = 7;
            else
                dayOfTheWeek = newYearDay - 1;
            for (int i = 0; i < month - 1; i++) {
                dayInYear += dayInMonth[i];
            }
            dayInYear += day;
            dayOfTheWeek += dayInYear % 7;
            if (dayOfTheWeek > 7) dayOfTheWeek %= 7;
            return nameOfDayOfTheWeek[dayOfTheWeek];
        }
    }
}

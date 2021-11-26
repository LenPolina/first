package DayOfWeek;

public class Main {
    public static void main(String[] args) throws InvalidValuesException {
        Year year = new Year();
        int newYearDay = 3, day = 17, month = 7;
        System.out.println(year.findNameOfDayOfTheWeek(newYearDay,day,month));
    }
}

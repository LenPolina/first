package DayOfWeek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidValuesException {
        Scanner in = new Scanner(System.in);
        Year year = new Year();
        int newYearDay = in.nextInt();
        int day = in.nextInt();
        int month = in.nextInt();
        System.out.println(year.findNameOfDayOfTheWeek(newYearDay,day,month));
    }
}

package Flat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidValuesException {
        Scanner in = new Scanner(System.in);
        Building building = new Building();
        int floor = in.nextInt();
        int apartmentsOnTheFloor = in.nextInt();
        int flat = in.nextInt();;
        int[] result = building.findAFloorAndAnEntrance(floor,apartmentsOnTheFloor,flat);
        System.out.println(flat + ": " + result[0] + " этаж," + result[1] + " подъезд");
    }
}

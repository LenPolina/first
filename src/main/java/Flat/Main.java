package Flat;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        int floor = 9, apartmentsOnTheFloor = 4, flat = 72;
        int[] result = building.findAFloorAndAnEntrance(floor,apartmentsOnTheFloor,flat);
        System.out.println(flat + ": " + result[0] + " этаж," + result[1] + " подъезд");
    }
}

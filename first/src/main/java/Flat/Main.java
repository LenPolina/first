package Flat;

public class Main {
    public static void main(String[] args) throws InvalidValuesException {
        Building building = new Building();
        int floor = Integer.MAX_VALUE, apartmentsOnTheFloor = Integer.MAX_VALUE, flat = 5;
        int[] result = building.findAFloorAndAnEntrance(floor,apartmentsOnTheFloor,flat);
        System.out.println(flat + ": " + result[0] + " этаж," + result[1] + " подъезд");
    }
}

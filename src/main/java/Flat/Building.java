package Flat;

public class Building {

    private int entrance;
    private int floor;

    public Building() {
        this.entrance = 1;
        this.floor = 1;
    }

    public int[] findAFloorAndAnEntrance(int floorsInTheBuilding, int apartmentsOnTheFloor, int theApartmentYouAreLookingFor) {

        int flat = 0, i = 1, a = floorsInTheBuilding * apartmentsOnTheFloor;
        entrance += theApartmentYouAreLookingFor / a;
        if (theApartmentYouAreLookingFor % a == 0) {
            floor = floorsInTheBuilding;
            entrance--;
        } else
            floor += theApartmentYouAreLookingFor % a / apartmentsOnTheFloor;
        return new int[]{floor, entrance};
    }
}

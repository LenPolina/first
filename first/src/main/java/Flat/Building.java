package Flat;

public class Building {

    private int entrance;
    private int floor;

    public Building() {
    }

    public int[] findAFloorAndAnEntrance(int floorsInTheBuilding, int apartmentsOnTheFloor, int theApartmentYouAreLookingFor) {
        entrance = 1;
        floor = 1;
        int flat = 0, numberOfApartmentsInTheEntrance = floorsInTheBuilding * apartmentsOnTheFloor;
        entrance += theApartmentYouAreLookingFor / numberOfApartmentsInTheEntrance;
        if (theApartmentYouAreLookingFor % numberOfApartmentsInTheEntrance == 0) {
            floor = floorsInTheBuilding;
            entrance--;
        } else
            floor += ((theApartmentYouAreLookingFor % numberOfApartmentsInTheEntrance) - 1) / apartmentsOnTheFloor;
        return new int[]{floor, entrance};
    }
}

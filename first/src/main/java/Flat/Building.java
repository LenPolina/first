package Flat;

public class Building {

    private int entrance;
    private int floor;

    public Building() {
    }

    public int[] findAFloorAndAnEntrance(int floorsInTheBuilding, int apartmentsOnTheFloor, int theApartmentYouAreLookingFor) throws InvalidValuesException {
        if ((floorsInTheBuilding <= 0) || (apartmentsOnTheFloor <= 0) || (theApartmentYouAreLookingFor <= 0) ||
                (Integer.MAX_VALUE / floorsInTheBuilding < apartmentsOnTheFloor) || (Integer.MAX_VALUE / apartmentsOnTheFloor < floorsInTheBuilding)) {
            throw new InvalidValuesException("Вы ввели невалидное значение");
        } else {
            entrance = 1;
            floor = 1;
            int numberOfApartmentsInTheEntrance = floorsInTheBuilding * apartmentsOnTheFloor;
            entrance += theApartmentYouAreLookingFor / numberOfApartmentsInTheEntrance;
            if (theApartmentYouAreLookingFor % numberOfApartmentsInTheEntrance == 0) {
                floor = floorsInTheBuilding;
                entrance--;
            } else
                floor += ((theApartmentYouAreLookingFor % numberOfApartmentsInTheEntrance) - 1) / apartmentsOnTheFloor;
            return new int[]{floor, entrance};
        }
    }
}

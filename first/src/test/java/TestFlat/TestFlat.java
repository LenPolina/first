package TestFlat;

import Flat.Building;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFlat {

    Building building;

    @Before
    public void createObject() {
        building = new Building();
    }

    @Test//первые квартиры на первых этажах и последние
    public void boundaryValuesTest() {

        test(9, 4, 1, 1, 1);
        test(9, 4, 4, 1, 1);
        test(9, 4, 5, 2, 1);
        test(9, 4, 16, 4, 1);
        test(9, 4, 15, 4, 1);
        test(9, 4, 36, 9, 1);
        test(9, 4, 37, 1, 2);
        test(9, 4, 72, 9, 2);
        test(9, 4, 73, 1, 3);

        test(5, 3, 3, 1, 1);
        test(5, 3, 4, 2, 1);
        test(5, 3, 6, 2, 1);
        test(5, 3, 15, 5, 1);
        test(5, 3, 14, 5, 1);
        test(5, 3, 24, 3, 2);
        test(5, 3, 35, 2, 3);

    }

    @Test//несколько квартир на одном этаже одного подъезда
    public void equivalenceClasses() {

    }

    @Test//квартиры по середине этажа
    public void subjectArea() {

    }

    @Test//
    public void implementation() {

    }

    @Test//любые квартиры
    public void randomValues() {

    }

    @Test//любые квартиры в необычных домах
    public void otherSpecialMeanings() {

    }

    private void test(int floor, int apartmentsOnTheFloor, int flat, int expectedFloor, int expectedEntrance) {
        Assert.assertArrayEquals(new int[]{expectedFloor, expectedEntrance}, building.findAFloorAndAnEntrance(floor, apartmentsOnTheFloor, flat));
    }
}

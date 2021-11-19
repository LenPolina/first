package TestFlat;

import Flat.Building;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.*;

public class TestFlat {

    Building building;

    @Before
    public void createObject() {
        building = new Building();
    }

    @Test//первые квартиры на первых этажах и последние
    public void boundaryValuesTest() {
        //region one apartment per floor, of which there are many
        test(MAX_VALUE,1,1,1,1);
        test(MAX_VALUE,1,2,2,1);
        test(MAX_VALUE,1,3,3,1);
        test(MAX_VALUE,1,MAX_VALUE-2,MAX_VALUE-2,1);
        test(MAX_VALUE,1,MAX_VALUE-1,MAX_VALUE-1,1);

        test(MAX_VALUE,1,4,4,1);
        test(MAX_VALUE,1,5,5,1);
        test(MAX_VALUE,1,6,6,1);
        test(MAX_VALUE,1,7,7,1);
        test(MAX_VALUE,1,8,8,1);
        test(MAX_VALUE,1,9,9,1);
        test(MAX_VALUE,1,10,10,1);

        test(MAX_VALUE,1,11,11,1);
        test(MAX_VALUE,1,12,12,1);
        test(MAX_VALUE,1,13,13,1);
        test(MAX_VALUE,1,14,14,1);
        test(MAX_VALUE,1,15,15,1);
        test(MAX_VALUE,1,16,16,1);
        test(MAX_VALUE,1,17,17,1);

        test(MAX_VALUE,1,MAX_VALUE,MAX_VALUE,1);//для реализации

        test(MAX_VALUE,1,34,34,1);
        test(MAX_VALUE,1,678,678,1);
        test(MAX_VALUE,1,8765,8765,1);
        test(MAX_VALUE,1,12345,12345,1);
        test(MAX_VALUE,1,564331,564331,1);
        test(MAX_VALUE,1,9864665,9864665,1);
        test(MAX_VALUE,1,42146658,42146658,1);

        test(MAX_VALUE,1,MAX_VALUE/2,MAX_VALUE/2,1);
        test(MAX_VALUE,1,MAX_VALUE/4,MAX_VALUE/4,1);
        test(MAX_VALUE,1,MAX_VALUE/6,MAX_VALUE/6,1);
        test(MAX_VALUE,1,MAX_VALUE/8,MAX_VALUE/8,1);
        test(MAX_VALUE,1,MAX_VALUE/2+MAX_VALUE/4,MAX_VALUE/2+MAX_VALUE/4,1);
        test(MAX_VALUE,1,MAX_VALUE/2+MAX_VALUE/4+MAX_VALUE/6,MAX_VALUE/2+MAX_VALUE/4+MAX_VALUE/6,1);
        //endregion

        //region one floor and one apartment per floor
        test(1,1,1,1,1);
        test(1,1,2,1,2);
        test(1,1,3,1,3);
        test(1,1,4,1,4);
        test(1,1,5,1,5);
        test(1,1,MAX_VALUE-3,1,MAX_VALUE-3);
        test(1,1,MAX_VALUE-2,1,MAX_VALUE-2);
        test(1,1,MAX_VALUE-1,1,MAX_VALUE-1);
        test(1,1,MAX_VALUE,1,MAX_VALUE);

        test(1,1,6,1,6);
        test(1,1,7,1,7);
        test(1,1,8,1,8);
        test(1,1,9,1,9);
        test(1,1,10,1,10);

        test(1,1,35,1,35);
        test(1,1,875,1,875);
        test(1,1,2645,1,2645);
        test(1,1,53265,1,53265);
        test(1,1,752245,1,752245);
        test(1,1,7643245,1,7643245);
        test(1,1,64286341,1,64286341);

        test(1, 1,MAX_VALUE/2,1,MAX_VALUE/2);
        test(1, 1,MAX_VALUE/4,1,MAX_VALUE/4);
        test(1, 1,MAX_VALUE/6,1,MAX_VALUE/6);
        test(1, 1,MAX_VALUE/8,1,MAX_VALUE/8);
        test(1, 1,MAX_VALUE/2+MAX_VALUE/4,1,MAX_VALUE/2+MAX_VALUE/4);
        test(1, 1,MAX_VALUE/2+MAX_VALUE/4+MAX_VALUE/6,1,MAX_VALUE/2+MAX_VALUE/4+MAX_VALUE/6);
        //endregion

        //region one floor and many apartments per floor
        test(1,MAX_VALUE,1,1,1);
        test(1,MAX_VALUE,2,1,1);
        test(1,MAX_VALUE,3,1,1);
        test(1,MAX_VALUE,4,1,1);
        test(1,MAX_VALUE,5,1,1);
        test(1,MAX_VALUE,MAX_VALUE-2,1,1);
        test(1,MAX_VALUE,MAX_VALUE-1,1,1);

        test(1,MAX_VALUE,6,1,1);
        test(1,MAX_VALUE,7,1,1);
        test(1,MAX_VALUE,8,1,1);
        test(1,MAX_VALUE,9,1,1);
        test(1,MAX_VALUE,10,1,1);

        test(1,MAX_VALUE,MAX_VALUE,1,1);

        test(1,MAX_VALUE,11,1,1);
        test(1,MAX_VALUE,12,1,1);
        test(1,MAX_VALUE,13,1,1);
        test(1,MAX_VALUE,14,1,1);
        test(1,MAX_VALUE,15,1,1);
        test(1,MAX_VALUE,16,1,1);

        test(1,MAX_VALUE,MAX_VALUE/2,1,1);
        test(1,MAX_VALUE,MAX_VALUE/4,1,1);
        test(1,MAX_VALUE,MAX_VALUE/6,1,1);
        test(1,MAX_VALUE,MAX_VALUE/8,1,1);
        test(1,MAX_VALUE,MAX_VALUE/2 + MAX_VALUE/4,1,1);
        test(1,MAX_VALUE,MAX_VALUE/2 + MAX_VALUE/6,1,1);
        test(1,MAX_VALUE,MAX_VALUE/2 + MAX_VALUE/8,1,1);
        //endregion

        //region floor options for maximum apartment
        test(2,1,MAX_VALUE,2,1);
        test(3,2,MAX_VALUE,3,1);
        test(4,4,MAX_VALUE,4,1);
        test(5,MAX_VALUE,MAX_VALUE,5,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);
        test(6,MAX_VALUE,MAX_VALUE,6,1);

        test(2,MAX_VALUE,MAX_VALUE,2,1);
        test(12,MAX_VALUE,MAX_VALUE,12,1);
        test(123,MAX_VALUE,MAX_VALUE,123,1);
        test(5413,MAX_VALUE,MAX_VALUE,5413,1);
        test(56789,MAX_VALUE,MAX_VALUE,56789,1);
        test(658789,MAX_VALUE,MAX_VALUE,658789,1);
        test(3475608,MAX_VALUE,MAX_VALUE,3475608,1);
        test(56796553,MAX_VALUE,MAX_VALUE,56796553,1);
        test(348563521,MAX_VALUE,MAX_VALUE,348563521,1);
        test(1235456865,MAX_VALUE,MAX_VALUE,1235456865,1);
        test(2064523743,MAX_VALUE,MAX_VALUE,2064523743,1);
        //endregion
    }

    @Test//несколько квартир на одном этаже одного подъезда
    public void equivalenceClasses() {

    }

    @Test
    public void subjectArea() {
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
        int[] result = building.findAFloorAndAnEntrance(floor, apartmentsOnTheFloor, flat);
        Assert.assertArrayEquals(new int[]{expectedFloor, expectedEntrance}, result);
    }
}

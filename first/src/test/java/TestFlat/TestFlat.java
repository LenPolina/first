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
    //4_611_686_014_132_420_609
    @Test//
    public void boundaryValuesTest() {

        //region only first flat and different floor and different numbers of apartments on the floor(1)
        test(MAX_VALUE, 1, 1, 1, 1);
        test(MAX_VALUE / 2, 2, 1, 1, 1);
        test(MAX_VALUE / 3, 3, 1, 1, 1);
        test(MAX_VALUE / 4, 4, 1, 1, 1);
        test(MAX_VALUE / 5, 5, 1, 1, 1);
        test(MAX_VALUE / 6, 6, 1, 1, 1);

        test(6, MAX_VALUE / 6, 1, 1, 1);
        test(5, MAX_VALUE / 5, 1, 1, 1);
        test(4, MAX_VALUE / 4, 1, 1, 1);
        test(3, MAX_VALUE / 3, 1, 1, 1);
        test(2, MAX_VALUE / 2, 1, 1, 1);
        test(1, MAX_VALUE, 1, 1, 1);

        test(MAX_VALUE / 123, 123, 1, 1, 1);
        test(MAX_VALUE / 3421, 3421, 1, 1, 1);
        test(MAX_VALUE / 514, 514, 1, 1, 1);
        test(MAX_VALUE / 75625, 75625, 1, 1, 1);
        test(MAX_VALUE / 436352, 436352, 1, 1, 1);
        test(MAX_VALUE / 648441232, 648441232, 1, 1, 1);

        test(MAX_VALUE / 666, 666, 1, 1, 1);
        test(MAX_VALUE / 666666, 666666, 1, 1, 1);
        test(MAX_VALUE / 777, 777, 1, 1, 1);
        test(MAX_VALUE / 777777, 777777, 1, 1, 1);
        test(MAX_VALUE / 888, 888, 1, 1, 1);
        test(MAX_VALUE / 888888, 888888, 1, 1, 1);
        //endregion

        //region only second flat and different floor and different numbers of apartments on the floor (1)
        test(MAX_VALUE, 1, 2, 2, 1);
        test(MAX_VALUE / 2, 2, 2, 1, 1);
        test(MAX_VALUE / 3, 3, 2, 1, 1);
        test(MAX_VALUE / 4, 4, 2, 1, 1);
        test(MAX_VALUE / 5, 5, 2, 1, 1);
        test(MAX_VALUE / 6, 6, 2, 1, 1);

        test(6, MAX_VALUE / 6, 2, 1, 1);
        test(5, MAX_VALUE / 5, 2, 1, 1);
        test(4, MAX_VALUE / 4, 2, 1, 1);
        test(3, MAX_VALUE / 3, 2, 1, 1);
        test(2, MAX_VALUE / 2, 2, 1, 1);
        test(1, MAX_VALUE, 2, 1, 1);

        test(MAX_VALUE / 123, 123, 2, 1, 1);
        test(MAX_VALUE / 3421, 3421, 2, 1, 1);
        test(MAX_VALUE / 514, 514, 2, 1, 1);
        test(MAX_VALUE / 75625, 75625, 2, 1, 1);
        test(MAX_VALUE / 436352, 436352, 2, 1, 1);
        test(MAX_VALUE / 648441232, 648441232, 2, 1, 1);

        test(MAX_VALUE / 666, 666, 2, 1, 1);
        test(MAX_VALUE / 666666, 666666, 2, 1, 1);
        test(MAX_VALUE / 777, 777, 2, 1, 1);
        test(MAX_VALUE / 777777, 777777, 2, 1, 1);
        test(MAX_VALUE / 888, 888, 2, 1, 1);
        test(MAX_VALUE / 888888, 888888, 2, 1, 1);
        //endregion

        //region only max flat and different floor and different numbers of apartments on the floor(2)
        test(MAX_VALUE, 1, MAX_VALUE, MAX_VALUE, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 3, 3, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 4, 4, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 5, 5, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 6, 6, MAX_VALUE, 1, 2);

        test(6, MAX_VALUE / 6, MAX_VALUE, 1, 2);
        test(5, MAX_VALUE / 5, MAX_VALUE, 1, 2);
        test(4, MAX_VALUE / 4, MAX_VALUE, 1, 2);
        test(3, MAX_VALUE / 3, MAX_VALUE, 1, 2);
        test(2, MAX_VALUE / 2, MAX_VALUE, 1, 2);
        test(1, MAX_VALUE, MAX_VALUE, 1, 1);

        test(MAX_VALUE / 123, 123, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 3421, 3421, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 514, 514, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 75625, 75625, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 436352, 436352, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 648441232, 648441232, MAX_VALUE, 1, 2);

        test(MAX_VALUE / 666, 666, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 666666, 666666, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 777, 777, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 777777, 777777, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 888, 888, MAX_VALUE, 1, 2);
        test(MAX_VALUE / 888888, 888888, MAX_VALUE, 1, 2);
        //endregion

        //region only max-1 flat and different floor and different numbers of apartments on the floor(2)
        test(MAX_VALUE, 1, MAX_VALUE - 1, MAX_VALUE - 1, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE - 1, MAX_VALUE / 2, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE - 1, MAX_VALUE / 3, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 6, 6, MAX_VALUE - 1, MAX_VALUE / 6, 1);

        test(6, MAX_VALUE / 6, MAX_VALUE - 1, 6, 1);
        test(5, MAX_VALUE / 5, MAX_VALUE - 1, 1, 2);
        test(4, MAX_VALUE / 4, MAX_VALUE - 1, 1, 2);
        test(3, MAX_VALUE / 3, MAX_VALUE - 1, 3, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE - 1, 2, 1);
        test(1, MAX_VALUE, MAX_VALUE - 1, 1, 1);

        test(MAX_VALUE / 123, 123, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 3421, 3421, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 514, 514, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 75625, 75625, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 436352, 436352, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 648441232, 648441232, MAX_VALUE - 1, 1, 2);

        test(MAX_VALUE / 666, 666, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 666666, 666666, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 777, 777, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 777777, 777777, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 888, 888, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 888888, 888888, MAX_VALUE - 1, 1, 2);
        //endregion

        //region only first floor and max flat on the floor(3)
        test(1, MAX_VALUE, 1, 1, 1);
        test(1, MAX_VALUE, 2, 1, 1);
        test(1, MAX_VALUE, 3, 1, 1);
        test(1, MAX_VALUE, 4, 1, 1);
        test(1, MAX_VALUE, 5, 1, 1);

        test(1, MAX_VALUE, MAX_VALUE - 5, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE - 4, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE - 3, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE - 2, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE - 1, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE, 1, 1);

        test(1, MAX_VALUE, 21, 1, 1);
        test(1, MAX_VALUE, 4781, 1, 1);
        test(1, MAX_VALUE, 59321, 1, 1);
        test(1, MAX_VALUE, 418233, 1, 1);
        test(1, MAX_VALUE, 5322445, 1, 1);
        test(1, MAX_VALUE, 31325646, 1, 1);
        test(1, MAX_VALUE, 876543123, 1, 1);
        test(1, MAX_VALUE, 1691873264, 1, 1);

        test(1, MAX_VALUE, 666, 1, 1);
        test(1, MAX_VALUE, 666666, 1, 1);
        test(1, MAX_VALUE, 666666666, 1, 1);
        test(1, MAX_VALUE, 777, 1, 1);
        test(1, MAX_VALUE, 777777, 1, 1);
        test(1, MAX_VALUE, 777777777, 1, 1);
        test(1, MAX_VALUE, 888, 1, 1);
        test(1, MAX_VALUE, 888888, 1, 1);
        test(1, MAX_VALUE, 888888888, 1, 1);
        //endregion

        //region only first floor and max-1 flat on the floor(3)
        test(1, MAX_VALUE - 1, 1, 1, 1);
        test(1, MAX_VALUE - 1, 2, 1, 1);
        test(1, MAX_VALUE - 1, 3, 1, 1);
        test(1, MAX_VALUE - 1, 4, 1, 1);
        test(1, MAX_VALUE - 1, 5, 1, 1);

        test(1, MAX_VALUE - 1, MAX_VALUE - 5, 1, 1);
        test(1, MAX_VALUE - 1, MAX_VALUE - 4, 1, 1);
        test(1, MAX_VALUE - 1, MAX_VALUE - 3, 1, 1);
        test(1, MAX_VALUE - 1, MAX_VALUE - 2, 1, 1);
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, 1, 1);
        test(1, MAX_VALUE - 1, MAX_VALUE, 1, 2);

        test(1, MAX_VALUE - 1, 21, 1, 1);
        test(1, MAX_VALUE - 1, 4781, 1, 1);
        test(1, MAX_VALUE - 1, 59321, 1, 1);
        test(1, MAX_VALUE - 1, 418233, 1, 1);
        test(1, MAX_VALUE - 1, 3454674, 1, 1);
        test(1, MAX_VALUE - 1, 74352314, 1, 1);
        test(1, MAX_VALUE - 1, 534266879, 1, 1);
        test(1, MAX_VALUE - 1, 1691873264, 1, 1);

        test(1, MAX_VALUE - 1, 666, 1, 1);
        test(1, MAX_VALUE - 1, 666666, 1, 1);
        test(1, MAX_VALUE - 1, 666666666, 1, 1);
        test(1, MAX_VALUE - 1, 777, 1, 1);
        test(1, MAX_VALUE - 1, 777777, 1, 1);
        test(1, MAX_VALUE - 1, 777777777, 1, 1);
        test(1, MAX_VALUE - 1, 888, 1, 1);
        test(1, MAX_VALUE - 1, 888888, 1, 1);
        test(1, MAX_VALUE - 1, 888888888, 1, 1);
        //endregion

        //region only max floor and one flat in the floor(4)
        test(MAX_VALUE, 1, 1, 1, 1);
        test(MAX_VALUE, 1, 2, 2, 1);
        test(MAX_VALUE, 1, 3, 3, 1);
        test(MAX_VALUE, 1, 4, 4, 1);
        test(MAX_VALUE, 1, 5, 5, 1);

        test(MAX_VALUE, 1, MAX_VALUE - 4, MAX_VALUE - 4, 1);
        test(MAX_VALUE, 1, MAX_VALUE - 3, MAX_VALUE - 3, 1);
        test(MAX_VALUE, 1, MAX_VALUE - 2, MAX_VALUE - 2, 1);
        test(MAX_VALUE, 1, MAX_VALUE - 1, MAX_VALUE - 1, 1);
        test(MAX_VALUE, 1, MAX_VALUE, MAX_VALUE, 1);

        test(MAX_VALUE, 1, 9, 9, 1);
        test(MAX_VALUE, 1, 1367, 1367, 1);
        test(MAX_VALUE, 1, 42165, 42165, 1);
        test(MAX_VALUE, 1, 812735, 812735, 1);
        test(MAX_VALUE, 1, 5243566, 5243566, 1);
        test(MAX_VALUE, 1, 27511544, 27511544, 1);
        test(MAX_VALUE, 1, 531557790, 531557790, 1);
        test(MAX_VALUE, 1, 1521872912, 1521872912, 1);

        test(MAX_VALUE, 1, 666, 666, 1);
        test(MAX_VALUE, 1, 666666, 666666, 1);
        test(MAX_VALUE, 1, 666666666, 666666666, 1);
        test(MAX_VALUE, 1, 777, 777, 1);
        test(MAX_VALUE, 1, 777777, 777777, 1);
        test(MAX_VALUE, 1, 777777777, 777777777, 1);
        test(MAX_VALUE, 1, 888, 888, 1);
        test(MAX_VALUE, 1, 888888, 888888, 1);
        test(MAX_VALUE, 1, 888888888, 888888888, 1);
        //endregion

        //region only max-1 floor and one flat in the floor(4)
        test(MAX_VALUE - 1, 1, 1, 1, 1);
        test(MAX_VALUE - 1, 1, 2, 2, 1);
        test(MAX_VALUE - 1, 1, 3, 3, 1);
        test(MAX_VALUE - 1, 1, 4, 4, 1);
        test(MAX_VALUE - 1, 1, 5, 5, 1);

        test(MAX_VALUE - 1, 1, MAX_VALUE - 4, MAX_VALUE - 4, 1);
        test(MAX_VALUE - 1, 1, MAX_VALUE - 3, MAX_VALUE - 3, 1);
        test(MAX_VALUE - 1, 1, MAX_VALUE - 2, MAX_VALUE - 2, 1);
        test(MAX_VALUE - 1, 1, MAX_VALUE - 1, MAX_VALUE - 1, 1);
        test(MAX_VALUE - 1, 1, MAX_VALUE, 1, 2);

        test(MAX_VALUE - 1, 1, 9, 9, 1);
        test(MAX_VALUE - 1, 1, 36, 36, 1);
        test(MAX_VALUE - 1, 1, 532, 532, 1);
        test(MAX_VALUE - 1, 1, 1367, 1367, 1);
        test(MAX_VALUE - 1, 1, 42165, 42165, 1);
        test(MAX_VALUE - 1, 1, 812735, 812735, 1);
        test(MAX_VALUE - 1, 1, 6343124, 6343124, 1);
        test(MAX_VALUE - 1, 1, 27511544, 27511544, 1);
        test(MAX_VALUE - 1, 1, 864531245, 864531245, 1);
        test(MAX_VALUE - 1, 1, 1335768763, 1335768763, 1);

        test(MAX_VALUE - 1, 1, 666, 666, 1);
        test(MAX_VALUE - 1, 1, 666666, 666666, 1);
        test(MAX_VALUE - 1, 1, 666666666, 666666666, 1);
        test(MAX_VALUE - 1, 1, 777, 777, 1);
        test(MAX_VALUE - 1, 1, 777777, 777777, 1);
        test(MAX_VALUE - 1, 1, 777777777, 777777777, 1);
        test(MAX_VALUE - 1, 1, 888, 888, 1);
        test(MAX_VALUE - 1, 1, 888888, 888888, 1);
        test(MAX_VALUE - 1, 1, 888888888, 888888888, 1);
        //endregion

        //region one floor and one flat on the floor(5)
        test(1, 1, 1, 1, 1);
        test(1, 1, 2, 1, 2);
        test(1, 1, 3, 1, 3);
        test(1, 1, 4, 1, 4);
        test(1, 1, 5, 1, 5);

        test(1, 1, MAX_VALUE - 4, 1, MAX_VALUE - 4);
        test(1, 1, MAX_VALUE - 3, 1, MAX_VALUE - 3);
        test(1, 1, MAX_VALUE - 2, 1, MAX_VALUE - 2);
        test(1, 1, MAX_VALUE - 1, 1, MAX_VALUE - 1);
        test(1, 1, MAX_VALUE, 1, MAX_VALUE);

        test(1, 1, 35, 1, 35);
        test(1, 1, 756, 1, 756);
        test(1, 1, 5437, 1, 5437);
        test(1, 1, 21345, 1, 21345);
        test(1, 1, 463412, 1, 463412);
        test(1, 1, 9625312, 1, 9625312);
        test(1, 1, 15324321, 1, 15324321);
        test(1, 1, 463121439, 1, 463121439);
        test(1, 1, 1224365471, 1, 1224365471);

        test(1, 1, 666, 1, 666);
        test(1, 1, 666666, 1, 666666);
        test(1, 1, 666666666, 1, 666666666);
        test(1, 1, 777, 1, 777);
        test(1, 1, 777777, 1, 777777);
        test(1, 1, 777777777, 1, 777777777);
        test(1, 1, 888, 1, 888);
        test(1, 1, 888888, 1, 888888);
        test(1, 1, 888888888, 1, 888888888);
        //endregion

        //region one floor, two apartments on the floor(5)
        test(1, 2, 1, 1, 1);
        test(1, 2, 2, 1, 1);
        test(1, 2, 3, 1, 2);
        test(1, 2, 4, 1, 2);
        test(1, 2, 5, 1, 3);
        test(1, 2, 6, 1, 3);
        test(1, 2, 7, 1, 4);
        test(1, 2, 8, 1, 4);

        test(1, 2, MAX_VALUE - 8, 1, (MAX_VALUE - 7) / 2);
        test(1, 2, MAX_VALUE - 7, 1, (MAX_VALUE - 7) / 2);
        test(1, 2, MAX_VALUE - 6, 1, (MAX_VALUE - 5) / 2);
        test(1, 2, MAX_VALUE - 5, 1, (MAX_VALUE - 5) / 2);
        test(1, 2, MAX_VALUE - 4, 1, (MAX_VALUE - 3) / 2);
        test(1, 2, MAX_VALUE - 3, 1, (MAX_VALUE - 3) / 2);
        test(1, 2, MAX_VALUE - 2, 1, (MAX_VALUE - 1) / 2);
        test(1, 2, MAX_VALUE - 1, 1, (MAX_VALUE - 1) / 2);

        test(1, 2, 9, 1, 5);
        test(1, 2, 10, 1, 5);
        test(1, 2, 11, 1, 6);
        test(1, 2, 12, 1, 6);
        test(1, 2, 13, 1, 7);
        test(1, 2, 14, 1, 7);
        test(1, 2, 15, 1, 8);
        test(1, 2, 16, 1, 8);
        test(1, 2, 17, 1, 9);
        test(1, 2, 18, 1, 9);
        test(1, 2, 19, 1, 10);
        test(1, 2, 20, 1, 10);

        test(1, 2, 35, 1, 18);
        test(1, 2, 36, 1, 18);
        test(1, 2, 77, 1, 39);
        test(1, 2, 78, 1, 39);
        test(1, 2, 531, 1, 266);
        test(1, 2, 532, 1, 266);
        test(1, 2, 65473, 1, 32737);
        test(1, 2, 65474, 1, 32737);
        test(1, 2, 6352441, 1, 3176221);
        test(1, 2, 6352442, 1, 3176221);
        test(1, 2, 52113465, 1, 26056733);
        test(1, 2, 52113466, 1, 26056733);

        test(1, 2, 665, 1, 333);
        test(1, 2, 666, 1, 333);
        test(1, 2, 777, 1, 389);
        test(1, 2, 778, 1, 389);
        test(1, 2, 887, 1, 444);
        test(1, 2, 888, 1, 444);

        //endregion

        //region two floor, one apartment on the floor(5)
        test(2, 1, 1, 1, 1);
        test(2, 1, 2, 2, 1);
        test(2, 1, 3, 1, 2);
        test(2, 1, 4, 2, 2);
        test(2, 1, 5, 1, 3);
        test(2, 1, 6, 2, 3);
        test(2, 1, 7, 1, 4);
        test(2, 1, 8, 2, 4);

        test(2, 1, MAX_VALUE - 4, 1, (MAX_VALUE - 3) / 2);
        test(2, 1, MAX_VALUE - 3, 2, (MAX_VALUE - 3) / 2);
        test(2, 1, MAX_VALUE - 2, 1, (MAX_VALUE - 1) / 2);
        test(2, 1, MAX_VALUE - 1, 2, (MAX_VALUE - 1) / 2);
        test(2, 1, MAX_VALUE, 1, 1_073_741_824);

        test(2, 1, 9, 1, 5);
        test(2, 1, 10, 2, 5);
        test(2, 1, 11, 1, 6);
        test(2, 1, 12, 2, 6);
        test(2, 1, 13, 1, 7);
        test(2, 1, 14, 2, 7);
        test(2, 1, 15, 1, 8);
        test(2, 1, 16, 2, 8);
        test(2, 1, 17, 1, 9);
        test(2, 1, 18, 2, 9);
        test(2, 1, 19, 1, 10);
        test(2, 1, 20, 2, 10);

        test(2, 1, 35, 1, 18);
        test(2, 1, 36, 2, 18);
        test(2, 1, 77, 1, 39);
        test(2, 1, 78, 2, 39);
        test(2, 1, 531, 1, 266);
        test(2, 1, 532, 2, 266);
        test(2, 1, 65473, 1, 32737);
        test(2, 1, 65474, 2, 32737);
        test(2, 1, 6352441, 1, 3176221);
        test(2, 1, 6352442, 2, 3176221);
        test(2, 1, 52_113_465, 1, 26056733);
        test(2, 1, 52113466, 2, 26056733);
        test(2, 1, 527223411, 1, 263611706);
        test(2, 1, 527_223_412, 2, 263611706);
        test(2, 1, 1424511321, 1, 712255661);
        test(2, 1, 1_424_511_322, 2, 712255661);
        test(2, 1, 2046378941, 1, 1023189471);
        test(2, 1, 2_046_378_942, 2, 1023189471);

        test(2, 1, 665, 1, 333);
        test(2, 1, 666, 2, 333);
        test(2, 1, 777, 1, 389);
        test(2, 1, 778, 2, 389);
        test(2, 1, 887, 1, 444);
        test(2, 1, 888, 2, 444);
        //endregion

        //region first flat, one flat on the floor and many floors(6)
        test(1, 1, 1, 1, 1);
        test(2, 1, 1, 1, 1);
        test(3, 1, 1, 1, 1);
        test(4, 1, 1, 1, 1);
        test(5, 1, 1, 1, 1);

        test(MAX_VALUE - 4, 1, 1, 1, 1);
        test(MAX_VALUE - 3, 1, 1, 1, 1);
        test(MAX_VALUE - 2, 1, 1, 1, 1);
        test(MAX_VALUE - 1, 1, 1, 1, 1);
        test(MAX_VALUE, 1, 1, 1, 1);

        test(332, 1, 1, 1, 1);
        test(4622, 1, 1, 1, 1);
        test(65276, 1, 1, 1, 1);
        test(7464576, 1, 1, 1, 1);
        test(257664778, 1, 1, 1, 1);

        test(666, 1, 1, 1, 1);
        test(666666, 1, 1, 1, 1);
        test(777, 1, 1, 1, 1);
        test(777777, 1, 1, 1, 1);
        test(888, 1, 1, 1, 1);
        test(888888, 1, 1, 1, 1);
        //endregion

        //region second flat, one flat on the floor and many floors(6)
        test(1, 1, 2, 1, 2);
        test(2, 1, 2, 2, 1);
        test(3, 1, 2, 2, 1);
        test(4, 1, 2, 2, 1);
        test(5, 1, 2, 2, 1);

        test(MAX_VALUE - 4, 1, 2, 2, 1);
        test(MAX_VALUE - 3, 1, 2, 2, 1);
        test(MAX_VALUE - 2, 1, 2, 2, 1);
        test(MAX_VALUE - 1, 1, 2, 2, 1);
        test(MAX_VALUE, 1, 2, 2, 1);

        test(332, 1, 2, 2, 1);
        test(4622, 1, 2, 2, 1);
        test(65276, 1, 2, 2, 1);
        test(7464576, 1, 2, 2, 1);
        test(257664778, 1, 2, 2, 1);

        test(666, 1, 2, 2, 1);
        test(666666, 1, 2, 2, 1);
        test(777, 1, 2, 2, 1);
        test(777777, 1, 2, 2, 1);
        test(888, 1, 2, 2, 1);
        test(888888, 1, 2, 2, 1);
        //endregion

        //region first flat, many flat on the floor, first floor(7)
        test(1, 1, 1, 1, 1);
        test(1, 2, 1, 1, 1);
        test(1, 3, 1, 1, 1);
        test(1, 4, 1, 1, 1);
        test(1, 5, 1, 1, 1);

        test(1, MAX_VALUE - 4, 1, 1, 1);
        test(1, MAX_VALUE - 3, 1, 1, 1);
        test(1, MAX_VALUE - 2, 1, 1, 1);
        test(1, MAX_VALUE - 1, 1, 1, 1);
        test(1, MAX_VALUE, 1, 1, 1);

        test(1, 332, 1, 1, 1);
        test(1, 4622, 1, 1, 1);
        test(1, 65276, 1, 1, 1);
        test(1, 7464576, 1, 1, 1);
        test(1, 257664778, 1, 1, 1);

        test(1, 666, 1, 1, 1);
        test(1, 666666, 1, 1, 1);
        test(1, 777, 1, 1, 1);
        test(1, 777777, 1, 1, 1);
        test(1, 888, 1, 1, 1);
        test(1, 888888, 1, 1, 1);
        //endregion

        //region second flat, many flat on the floor, first floor(7)
        test(1, 1, 2, 1, 2);
        test(1, 2, 2, 1, 1);
        test(1, 3, 2, 1, 1);
        test(1, 4, 2, 1, 1);
        test(1, 5, 2, 1, 1);

        test(1, MAX_VALUE - 4, 2, 1, 1);
        test(1, MAX_VALUE - 3, 2, 1, 1);
        test(1, MAX_VALUE - 2, 2, 1, 1);
        test(1, MAX_VALUE - 1, 2, 1, 1);
        test(1, MAX_VALUE, 2, 1, 1);

        test(1, 332, 2, 1, 1);
        test(1, 4622, 2, 1, 1);
        test(1, 65276, 2, 1, 1);
        test(1, 7464576, 2, 1, 1);
        test(1, 257664778, 2, 1, 1);

        test(1, 666, 2, 1, 1);
        test(1, 666666, 2, 1, 1);
        test(1, 777, 2, 1, 1);
        test(1, 777777, 2, 1, 1);
        test(1, 888, 2, 1, 1);
        test(1, 888888, 2, 1, 1);
        //endregion

        //region Max flat, one flat on the floor and many floors(8)
        test(1, 1, MAX_VALUE, 1, MAX_VALUE);
        test(2, 1, MAX_VALUE, 1, MAX_VALUE / 2 + 1);
        test(3, 1, MAX_VALUE, 1, MAX_VALUE / 3 + 1);
        test(4, 1, MAX_VALUE, 3, MAX_VALUE / 4 + 1);
        test(5, 1, MAX_VALUE, 2, MAX_VALUE / 5 + 1);

        test(MAX_VALUE - 4, 1, MAX_VALUE, 4, 2);
        test(MAX_VALUE - 3, 1, MAX_VALUE, 3, 2);
        test(MAX_VALUE - 2, 1, MAX_VALUE, 2, 2);
        test(MAX_VALUE - 1, 1, MAX_VALUE, 1, 2);
        test(MAX_VALUE, 1, MAX_VALUE, MAX_VALUE, 1);

        test(332, 1, MAX_VALUE, 79, 6468325);
        test(4622, 1, MAX_VALUE, 763, 464623);
        test(65276, 1, MAX_VALUE, 33799, 32899);
        test(7464576, 1, MAX_VALUE, 5150335, 288);
        test(257664778, 1, MAX_VALUE, 86165423, 9);

        test(666, 1, MAX_VALUE, 613, 3224450);
        test(666666, 1, MAX_VALUE, 152461, 3222);
        test(777, 1, MAX_VALUE, 169, 2763815);
        test(777777, 1, MAX_VALUE, 41350, 2762);
        test(888, 1, MAX_VALUE, 391, 2418338);
        test(888888, 1, MAX_VALUE, 819127, 2416);
        //endregion

        //region Max-1 flat, one flat on the floor and many floors(8)
        test(1, 1, MAX_VALUE - 1, 1, MAX_VALUE - 1);
        test(2, 1, MAX_VALUE - 1, 2, MAX_VALUE / 2);
        test(3, 1, MAX_VALUE - 1, 3, MAX_VALUE / 3);
        test(4, 1, MAX_VALUE - 1, 2, MAX_VALUE / 4 + 1);
        test(5, 1, MAX_VALUE - 1, 1, MAX_VALUE / 5 + 1);

        test(MAX_VALUE - 4, 1, MAX_VALUE - 1, 3, 2);
        test(MAX_VALUE - 3, 1, MAX_VALUE - 1, 2, 2);
        test(MAX_VALUE - 2, 1, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE - 1, 1, MAX_VALUE - 1, MAX_VALUE - 1, 1);
        test(MAX_VALUE, 1, MAX_VALUE - 1, MAX_VALUE - 1, 1);

        test(332, 1, MAX_VALUE - 1, 78, 6468325);
        test(4622, 1, MAX_VALUE - 1, 762, 464623);
        test(65276, 1, MAX_VALUE - 1, 33798, 32899);
        test(7464576, 1, MAX_VALUE - 1, 5150334, 288);
        test(257664778, 1, MAX_VALUE - 1, 86165422, 9);

        test(666, 1, MAX_VALUE - 1, 612, 3224450);
        test(666666, 1, MAX_VALUE - 1, 152460, 3222);
        test(777, 1, MAX_VALUE - 1, 168, 2763815);
        test(777777, 1, MAX_VALUE - 1, 41349, 2762);
        test(888, 1, MAX_VALUE - 1, 390, 2418338);
        test(888888, 1, MAX_VALUE - 1, 819126, 2416);
        //endregion

        //region Max flat, many flat on the floor and first floors(9)
        test(1, 1, MAX_VALUE, 1, MAX_VALUE);
        test(1, 2, MAX_VALUE, 1, MAX_VALUE / 2 + 1);
        test(1, 3, MAX_VALUE, 1, MAX_VALUE / 3 + 1);
        test(1, 4, MAX_VALUE, 1, MAX_VALUE / 4 + 1);
        test(1, 5, MAX_VALUE, 1, MAX_VALUE / 5 + 1);

        test(1, MAX_VALUE - 4, MAX_VALUE, 1, 2);
        test(1, MAX_VALUE - 3, MAX_VALUE, 1, 2);
        test(1, MAX_VALUE - 2, MAX_VALUE, 1, 2);
        test(1, MAX_VALUE - 1, MAX_VALUE, 1, 2);
        test(1, MAX_VALUE, MAX_VALUE, 1, 1);

        test(1, 332, MAX_VALUE, 1, 6468325);
        test(1, 4622, MAX_VALUE, 1, 464623);
        test(1, 65276, MAX_VALUE, 1, 32899);
        test(1, 7464576, MAX_VALUE, 1, 288);
        test(1, 257664778, MAX_VALUE, 1, 9);

        test(1, 666, MAX_VALUE, 1, 3224450);
        test(1, 666666, MAX_VALUE, 1, 3222);
        test(1, 777, MAX_VALUE, 1, 2763815);
        test(1, 777777, MAX_VALUE, 1, 2762);
        test(1, 888, MAX_VALUE, 1, 2418338);
        test(1, 888888, MAX_VALUE, 1, 2416);
        //endregion

        //region Max-1 flat, many flat on the floor and first floors(9)
        test(1, 1, MAX_VALUE - 1, 1, MAX_VALUE - 1);
        test(1, 2, MAX_VALUE - 1, 1, MAX_VALUE / 2);
        test(1, 3, MAX_VALUE - 1, 1, MAX_VALUE / 3);
        test(1, 4, MAX_VALUE - 1, 1, MAX_VALUE / 4 + 1);
        test(1, 5, MAX_VALUE - 1, 1, MAX_VALUE / 5 + 1);

        test(1, MAX_VALUE - 4, MAX_VALUE - 1, 1, 2);
        test(1, MAX_VALUE - 3, MAX_VALUE - 1, 1, 2);
        test(1, MAX_VALUE - 2, MAX_VALUE - 1, 1, 2);
        test(1, MAX_VALUE - 1, MAX_VALUE - 1, 1, 1);
        test(1, MAX_VALUE, MAX_VALUE - 1, 1, 1);

        test(1, 332, MAX_VALUE - 1, 1, 6468325);
        test(1, 4622, MAX_VALUE - 1, 1, 464623);
        test(1, 65276, MAX_VALUE - 1, 1, 32899);
        test(1, 7464576, MAX_VALUE - 1, 1, 288);
        test(1, 257664778, MAX_VALUE - 1, 1, 9);

        test(1, 666, MAX_VALUE - 1, 1, 3224450);
        test(1, 666666, MAX_VALUE - 1, 1, 3222);
        test(1, 777, MAX_VALUE - 1, 1, 2763815);
        test(1, 777777, MAX_VALUE - 1, 1, 2762);
        test(1, 888, MAX_VALUE - 1, 1, 2418338);
        test(1, 888888, MAX_VALUE - 1, 1, 2416);
        //endregion
    }

    @Test//несколько квартир на одном этаже одного подъезда
    public void equivalenceClasses() {

        //region two floor, two apartments on the floor
        test(2, 2, 1, 1, 1);
        test(2, 2, 2, 1, 1);
        test(2, 2, 3, 2, 1);
        test(2, 2, 4, 2, 1);

        test(2, 2, 5, 1, 2);
        test(2, 2, 6, 1, 2);
        test(2, 2, 7, 2, 2);
        test(2, 2, 8, 2, 2);

        test(2, 2, 9, 1, 3);
        test(2, 2, 10, 1, 3);
        test(2, 2, 11, 2, 3);
        test(2, 2, 12, 2, 3);

        test(2, 2, 13, 1, 4);
        test(2, 2, 14, 1, 4);
        test(2, 2, 15, 2, 4);
        test(2, 2, 16, 2, 4);

        test(2, 2, MAX_VALUE - 10, 1, (MAX_VALUE - 7) / 4);
        test(2, 2, MAX_VALUE - 9, 1, (MAX_VALUE - 7) / 4);
        test(2, 2, MAX_VALUE - 8, 2, (MAX_VALUE - 7) / 4);
        test(2, 2, MAX_VALUE - 7, 2, (MAX_VALUE - 7) / 4);

        test(2, 2, MAX_VALUE - 6, 1, (MAX_VALUE - 3) / 4);
        test(2, 2, MAX_VALUE - 5, 1, (MAX_VALUE - 3) / 4);
        test(2, 2, MAX_VALUE - 4, 2, (MAX_VALUE - 3) / 4);
        test(2, 2, MAX_VALUE - 3, 2, (MAX_VALUE - 3) / 4);

        test(2, 2, MAX_VALUE - 2, 1, 536870912);
        test(2, 2, MAX_VALUE - 1, 1, 536870912);
        test(2, 2, MAX_VALUE, 2, 536870912);

        test(2, 2, 17, 1, 5);
        test(2, 2, 18, 1, 5);
        test(2, 2, 19, 2, 5);
        test(2, 2, 20, 2, 5);

        test(2, 2, 21, 1, 6);
        test(2, 2, 22, 1, 6);
        test(2, 2, 23, 2, 6);
        test(2, 2, 24, 2, 6);

        test(2, 2, 33, 1, 9);
        test(2, 2, 34, 1, 9);
        test(2, 2, 35, 2, 9);
        test(2, 2, 36, 2, 9);

        test(2, 2, 77, 1, 20);
        test(2, 2, 78, 1, 20);
        test(2, 2, 79, 2, 20);
        test(2, 2, 80, 2, 20);

        test(2, 2, 533, 1, 134);
        test(2, 2, 534, 1, 134);
        test(2, 2, 535, 2, 134);
        test(2, 2, 536, 2, 134);

        test(2, 2, 65473, 1, 16369);
        test(2, 2, 65474, 1, 16369);
        test(2, 2, 65475, 2, 16369);
        test(2, 2, 65476, 2, 16369);

        test(2, 2, 6352441, 1, 1588111);
        test(2, 2, 6352442, 1, 1588111);
        test(2, 2, 6352443, 2, 1588111);
        test(2, 2, 6352444, 2, 1588111);

        test(2, 2, 52113465, 1, 13028367);
        test(2, 2, 52113466, 1, 13028367);
        test(2, 2, 52113467, 2, 13028367);
        test(2, 2, 52113468, 2, 13028367);

        test(2, 2, 665, 1, 167);
        test(2, 2, 666, 1, 167);
        test(2, 2, 667, 2, 167);
        test(2, 2, 668, 2, 167);

        test(2, 2, 777, 1, 195);
        test(2, 2, 778, 1, 195);
        test(2, 2, 779, 2, 195);
        test(2, 2, 780, 2, 195);

        test(2, 2, 885, 1, 222);
        test(2, 2, 886, 1, 222);
        test(2, 2, 887, 2, 222);
        test(2, 2, 888, 2, 222);

        //endregion

        //region Max/2 floor, two apartments on the floor
        test(MAX_VALUE / 2, 2, 1, 1, 1);
        test(MAX_VALUE / 2, 2, 2, 1, 1);
        test(MAX_VALUE / 2, 2, 3, 2, 1);
        test(MAX_VALUE / 2, 2, 4, 2, 1);
        test(MAX_VALUE / 2, 2, 5, 3, 1);
        test(MAX_VALUE / 2, 2, 6, 3, 1);

        test(MAX_VALUE / 2, 2, MAX_VALUE / 2 - 5, MAX_VALUE / 4 - 2, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE / 2 - 4, MAX_VALUE / 4 - 1, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE / 2 - 3, MAX_VALUE / 4 - 1, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE / 2 - 2, MAX_VALUE / 4, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE / 2 - 1, MAX_VALUE / 4, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE / 2, MAX_VALUE / 4 + 1, 1);

        test(MAX_VALUE / 2, 2, MAX_VALUE - 5, MAX_VALUE / 2 - 2, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE - 4, MAX_VALUE / 2 - 1, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE - 3, MAX_VALUE / 2 - 1, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE - 2, MAX_VALUE / 2, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE - 1, MAX_VALUE / 2, 1);
        test(MAX_VALUE / 2, 2, MAX_VALUE, 1, 2);
        //endregion

        //region one floor, three apartments on the floor
        test(1, 3, 1, 1, 1);
        test(1, 3, 2, 1, 1);
        test(1, 3, 3, 1, 1);
        test(1, 3, 4, 1, 2);
        test(1, 3, 5, 1, 2);
        test(1, 3, 6, 1, 2);
        test(1, 3, 7, 1, 3);
        test(1, 3, 8, 1, 3);
        test(1, 3, 9, 1, 3);

        test(1, 3, MAX_VALUE - 9, 1, (MAX_VALUE - 7) / 3);
        test(1, 3, MAX_VALUE - 8, 1, (MAX_VALUE - 7) / 3);
        test(1, 3, MAX_VALUE - 7, 1, (MAX_VALUE - 7) / 3);
        test(1, 3, MAX_VALUE - 6, 1, (MAX_VALUE - 4) / 3);
        test(1, 3, MAX_VALUE - 5, 1, (MAX_VALUE - 4) / 3);
        test(1, 3, MAX_VALUE - 4, 1, (MAX_VALUE - 4) / 3);
        test(1, 3, MAX_VALUE - 3, 1, (MAX_VALUE - 1) / 3);
        test(1, 3, MAX_VALUE - 2, 1, (MAX_VALUE - 1) / 3);
        test(1, 3, MAX_VALUE - 1, 1, (MAX_VALUE - 1) / 3);
        test(1, 3, MAX_VALUE, 1, (MAX_VALUE) / 3 + 1);

        test(1, 3, 10, 1, 4);
        test(1, 3, 11, 1, 4);
        test(1, 3, 12, 1, 4);
        test(1, 3, 13, 1, 5);
        test(1, 3, 14, 1, 5);
        test(1, 3, 15, 1, 5);
        test(1, 3, 16, 1, 6);
        test(1, 3, 17, 1, 6);
        test(1, 3, 18, 1, 6);
        test(1, 3, 19, 1, 7);
        test(1, 3, 20, 1, 7);
        test(1, 3, 21, 1, 7);

        test(1, 3, 34, 1, 12);
        test(1, 3, 35, 1, 12);
        test(1, 3, 36, 1, 12);
        test(1, 3, 76, 1, 26);
        test(1, 3, 77, 1, 26);
        test(1, 3, 78, 1, 26);
        test(1, 3, 532, 1, 178);
        test(1, 3, 533, 1, 178);
        test(1, 3, 534, 1, 178);
        test(1, 3, 65473, 1, 21825);
        test(1, 3, 65474, 1, 21825);
        test(1, 3, 65475, 1, 21825);
        test(1, 3, 6352441, 1, 2117481);
        test(1, 3, 6352442, 1, 2117481);
        test(1, 3, 6352443, 1, 2117481);
        test(1, 3, 52113463, 1, 17371155);
        test(1, 3, 52113464, 1, 17371155);
        test(1, 3, 52113465, 1, 17371155);

        test(1, 3, 664, 1, 222);
        test(1, 3, 665, 1, 222);
        test(1, 3, 666, 1, 222);
        test(1, 3, 775, 1, 259);
        test(1, 3, 776, 1, 259);
        test(1, 3, 777, 1, 259);
        test(1, 3, 886, 1, 296);
        test(1, 3, 887, 1, 296);
        test(1, 3, 888, 1, 296);
        //endregion

        //region two floor, three apartments on the floor
        test(2, 3, 1, 1, 1);
        test(2, 3, 2, 1, 1);
        test(2, 3, 3, 1, 1);
        test(2, 3, 4, 2, 1);
        test(2, 3, 5, 2, 1);
        test(2, 3, 6, 2, 1);

        test(2, 3, 7, 1, 2);
        test(2, 3, 8, 1, 2);
        test(2, 3, 9, 1, 2);
        test(2, 3, 10, 2, 2);
        test(2, 3, 11, 2, 2);
        test(2, 3, 12, 2, 2);

        test(2, 3, MAX_VALUE - 12, 1, (MAX_VALUE - 7) / 6);
        test(2, 3, MAX_VALUE - 11, 1, (MAX_VALUE - 7) / 6);
        test(2, 3, MAX_VALUE - 10, 1, (MAX_VALUE - 7) / 6);
        test(2, 3, MAX_VALUE - 9, 2, (MAX_VALUE - 7) / 6);
        test(2, 3, MAX_VALUE - 8, 2, (MAX_VALUE - 7) / 6);
        test(2, 3, MAX_VALUE - 7, 2, (MAX_VALUE - 7) / 6);

        test(2, 3, MAX_VALUE - 6, 1, (MAX_VALUE - 1) / 6);
        test(2, 3, MAX_VALUE - 5, 1, (MAX_VALUE - 1) / 6);
        test(2, 3, MAX_VALUE - 4, 1, (MAX_VALUE - 1) / 6);
        test(2, 3, MAX_VALUE - 3, 2, (MAX_VALUE - 1) / 6);
        test(2, 3, MAX_VALUE - 2, 2, (MAX_VALUE - 1) / 6);
        test(2, 3, MAX_VALUE - 1, 2, (MAX_VALUE - 1) / 6);

        test(2, 3, MAX_VALUE, 1, 357913942);

        test(2, 3, 13, 1, 3);
        test(2, 3, 14, 1, 3);
        test(2, 3, 15, 1, 3);
        test(2, 3, 16, 2, 3);
        test(2, 3, 17, 2, 3);
        test(2, 3, 18, 2, 3);

        test(2, 3, 31, 1, 6);
        test(2, 3, 32, 1, 6);
        test(2, 3, 33, 1, 6);
        test(2, 3, 34, 2, 6);
        test(2, 3, 35, 2, 6);
        test(2, 3, 36, 2, 6);

        test(2, 3, 97, 1, 17);
        test(2, 3, 98, 1, 17);
        test(2, 3, 99, 1, 17);
        test(2, 3, 100, 2, 17);
        test(2, 3, 101, 2, 17);
        test(2, 3, 102, 2, 17);

        test(2, 3, 6475, 1, 1080);
        test(2, 3, 6476, 1, 1080);
        test(2, 3, 6477, 1, 1080);
        test(2, 3, 6478, 2, 1080);
        test(2, 3, 6479, 2, 1080);
        test(2, 3, 6480, 2, 1080);

        test(2, 3, 373243, 1, 62208);
        test(2, 3, 373244, 1, 62208);
        test(2, 3, 373245, 1, 62208);
        test(2, 3, 373246, 2, 62208);
        test(2, 3, 373247, 2, 62208);
        test(2, 3, 373248, 2, 62208);

        test(2, 3, 16796155, 1, 2799360);
        test(2, 3, 16796156, 1, 2799360);
        test(2, 3, 16796157, 1, 2799360);
        test(2, 3, 16796158, 2, 2799360);
        test(2, 3, 16796159, 2, 2799360);
        test(2, 3, 16796160, 2, 2799360);
        //endregion

        //region Max/3 floor, three apartments on the floor
        test(MAX_VALUE / 3, 3, 1, 1, 1);
        test(MAX_VALUE / 3, 3, 2, 1, 1);
        test(MAX_VALUE / 3, 3, 3, 1, 1);
        test(MAX_VALUE / 3, 3, 4, 2, 1);
        test(MAX_VALUE / 3, 3, 5, 2, 1);
        test(MAX_VALUE / 3, 3, 6, 2, 1);

        test(MAX_VALUE / 3, 3, MAX_VALUE / 3 - 5, (MAX_VALUE / 3) / 3 - 1, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE / 3 - 4, (MAX_VALUE / 3) / 3 - 1, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE / 3 - 3, (MAX_VALUE / 3) / 3 - 1, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE / 3 - 2, (MAX_VALUE / 3) / 3, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE / 3 - 1, (MAX_VALUE / 3) / 3, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE / 3, (MAX_VALUE / 3) / 3, 1);

        test(MAX_VALUE / 3, 3, MAX_VALUE - 5, (MAX_VALUE / 3) - 1, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE - 4, (MAX_VALUE / 3) - 1, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE - 3, MAX_VALUE / 3, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE - 2, MAX_VALUE / 3, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE - 1, MAX_VALUE / 3, 1);
        test(MAX_VALUE / 3, 3, MAX_VALUE, 1, 2);
        //endregion

        //region one floor, four apartments on the floor
        test(1, 4, 1, 1, 1);
        test(1, 4, 2, 1, 1);
        test(1, 4, 3, 1, 1);
        test(1, 4, 4, 1, 1);

        test(1, 4, 5, 1, 2);
        test(1, 4, 6, 1, 2);
        test(1, 4, 7, 1, 2);
        test(1, 4, 8, 1, 2);

        test(1, 4, 9, 1, 3);
        test(1, 4, 10, 1, 3);
        test(1, 4, 11, 1, 3);
        test(1, 4, 12, 1, 3);

        test(1, 4, MAX_VALUE - 10, 1, (MAX_VALUE - 7) / 4);
        test(1, 4, MAX_VALUE - 9, 1, (MAX_VALUE - 7) / 4);
        test(1, 4, MAX_VALUE - 8, 1, (MAX_VALUE - 7) / 4);
        test(1, 4, MAX_VALUE - 7, 1, (MAX_VALUE - 7) / 4);

        test(1, 4, MAX_VALUE - 6, 1, (MAX_VALUE - 3) / 4);
        test(1, 4, MAX_VALUE - 5, 1, (MAX_VALUE - 3) / 4);
        test(1, 4, MAX_VALUE - 4, 1, (MAX_VALUE - 3) / 4);
        test(1, 4, MAX_VALUE - 3, 1, (MAX_VALUE - 3) / 4);

        test(1, 4, MAX_VALUE - 2, 1, 536870912);
        test(1, 4, MAX_VALUE - 1, 1, 536870912);
        test(1, 4, MAX_VALUE, 1, 536870912);

        test(1, 4, 13, 1, 4);
        test(1, 4, 14, 1, 4);
        test(1, 4, 15, 1, 4);
        test(1, 4, 16, 1, 4);

        test(1, 4, 17, 1, 5);
        test(1, 4, 18, 1, 5);
        test(1, 4, 19, 1, 5);
        test(1, 4, 20, 1, 5);

        test(1, 4, 21, 1, 6);
        test(1, 4, 22, 1, 6);
        test(1, 4, 23, 1, 6);
        test(1, 4, 24, 1, 6);

        test(1, 4, 33, 1, 9);
        test(1, 4, 34, 1, 9);
        test(1, 4, 35, 1, 9);
        test(1, 4, 36, 1, 9);

        test(1, 4, 77, 1, 20);
        test(1, 4, 78, 1, 20);
        test(1, 4, 79, 1, 20);
        test(1, 4, 80, 1, 20);

        test(1, 4, 533, 1, 134);
        test(1, 4, 534, 1, 134);
        test(1, 4, 535, 1, 134);
        test(1, 4, 536, 1, 134);

        test(1, 4, 65473, 1, 16369);
        test(1, 4, 65474, 1, 16369);
        test(1, 4, 65475, 1, 16369);
        test(1, 4, 65476, 1, 16369);

        test(1, 4, 6352441, 1, 1588111);
        test(1, 4, 6352442, 1, 1588111);
        test(1, 4, 6352443, 1, 1588111);
        test(1, 4, 6352444, 1, 1588111);

        test(1, 4, 52113465, 1, 13028367);
        test(1, 4, 52113466, 1, 13028367);
        test(1, 4, 52113467, 1, 13028367);
        test(1, 4, 52113468, 1, 13028367);

        test(1, 4, 665, 1, 167);
        test(1, 4, 666, 1, 167);
        test(1, 4, 667, 1, 167);
        test(1, 4, 668, 1, 167);

        test(1, 4, 777, 1, 195);
        test(1, 4, 778, 1, 195);
        test(1, 4, 779, 1, 195);
        test(1, 4, 780, 1, 195);

        test(1, 4, 885, 1, 222);
        test(1, 4, 886, 1, 222);
        test(1, 4, 887, 1, 222);
        test(1, 4, 888, 1, 222);
        //endregion

        //region two floor, four apartments on the floor
        test(2, 4, 1, 1, 1);
        test(2, 4, 2, 1, 1);
        test(2, 4, 3, 1, 1);
        test(2, 4, 4, 1, 1);
        test(2, 4, 5, 2, 1);
        test(2, 4, 6, 2, 1);
        test(2, 4, 7, 2, 1);
        test(2, 4, 8, 2, 1);

        test(2, 4, 9, 1, 2);
        test(2, 4, 10, 1, 2);
        test(2, 4, 11, 1, 2);
        test(2, 4, 12, 1, 2);
        test(2, 4, 13, 2, 2);
        test(2, 4, 14, 2, 2);
        test(2, 4, 15, 2, 2);
        test(2, 4, 16, 2, 2);

        test(2, 4, MAX_VALUE - 14, 1, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 13, 1, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 12, 1, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 11, 1, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 10, 2, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 9, 2, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 8, 2, (MAX_VALUE - 7) / 8);
        test(2, 4, MAX_VALUE - 7, 2, (MAX_VALUE - 7) / 8);

        test(2, 4, MAX_VALUE - 6, 1, 268435456);
        test(2, 4, MAX_VALUE - 5, 1, 268435456);
        test(2, 4, MAX_VALUE - 4, 1, 268435456);
        test(2, 4, MAX_VALUE - 3, 1, 268435456);
        test(2, 4, MAX_VALUE - 2, 2, 268435456);
        test(2, 4, MAX_VALUE - 1, 2, 268435456);
        test(2, 4, MAX_VALUE, 2, 268435456);

        test(2, 4, 17, 1, 3);
        test(2, 4, 18, 1, 3);
        test(2, 4, 19, 1, 3);
        test(2, 4, 20, 1, 3);
        test(2, 4, 21, 2, 3);
        test(2, 4, 22, 2, 3);
        test(2, 4, 23, 2, 3);
        test(2, 4, 24, 2, 3);

        test(2, 4, 33, 1, 5);
        test(2, 4, 34, 1, 5);
        test(2, 4, 35, 1, 5);
        test(2, 4, 36, 1, 5);
        test(2, 4, 37, 2, 5);
        test(2, 4, 38, 2, 5);
        test(2, 4, 39, 2, 5);
        test(2, 4, 40, 2, 5);

        test(2, 4, 313, 1, 40);
        test(2, 4, 314, 1, 40);
        test(2, 4, 315, 1, 40);
        test(2, 4, 316, 1, 40);
        test(2, 4, 317, 2, 40);
        test(2, 4, 318, 2, 40);
        test(2, 4, 319, 2, 40);
        test(2, 4, 320, 2, 40);

        test(2, 4, 9209, 1, 1152);
        test(2, 4, 9210, 1, 1152);
        test(2, 4, 9211, 1, 1152);
        test(2, 4, 9212, 1, 1152);
        test(2, 4, 9213, 2, 1152);
        test(2, 4, 9214, 2, 1152);
        test(2, 4, 9215, 2, 1152);
        test(2, 4, 9216, 2, 1152);

        test(2, 4, 589_817, 1, 73728);
        test(2, 4, 589_818, 1, 73728);
        test(2, 4, 589_819, 1, 73728);
        test(2, 4, 589_820, 1, 73728);
        test(2, 4, 589_821, 2, 73728);
        test(2, 4, 589_822, 2, 73728);
        test(2, 4, 589_823, 2, 73728);
        test(2, 4, 589_824, 2, 73728);

        test(2, 4, 65_011_705, 1, 8_126_464);
        test(2, 4, 65_011_706, 1, 8_126_464);
        test(2, 4, 65_011_707, 1, 8_126_464);
        test(2, 4, 65_011_708, 1, 8_126_464);
        test(2, 4, 65_011_709, 2, 8_126_464);
        test(2, 4, 65_011_710, 2, 8_126_464);
        test(2, 4, 65_011_711, 2, 8_126_464);
        test(2, 4, 65_011_712, 2, 8_126_464);

        test(2, 4, 2_013_265_913, 1, 251_658_240);
        test(2, 4, 2_013_265_914, 1, 251_658_240);
        test(2, 4, 2_013_265_915, 1, 251_658_240);
        test(2, 4, 2_013_265_916, 1, 251_658_240);
        test(2, 4, 2_013_265_917, 2, 251_658_240);
        test(2, 4, 2_013_265_918, 2, 251_658_240);
        test(2, 4, 2_013_265_919, 2, 251_658_240);
        test(2, 4, 2_013_265_920, 2, 251_658_240);
        //endregion

        //region MAX/4 floor, four apartments on the floor
        test(MAX_VALUE / 4, 4, 1, 1, 1);
        test(MAX_VALUE / 4, 4, 2, 1, 1);
        test(MAX_VALUE / 4, 4, 3, 1, 1);
        test(MAX_VALUE / 4, 4, 4, 1, 1);
        test(MAX_VALUE / 4, 4, 5, 2, 1);
        test(MAX_VALUE / 4, 4, 6, 2, 1);
        test(MAX_VALUE / 4, 4, 7, 2, 1);
        test(MAX_VALUE / 4, 4, 8, 2, 1);

        test(MAX_VALUE / 4, 4, 9, 3, 1);
        test(MAX_VALUE / 4, 4, 10, 3, 1);
        test(MAX_VALUE / 4, 4, 11, 3, 1);
        test(MAX_VALUE / 4, 4, 12, 3, 1);
        test(MAX_VALUE / 4, 4, 13, 4, 1);
        test(MAX_VALUE / 4, 4, 14, 4, 1);
        test(MAX_VALUE / 4, 4, 15, 4, 1);
        test(MAX_VALUE / 4, 4, 16, 4, 1);

        test(MAX_VALUE / 4, 4, MAX_VALUE - 16, (MAX_VALUE / 4) - 3, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 15, (MAX_VALUE / 4) - 3, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 14, (MAX_VALUE / 4) - 2, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 13, (MAX_VALUE / 4) - 2, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 12, (MAX_VALUE / 4) - 2, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 11, (MAX_VALUE / 4) - 2, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 10, (MAX_VALUE / 4) - 1, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 9, (MAX_VALUE / 4) - 1, 1);

        test(MAX_VALUE / 4, 4, MAX_VALUE - 8, (MAX_VALUE / 4) - 1, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 7, (MAX_VALUE / 4) - 1, 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 6, (MAX_VALUE / 4), 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 5, (MAX_VALUE / 4), 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 4, (MAX_VALUE / 4), 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 3, (MAX_VALUE / 4), 1);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 2, 1, 2);
        test(MAX_VALUE / 4, 4, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 4, 4, MAX_VALUE, 1, 2);

        test(MAX_VALUE / 4, 4, 17, 5, 1);
        test(MAX_VALUE / 4, 4, 18, 5, 1);
        test(MAX_VALUE / 4, 4, 19, 5, 1);
        test(MAX_VALUE / 4, 4, 20, 5, 1);
        test(MAX_VALUE / 4, 4, 21, 6, 1);
        test(MAX_VALUE / 4, 4, 22, 6, 1);
        test(MAX_VALUE / 4, 4, 23, 6, 1);
        test(MAX_VALUE / 4, 4, 24, 6, 1);

        test(MAX_VALUE / 4, 4, 33, 9, 1);
        test(MAX_VALUE / 4, 4, 34, 9, 1);
        test(MAX_VALUE / 4, 4, 35, 9, 1);
        test(MAX_VALUE / 4, 4, 36, 9, 1);
        test(MAX_VALUE / 4, 4, 37, 10, 1);
        test(MAX_VALUE / 4, 4, 38, 10, 1);
        test(MAX_VALUE / 4, 4, 39, 10, 1);
        test(MAX_VALUE / 4, 4, 40, 10, 1);

        test(MAX_VALUE / 4, 4, 313, 79, 1);
        test(MAX_VALUE / 4, 4, 314, 79, 1);
        test(MAX_VALUE / 4, 4, 315, 79, 1);
        test(MAX_VALUE / 4, 4, 316, 79, 1);
        test(MAX_VALUE / 4, 4, 317, 80, 1);
        test(MAX_VALUE / 4, 4, 318, 80, 1);
        test(MAX_VALUE / 4, 4, 319, 80, 1);
        test(MAX_VALUE / 4, 4, 320, 80, 1);

        test(MAX_VALUE / 4, 4, 9209, 2303, 1);
        test(MAX_VALUE / 4, 4, 9210, 2303, 1);
        test(MAX_VALUE / 4, 4, 9211, 2303, 1);
        test(MAX_VALUE / 4, 4, 9212, 2303, 1);
        test(MAX_VALUE / 4, 4, 9213, 2304, 1);
        test(MAX_VALUE / 4, 4, 9214, 2304, 1);
        test(MAX_VALUE / 4, 4, 9215, 2304, 1);
        test(MAX_VALUE / 4, 4, 9216, 2304, 1);

        test(MAX_VALUE / 4, 4, 589_817, 147455, 1);
        test(MAX_VALUE / 4, 4, 589_818, 147455, 1);
        test(MAX_VALUE / 4, 4, 589_819, 147455, 1);
        test(MAX_VALUE / 4, 4, 589820, 147455, 1);
        test(MAX_VALUE / 4, 4, 589_821, 147456, 1);
        test(MAX_VALUE / 4, 4, 589_822, 147456, 1);
        test(MAX_VALUE / 4, 4, 589_823, 147456, 1);
        test(MAX_VALUE / 4, 4, 589_824, 147456, 1);

        test(MAX_VALUE / 4, 4, 65_011_705, 16252927, 1);
        test(MAX_VALUE / 4, 4, 65_011_706, 16252927, 1);
        test(MAX_VALUE / 4, 4, 65_011_707, 16252927, 1);
        test(MAX_VALUE / 4, 4, 65011708, 16252927, 1);
        test(MAX_VALUE / 4, 4, 65_011_709, 16252928, 1);
        test(MAX_VALUE / 4, 4, 65_011_710, 16252928, 1);
        test(MAX_VALUE / 4, 4, 65_011_711, 16252928, 1);
        test(MAX_VALUE / 4, 4, 65_011_712, 16252928, 1);

        test(MAX_VALUE / 4, 4, 2_013_265_913, 503316479, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_914, 503316479, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_915, 503316479, 1);
        test(MAX_VALUE / 4, 4, 2013265916, 503316479, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_917, 503316480, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_918, 503316480, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_919, 503316480, 1);
        test(MAX_VALUE / 4, 4, 2_013_265_920, 503316480, 1);
        //endregion

        //region one floor, five apartments on the floor
        test(1, 5, 1, 1, 1);
        test(1, 5, 2, 1, 1);
        test(1, 5, 3, 1, 1);
        test(1, 5, 4, 1, 1);
        test(1, 5, 5, 1, 1);

        test(1, 5, 6, 1, 2);
        test(1, 5, 7, 1, 2);
        test(1, 5, 8, 1, 2);
        test(1, 5, 9, 1, 2);
        test(1, 5, 10, 1, 2);

        test(1, 5, 11, 1, 3);
        test(1, 5, 12, 1, 3);
        test(1, 5, 13, 1, 3);
        test(1, 5, 14, 1, 3);
        test(1, 5, 15, 1, 3);

        test(1, 5, MAX_VALUE - 11, 1, (MAX_VALUE - 7) / 5);
        test(1, 5, MAX_VALUE - 10, 1, (MAX_VALUE - 7) / 5);
        test(1, 5, MAX_VALUE - 9, 1, (MAX_VALUE - 7) / 5);
        test(1, 5, MAX_VALUE - 8, 1, (MAX_VALUE - 7) / 5);
        test(1, 5, MAX_VALUE - 7, 1, (MAX_VALUE - 7) / 5);

        test(1, 5, MAX_VALUE - 6, 1, (MAX_VALUE - 2) / 5);
        test(1, 5, MAX_VALUE - 5, 1, (MAX_VALUE - 2) / 5);
        test(1, 5, MAX_VALUE - 4, 1, (MAX_VALUE - 2) / 5);
        test(1, 5, MAX_VALUE - 3, 1, (MAX_VALUE - 2) / 5);
        test(1, 5, MAX_VALUE - 2, 1, (MAX_VALUE - 2) / 5);

        test(1, 5, MAX_VALUE - 1, 1, 429496730);
        test(1, 5, MAX_VALUE, 1, 429496730);

        test(1, 5, 16, 1, 4);
        test(1, 5, 17, 1, 4);
        test(1, 5, 18, 1, 4);
        test(1, 5, 19, 1, 4);
        test(1, 5, 20, 1, 4);

        test(1, 5, 21, 1, 5);
        test(1, 5, 22, 1, 5);
        test(1, 5, 23, 1, 5);
        test(1, 5, 24, 1, 5);
        test(1, 5, 25, 1, 5);

        test(1, 5, 31, 1, 7);
        test(1, 5, 32, 1, 7);
        test(1, 5, 33, 1, 7);
        test(1, 5, 34, 1, 7);
        test(1, 5, 35, 1, 7);

        test(1, 5, 76, 1, 16);
        test(1, 5, 77, 1, 16);
        test(1, 5, 78, 1, 16);
        test(1, 5, 79, 1, 16);
        test(1, 5, 80, 1, 16);

        test(1, 5, 531, 1, 107);
        test(1, 5, 532, 1, 107);
        test(1, 5, 533, 1, 107);
        test(1, 5, 534, 1, 107);
        test(1, 5, 535, 1, 107);

        test(1, 5, 65471, 1, 13095);
        test(1, 5, 65472, 1, 13095);
        test(1, 5, 65473, 1, 13095);
        test(1, 5, 65474, 1, 13095);
        test(1, 5, 65475, 1, 13095);

        test(1, 5, 6352441, 1, 1270489);
        test(1, 5, 6352442, 1, 1270489);
        test(1, 5, 6352443, 1, 1270489);
        test(1, 5, 6352444, 1, 1270489);
        test(1, 5, 6352445, 1, 1270489);

        test(1, 5, 52113466, 1, 10422694);
        test(1, 5, 52113467, 1, 10422694);
        test(1, 5, 52113468, 1, 10422694);
        test(1, 5, 52113469, 1, 10422694);
        test(1, 5, 52113470, 1, 10422694);

        test(1, 5, 666, 1, 134);
        test(1, 5, 667, 1, 134);
        test(1, 5, 668, 1, 134);
        test(1, 5, 669, 1, 134);
        test(1, 5, 670, 1, 134);

        test(1, 5, 776, 1, 156);
        test(1, 5, 777, 1, 156);
        test(1, 5, 778, 1, 156);
        test(1, 5, 779, 1, 156);
        test(1, 5, 780, 1, 156);

        test(1, 5, 886, 1, 178);
        test(1, 5, 887, 1, 178);
        test(1, 5, 888, 1, 178);
        test(1, 5, 889, 1, 178);
        test(1, 5, 890, 1, 178);
        //endregion

        //region two floor, five apartments on the floor
        test(2, 5, 1, 1, 1);
        test(2, 5, 2, 1, 1);
        test(2, 5, 3, 1, 1);
        test(2, 5, 4, 1, 1);
        test(2, 5, 5, 1, 1);
        test(2, 5, 6, 2, 1);
        test(2, 5, 7, 2, 1);
        test(2, 5, 8, 2, 1);
        test(2, 5, 9, 2, 1);
        test(2, 5, 10, 2, 1);

        test(2, 5, 11, 1, 2);
        test(2, 5, 12, 1, 2);
        test(2, 5, 13, 1, 2);
        test(2, 5, 14, 1, 2);
        test(2, 5, 15, 1, 2);
        test(2, 5, 16, 2, 2);
        test(2, 5, 17, 2, 2);
        test(2, 5, 18, 2, 2);
        test(2, 5, 19, 2, 2);
        test(2, 5, 20, 2, 2);

        test(2, 5, MAX_VALUE - 16, 1, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 15, 1, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 14, 1, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 13, 1, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 12, 1, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 11, 2, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 10, 2, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 9, 2, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 8, 2, (MAX_VALUE - 7) / 10);
        test(2, 5, MAX_VALUE - 7, 2, (MAX_VALUE - 7) / 10);

        test(2, 5, MAX_VALUE - 6, 1, 214748365);
        test(2, 5, MAX_VALUE - 5, 1, 214748365);
        test(2, 5, MAX_VALUE - 4, 1, 214748365);
        test(2, 5, MAX_VALUE - 3, 1, 214748365);
        test(2, 5, MAX_VALUE - 2, 1, 214748365);
        test(2, 5, MAX_VALUE - 1, 2, 214748365);
        test(2, 5, MAX_VALUE, 2, 214748365);

        test(2, 5, 21, 1, 3);
        test(2, 5, 22, 1, 3);
        test(2, 5, 23, 1, 3);
        test(2, 5, 24, 1, 3);
        test(2, 5, 25, 1, 3);

        test(2, 5, 31, 1, 4);
        test(2, 5, 32, 1, 4);
        test(2, 5, 33, 1, 4);
        test(2, 5, 34, 1, 4);
        test(2, 5, 35, 1, 4);
        test(2, 5, 36, 2, 4);
        test(2, 5, 37, 2, 4);
        test(2, 5, 38, 2, 4);
        test(2, 5, 39, 2, 4);
        test(2, 5, 40, 2, 4);

        test(2, 5, 311, 1, 32);
        test(2, 5, 312, 1, 32);
        test(2, 5, 313, 1, 32);
        test(2, 5, 314, 1, 32);
        test(2, 5, 315, 1, 32);
        test(2, 5, 316, 2, 32);
        test(2, 5, 317, 2, 32);
        test(2, 5, 318, 2, 32);
        test(2, 5, 319, 2, 32);
        test(2, 5, 320, 2, 32);

        test(2, 5, 9211, 1, 922);
        test(2, 5, 9212, 1, 922);
        test(2, 5, 9213, 1, 922);
        test(2, 5, 9214, 1, 922);
        test(2, 5, 9215, 1, 922);
        test(2, 5, 9216, 2, 922);
        test(2, 5, 9217, 2, 922);
        test(2, 5, 9218, 2, 922);
        test(2, 5, 9219, 2, 922);
        test(2, 5, 9220, 2, 922);

        test(2, 5, 589_811, 1, 58982);
        test(2, 5, 589_812, 1, 58982);
        test(2, 5, 589_813, 1, 58982);
        test(2, 5, 589_814, 1, 58982);
        test(2, 5, 589_815, 1, 58982);
        test(2, 5, 589_816, 2, 58982);
        test(2, 5, 589_817, 2, 58982);
        test(2, 5, 589_818, 2, 58982);
        test(2, 5, 589_819, 2, 58982);
        test(2, 5, 589820, 2, 58982);

        test(2, 5, 65_011_701, 1, 6501171);
        test(2, 5, 65_011_702, 1, 6501171);
        test(2, 5, 65_011_703, 1, 6501171);
        test(2, 5, 65_011_704, 1, 6501171);
        test(2, 5, 65_011_705, 1, 6501171);
        test(2, 5, 65_011_706, 2, 6501171);
        test(2, 5, 65_011_707, 2, 6501171);
        test(2, 5, 65_011_708, 2, 6501171);
        test(2, 5, 65_011_709, 2, 6501171);
        test(2, 5, 65011710, 2, 6501171);

        test(2, 5, 2_013_265_911, 1, 201326592);
        test(2, 5, 2_013_265_912, 1, 201326592);
        test(2, 5, 2_013_265_913, 1, 201326592);
        test(2, 5, 2_013_265_914, 1, 201326592);
        test(2, 5, 2_013_265_915, 1, 201326592);
        test(2, 5, 2_013_265_916, 2, 201326592);
        test(2, 5, 2_013_265_917, 2, 201326592);
        test(2, 5, 2_013_265_918, 2, 201326592);
        test(2, 5, 2_013_265_919, 2, 201326592);
        test(2, 5, 2013265920, 2, 201326592);
        //endregion

        //region MAX/5 floor, five apartments on the floor
        test(MAX_VALUE / 5, 5, 1, 1, 1);
        test(MAX_VALUE / 5, 5, 2, 1, 1);
        test(MAX_VALUE / 5, 5, 3, 1, 1);
        test(MAX_VALUE / 5, 5, 4, 1, 1);
        test(MAX_VALUE / 5, 5, 5, 1, 1);
        test(MAX_VALUE / 5, 5, 6, 2, 1);
        test(MAX_VALUE / 5, 5, 7, 2, 1);
        test(MAX_VALUE / 5, 5, 8, 2, 1);
        test(MAX_VALUE / 5, 5, 9, 2, 1);
        test(MAX_VALUE / 5, 5, 10, 2, 1);

        test(MAX_VALUE / 5, 5, 11, 3, 1);
        test(MAX_VALUE / 5, 5, 12, 3, 1);
        test(MAX_VALUE / 5, 5, 13, 3, 1);
        test(MAX_VALUE / 5, 5, 14, 3, 1);
        test(MAX_VALUE / 5, 5, 15, 3, 1);
        test(MAX_VALUE / 5, 5, 16, 4, 1);
        test(MAX_VALUE / 5, 5, 17, 4, 1);
        test(MAX_VALUE / 5, 5, 18, 4, 1);
        test(MAX_VALUE / 5, 5, 19, 4, 1);
        test(MAX_VALUE / 5, 5, 20, 4, 1);

        test(MAX_VALUE / 5, 5, MAX_VALUE - 16, 429496727, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 15, 429496727, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 14, 429496727, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 13, 429496727, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 12, 429496727, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 11, 429496728, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 10, 429496728, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 9, 429496728, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 8, 429496728, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 7, 429496728, 1);

        test(MAX_VALUE / 5, 5, MAX_VALUE - 6, 429496729, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 5, 429496729, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 4, 429496729, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 3, 429496729, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 2, 429496729, 1);
        test(MAX_VALUE / 5, 5, MAX_VALUE - 1, 1, 2);
        test(MAX_VALUE / 5, 5, MAX_VALUE, 1, 2);

        test(MAX_VALUE / 5, 5, 21, 5, 1);
        test(MAX_VALUE / 5, 5, 22, 5, 1);
        test(MAX_VALUE / 5, 5, 23, 5, 1);
        test(MAX_VALUE / 5, 5, 24, 5, 1);
        test(MAX_VALUE / 5, 5, 25, 5, 1);

        test(MAX_VALUE / 5, 5, 31, 7, 1);
        test(MAX_VALUE / 5, 5, 32, 7, 1);
        test(MAX_VALUE / 5, 5, 33, 7, 1);
        test(MAX_VALUE / 5, 5, 34, 7, 1);
        test(MAX_VALUE / 5, 5, 35, 7, 1);
        test(MAX_VALUE / 5, 5, 36, 8, 1);
        test(MAX_VALUE / 5, 5, 37, 8, 1);
        test(MAX_VALUE / 5, 5, 38, 8, 1);
        test(MAX_VALUE / 5, 5, 39, 8, 1);
        test(MAX_VALUE / 5, 5, 40, 8, 1);

        test(MAX_VALUE / 5, 5, 311, 63, 1);
        test(MAX_VALUE / 5, 5, 312, 63, 1);
        test(MAX_VALUE / 5, 5, 313, 63, 1);
        test(MAX_VALUE / 5, 5, 314, 63, 1);
        test(MAX_VALUE / 5, 5, 315, 63, 1);
        test(MAX_VALUE / 5, 5, 316, 64, 1);
        test(MAX_VALUE / 5, 5, 317, 64, 1);
        test(MAX_VALUE / 5, 5, 318, 64, 1);
        test(MAX_VALUE / 5, 5, 319, 64, 1);
        test(MAX_VALUE / 5, 5, 320, 64, 1);

        test(MAX_VALUE / 5, 5, 9211, 1843, 1);
        test(MAX_VALUE / 5, 5, 9212, 1843, 1);
        test(MAX_VALUE / 5, 5, 9213, 1843, 1);
        test(MAX_VALUE / 5, 5, 9214, 1843, 1);
        test(MAX_VALUE / 5, 5, 9215, 1843, 1);
        test(MAX_VALUE / 5, 5, 9216, 1844, 1);
        test(MAX_VALUE / 5, 5, 9217, 1844, 1);
        test(MAX_VALUE / 5, 5, 9218, 1844, 1);
        test(MAX_VALUE / 5, 5, 9219, 1844, 1);
        test(MAX_VALUE / 5, 5, 9220, 1844, 1);

        test(MAX_VALUE / 5, 5, 589_811, 117963, 1);
        test(MAX_VALUE / 5, 5, 589_812, 117963, 1);
        test(MAX_VALUE / 5, 5, 589_813, 117963, 1);
        test(MAX_VALUE / 5, 5, 589_814, 117963, 1);
        test(MAX_VALUE / 5, 5, 589_815, 117963, 1);
        test(MAX_VALUE / 5, 5, 589_816, 117964, 1);
        test(MAX_VALUE / 5, 5, 589_817, 117964, 1);
        test(MAX_VALUE / 5, 5, 589_818, 117964, 1);
        test(MAX_VALUE / 5, 5, 589_819, 117964, 1);
        test(MAX_VALUE / 5, 5, 589820, 117964, 1);

        test(MAX_VALUE / 5, 5, 65_011_701, 13002341, 1);
        test(MAX_VALUE / 5, 5, 65_011_702, 13002341, 1);
        test(MAX_VALUE / 5, 5, 65_011_703, 13002341, 1);
        test(MAX_VALUE / 5, 5, 65_011_704, 13002341, 1);
        test(MAX_VALUE / 5, 5, 65_011_705, 13002341, 1);
        test(MAX_VALUE / 5, 5, 65_011_706, 13002342, 1);
        test(MAX_VALUE / 5, 5, 65_011_707, 13002342, 1);
        test(MAX_VALUE / 5, 5, 65_011_708, 13002342, 1);
        test(MAX_VALUE / 5, 5, 65_011_709, 13002342, 1);
        test(MAX_VALUE / 5, 5, 65011710, 13002342, 1);

        test(MAX_VALUE / 5, 5, 2_013_265_911, 402653183, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_912, 402653183, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_913, 402653183, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_914, 402653183, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_915, 402653183, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_916, 402653184, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_917, 402653184, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_918, 402653184, 1);
        test(MAX_VALUE / 5, 5, 2_013_265_919, 402653184, 1);
        test(MAX_VALUE / 5, 5, 2013265920, 402653184, 1);
        //endregion

        //region three floor, MAx/3 apartments on the floor
        test(3, MAX_VALUE / 3, 1, 1, 1);
        test(3, MAX_VALUE / 3, 2, 1, 1);
        test(3, MAX_VALUE / 3, 3, 1, 1);
        test(3, MAX_VALUE / 3, 4, 1, 1);
        test(3, MAX_VALUE / 3, 5, 1, 1);
        test(3, MAX_VALUE / 3, 6, 1, 1);

        test(3, MAX_VALUE / 3, MAX_VALUE / 3 - 5, 1, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE / 3 - 4, 1, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE / 3 - 3, 1, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE / 3 - 2, 1, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE / 3 - 1, 1, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE / 3, 1, 1);

        test(3, MAX_VALUE / 3, MAX_VALUE - 5, 3, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE - 4, 3, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE - 3, 3, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE - 2, 3, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE - 1, 3, 1);
        test(3, MAX_VALUE / 3, MAX_VALUE, 1, 2);
        //endregion

        //region two floor, MAx/2 apartments on the floor
        test(2, MAX_VALUE / 2, 1, 1, 1);
        test(2, MAX_VALUE / 2, 2, 1, 1);
        test(2, MAX_VALUE / 2, 3, 1, 1);
        test(2, MAX_VALUE / 2, 4, 1, 1);
        test(2, MAX_VALUE / 2, 5, 1, 1);
        test(2, MAX_VALUE / 2, 6, 1, 1);

        test(2, MAX_VALUE / 2, MAX_VALUE / 2 - 5, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2 - 4, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2 - 3, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2 - 2, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2 - 1, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2, 1, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE / 2+1 , 2, 1);

        test(2, MAX_VALUE / 2, MAX_VALUE - 5, 2, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE - 4, 2, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE - 3, 2, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE - 2, 2, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE - 1, 2, 1);
        test(2, MAX_VALUE / 2, MAX_VALUE, 1, 2);
        //endregion
    }

    @Test//обычные дома из жизни
    public void subjectArea() {
        //region 9 floors and 4 apartments per floor
        test(9, 4, 1, 1, 1);
        test(9, 4, 2, 1, 1);
        test(9, 4, 3, 1, 1);
        test(9, 4, 4, 1, 1);
        test(9, 4, 321, 9, 9);
        test(9, 4, 322, 9, 9);
        test(9, 4, 323, 9, 9);
        test(9, 4, 324, 9, 9);

        test(9, 4, 5, 2, 1);
        test(9, 4, 8, 2, 1);
        test(9, 4, 9, 3, 1);
        test(9, 4, 12, 3, 1);
        test(9, 4, 13, 4, 1);
        test(9, 4, 16, 4, 1);
        test(9, 4, 17, 5, 1);
        test(9, 4, 20, 5, 1);
        test(9, 4, 21, 6, 1);
        test(9, 4, 24, 6, 1);
        test(9, 4, 25, 7, 1);
        test(9, 4, 28, 7, 1);
        test(9, 4, 29, 8, 1);
        test(9, 4, 32, 8, 1);
        test(9, 4, 33, 9, 1);
        test(9, 4, 36, 9, 1);

        test(9, 4, 37, 1, 2);
        test(9, 4, 40, 1, 2);
        test(9, 4, 41, 2, 2);
        test(9, 4, 44, 2, 2);
        test(9, 4, 45, 3, 2);
        test(9, 4, 48, 3, 2);
        test(9, 4, 49, 4, 2);
        test(9, 4, 52, 4, 2);
        test(9, 4, 53, 5, 2);
        test(9, 4, 56, 5, 2);
        test(9, 4, 57, 6, 2);
        test(9, 4, 60, 6, 2);
        test(9, 4, 61, 7, 2);
        test(9, 4, 64, 7, 2);
        test(9, 4, 65, 8, 2);
        test(9, 4, 68, 8, 2);
        test(9, 4, 69, 9, 2);
        test(9, 4, 72, 9, 2);

        test(9, 4, 73, 1, 3);
        test(9, 4, 76, 1, 3);
        test(9, 4, 77, 2, 3);
        test(9, 4, 80, 2, 3);
        test(9, 4, 81, 3, 3);
        test(9, 4, 84, 3, 3);
        test(9, 4, 85, 4, 3);
        test(9, 4, 88, 4, 3);
        test(9, 4, 89, 5, 3);
        test(9, 4, 92, 5, 3);
        test(9, 4, 93, 6, 3);
        test(9, 4, 96, 6, 3);
        test(9, 4, 97, 7, 3);
        test(9, 4, 100, 7, 3);
        test(9, 4, 101, 8, 3);
        test(9, 4, 104, 8, 3);
        test(9, 4, 105, 9, 3);
        test(9, 4, 108, 9, 3);

        test(9, 4, 109, 1, 4);
        test(9, 4, 112, 1, 4);
        test(9, 4, 113, 2, 4);
        test(9, 4, 116, 2, 4);
        test(9, 4, 117, 3, 4);
        test(9, 4, 120, 3, 4);
        test(9, 4, 121, 4, 4);
        test(9, 4, 124, 4, 4);
        test(9, 4, 125, 5, 4);
        test(9, 4, 128, 5, 4);
        test(9, 4, 129, 6, 4);
        test(9, 4, 132, 6, 4);
        test(9, 4, 133, 7, 4);
        test(9, 4, 136, 7, 4);
        test(9, 4, 137, 8, 4);
        test(9, 4, 140, 8, 4);
        test(9, 4, 141, 9, 4);
        test(9, 4, 144, 9, 4);

        test(9, 4, 145, 1, 5);
        test(9, 4, 148, 1, 5);
        test(9, 4, 149, 2, 5);
        test(9, 4, 152, 2, 5);
        test(9, 4, 153, 3, 5);
        test(9, 4, 156, 3, 5);
        test(9, 4, 157, 4, 5);
        test(9, 4, 160, 4, 5);
        test(9, 4, 161, 5, 5);
        test(9, 4, 164, 5, 5);
        test(9, 4, 165, 6, 5);
        test(9, 4, 168, 6, 5);
        test(9, 4, 169, 7, 5);
        test(9, 4, 172, 7, 5);
        test(9, 4, 173, 8, 5);
        test(9, 4, 176, 8, 5);
        test(9, 4, 177, 9, 5);
        test(9, 4, 180, 9, 5);

        test(9, 4, 181, 1, 6);
        test(9, 4, 184, 1, 6);
        test(9, 4, 185, 2, 6);
        test(9, 4, 188, 2, 6);
        test(9, 4, 189, 3, 6);
        test(9, 4, 192, 3, 6);
        test(9, 4, 193, 4, 6);
        test(9, 4, 196, 4, 6);
        test(9, 4, 197, 5, 6);
        test(9, 4, 200, 5, 6);
        test(9, 4, 201, 6, 6);
        test(9, 4, 204, 6, 6);
        test(9, 4, 205, 7, 6);
        test(9, 4, 208, 7, 6);
        test(9, 4, 209, 8, 6);
        test(9, 4, 212, 8, 6);
        test(9, 4, 215, 9, 6);
        test(9, 4, 216, 9, 6);

        test(9, 4, 217, 1, 7);
        test(9, 4, 220, 1, 7);
        test(9, 4, 221, 2, 7);
        test(9, 4, 224, 2, 7);
        test(9, 4, 225, 3, 7);
        test(9, 4, 228, 3, 7);
        test(9, 4, 229, 4, 7);
        test(9, 4, 232, 4, 7);
        test(9, 4, 233, 5, 7);
        test(9, 4, 236, 5, 7);
        test(9, 4, 237, 6, 7);
        test(9, 4, 240, 6, 7);
        test(9, 4, 241, 7, 7);
        test(9, 4, 244, 7, 7);
        test(9, 4, 245, 8, 7);
        test(9, 4, 248, 8, 7);
        test(9, 4, 249, 9, 7);
        test(9, 4, 252, 9, 7);

        test(9, 4, 253, 1, 8);
        test(9, 4, 256, 1, 8);
        test(9, 4, 257, 2, 8);
        test(9, 4, 260, 2, 8);
        test(9, 4, 261, 3, 8);
        test(9, 4, 264, 3, 8);
        test(9, 4, 265, 4, 8);
        test(9, 4, 268, 4, 8);
        test(9, 4, 269, 5, 8);
        test(9, 4, 272, 5, 8);
        test(9, 4, 273, 6, 8);
        test(9, 4, 276, 6, 8);
        test(9, 4, 277, 7, 8);
        test(9, 4, 280, 7, 8);
        test(9, 4, 281, 8, 8);
        test(9, 4, 284, 8, 8);
        test(9, 4, 285, 9, 8);
        test(9, 4, 288, 9, 8);

        test(9, 4, 289, 1, 9);
        test(9, 4, 292, 1, 9);
        test(9, 4, 293, 2, 9);
        test(9, 4, 296, 2, 9);
        test(9, 4, 297, 3, 9);
        test(9, 4, 300, 3, 9);
        test(9, 4, 301, 4, 9);
        test(9, 4, 304, 4, 9);
        test(9, 4, 305, 5, 9);
        test(9, 4, 308, 5, 9);
        test(9, 4, 309, 6, 9);
        test(9, 4, 312, 6, 9);
        test(9, 4, 313, 7, 9);
        test(9, 4, 316, 7, 9);
        test(9, 4, 317, 8, 9);
        test(9, 4, 320, 8, 9);
        test(9, 4, 321, 9, 9);
        test(9, 4, 324, 9, 9);

        test(9, 4, 19, 5, 1);
        test(9, 4, 43, 2, 2);
        test(9, 4, 54, 5, 2);
        test(9, 4, 87, 4, 3);
        test(9, 4, 99, 7, 3);
        test(9, 4, 105, 9, 3);
        test(9, 4, 126, 5, 4);
        test(9, 4, 151, 2, 5);
        test(9, 4, 215, 9, 6);
        test(9, 4, 222, 2, 7);
        test(9, 4, 283, 8, 8);
        test(9, 4, 298, 3, 9);
        test(9, 4, 314, 7, 9);

        test(9, 4, 66, 8, 2);
        test(9, 4, 90, 5, 3);
        //endregion

        //region 5 floor and 3 apartments on the floor
        test(5, 3, 1, 1, 1);
        test(5, 3, 2, 1, 1);
        test(5, 3, 3, 1, 1);
        test(5, 3, 73, 5, 5);
        test(5, 3, 74, 5, 5);
        test(5, 3, 75, 5, 5);

        test(5, 3, 4, 2, 1);
        test(5, 3, 6, 2, 1);
        test(5, 3, 7, 3, 1);
        test(5, 3, 9, 3, 1);
        test(5, 3, 10, 4, 1);
        test(5, 3, 12, 4, 1);
        test(5, 3, 13, 5, 1);
        test(5, 3, 15, 5, 1);

        test(5, 3, 16, 1, 2);
        test(5, 3, 18, 1, 2);
        test(5, 3, 19, 2, 2);
        test(5, 3, 21, 2, 2);
        test(5, 3, 22, 3, 2);
        test(5, 3, 24, 3, 2);
        test(5, 3, 25, 4, 2);
        test(5, 3, 27, 4, 2);
        test(5, 3, 28, 5, 2);
        test(5, 3, 30, 5, 2);

        test(5, 3, 31, 1, 3);
        test(5, 3, 33, 1, 3);
        test(5, 3, 34, 2, 3);
        test(5, 3, 36, 2, 3);
        test(5, 3, 37, 3, 3);
        test(5, 3, 39, 3, 3);
        test(5, 3, 40, 4, 3);
        test(5, 3, 42, 4, 3);
        test(5, 3, 43, 5, 3);
        test(5, 3, 45, 5, 3);

        test(5, 3, 46, 1, 4);
        test(5, 3, 48, 1, 4);
        test(5, 3, 49, 2, 4);
        test(5, 3, 51, 2, 4);
        test(5, 3, 52, 3, 4);
        test(5, 3, 54, 3, 4);
        test(5, 3, 55, 4, 4);
        test(5, 3, 57, 4, 4);
        test(5, 3, 58, 5, 4);
        test(5, 3, 60, 5, 4);

        test(5, 3, 61, 1, 5);
        test(5, 3, 63, 1, 5);
        test(5, 3, 64, 2, 5);
        test(5, 3, 66, 2, 5);
        test(5, 3, 67, 3, 5);
        test(5, 3, 69, 3, 5);
        test(5, 3, 70, 4, 5);
        test(5, 3, 72, 4, 5);
        test(5, 3, 73, 5, 5);
        test(5, 3, 75, 5, 5);

        test(5, 3, 5, 2, 1);
        test(5, 3, 8, 3, 1);
        test(5, 3, 11, 4, 1);
        test(5, 3, 14, 5, 1);

        test(5, 3, 17, 1, 2);
        test(5, 3, 20, 2, 2);
        test(5, 3, 23, 3, 2);
        test(5, 3, 26, 4, 2);
        test(5, 3, 29, 5, 2);

        test(5, 3, 32, 1, 3);
        test(5, 3, 35, 2, 3);
        test(5, 3, 38, 3, 3);
        test(5, 3, 41, 4, 3);
        test(5, 3, 44, 5, 3);

        test(5, 3, 47, 1, 4);
        test(5, 3, 50, 2, 4);
        test(5, 3, 53, 3, 4);
        test(5, 3, 56, 4, 4);
        test(5, 3, 59, 5, 4);

        test(5, 3, 62, 1, 5);
        test(5, 3, 65, 2, 5);
        test(5, 3, 68, 3, 5);
        test(5, 3, 71, 4, 5);
        test(5, 3, 74, 5, 5);
        //endregion

        //region 9 floors and 8 apartments on the floor
        test(9, 8, 1, 1, 1);
        test(9, 8, 2, 1, 1);
        test(9, 8, 3, 1, 1);
        test(9, 8, 4, 1, 1);
        test(9, 8, 5, 1, 1);
        test(9, 8, 6, 1, 1);
        test(9, 8, 7, 1, 1);
        test(9, 8, 8, 1, 1);

        test(9, 8, 137, 9, 2);
        test(9, 8, 138, 9, 2);
        test(9, 8, 139, 9, 2);
        test(9, 8, 140, 9, 2);
        test(9, 8, 141, 9, 2);
        test(9, 8, 142, 9, 2);
        test(9, 8, 143, 9, 2);
        test(9, 8, 144, 9, 2);

        test(9, 8, 9, 2, 1);
        test(9, 8, 16, 2, 1);
        test(9, 8, 17, 3, 1);
        test(9, 8, 24, 3, 1);
        test(9, 8, 25, 4, 1);
        test(9, 8, 32, 4, 1);
        test(9, 8, 33, 5, 1);
        test(9, 8, 40, 5, 1);
        test(9, 8, 41, 6, 1);
        test(9, 8, 48, 6, 1);
        test(9, 8, 49, 7, 1);
        test(9, 8, 56, 7, 1);
        test(9, 8, 57, 8, 1);
        test(9, 8, 64, 8, 1);
        test(9, 8, 65, 9, 1);
        test(9, 8, 72, 9, 1);

        test(9, 8, 73, 1, 2);
        test(9, 8, 80, 1, 2);
        test(9, 8, 81, 2, 2);
        test(9, 8, 88, 2, 2);
        test(9, 8, 89, 3, 2);
        test(9, 8, 96, 3, 2);
        test(9, 8, 97, 4, 2);
        test(9, 8, 104, 4, 2);
        test(9, 8, 105, 5, 2);
        test(9, 8, 112, 5, 2);
        test(9, 8, 113, 6, 2);
        test(9, 8, 120, 6, 2);
        test(9, 8, 121, 7, 2);
        test(9, 8, 128, 7, 2);
        test(9, 8, 129, 8, 2);
        test(9, 8, 136, 8, 2);

        test(9, 8, 14, 2, 1);
        test(9, 8, 23, 3, 1);
        test(9, 8, 28, 4, 1);
        test(9, 8, 34, 5, 1);
        test(9, 8, 45, 6, 1);
        test(9, 8, 51, 7, 1);
        test(9, 8, 62, 8, 1);
        test(9, 8, 71, 9, 1);
        test(9, 8, 74, 1, 2);
        test(9, 8, 84, 2, 2);
        test(9, 8, 91, 3, 2);
        test(9, 8, 102, 4, 2);
        test(9, 8, 109, 5, 2);
        test(9, 8, 119, 6, 2);
        test(9, 8, 125, 7, 2);
        test(9, 8, 134, 8, 2);

        test(9, 8, 11, 2, 1);
        test(9, 8, 22, 3, 1);
        test(9, 8, 44, 6, 1);
        test(9, 8, 55, 7, 1);
        test(9, 8, 66, 9, 1);
        test(9, 8, 77, 1, 2);
        test(9, 8, 99, 4, 2);
        test(9, 8, 111, 5, 2);
        test(9, 8, 122, 7, 2);
        test(9, 8, 133, 8, 2);
        //endregion
    }

    @Test// крайние квартиры
    public void implementation() {
        test(14, 4, 56, 14, 1);
        test(14, 4, 112, 14, 2);
        test(14, 4, 168, 14, 3);
        test(14, 4, 224, 14, 4);
        test(14, 4, 280, 14, 5);
        test(4, 3, 12, 4, 1);
        test(4, 3, 24, 4, 2);
        test(4, 3, 36, 4, 3);
        test(4, 3, 48, 4, 4);
        test(4, 3, 60, 4, 5);
        test(5, 2, 10, 5, 1);
        test(5, 2, 20, 5, 2);
        test(5, 2, 30, 5, 3);
        test(5, 2, 40, 5, 4);
        test(5, 2, 50, 5, 5);

        test(14, 4, 11, 3, 1);
        test(14, 4, 22, 6, 1);
        test(14, 4, 33, 9, 1);
        test(14, 4, 44, 11, 1);
        test(14, 4, 55, 14, 1);
        test(14, 4, 66, 3, 2);
        test(14, 4, 77, 6, 2);
        test(14, 4, 88, 8, 2);
        test(14, 4, 99, 11, 2);
        test(14, 4, 111, 14, 2);
        test(4, 3, 11, 4, 1);
        test(4, 3, 22, 4, 2);
        test(4, 3, 33, 3, 3);
        test(4, 3, 44, 3, 4);
        test(4, 3, 55, 3, 5);
        test(5, 2, 11, 1, 2);
        test(5, 2, 22, 1, 3);
        test(5, 2, 33, 2, 4);
        test(5, 2, 44, 2, 5);
        test(5, 2, 55, 3, 6);
    }

    @Test//любые квартиры в любых домах
    public void randomValues() {
        test(6, 9, 2, 1, 1);
        test(6, 9, 11, 2, 1);
        test(6, 9, 22, 3, 1);
        test(6, 9, 33, 4, 1);
        test(6, 9, 44, 5, 1);
        test(6, 9, 53, 6, 1);
        test(6, 9, 60, 1, 2);
        test(6, 9, 69, 2, 2);
        test(6, 9, 77, 3, 2);
        test(6, 9, 89, 4, 2);
        test(6, 9, 99, 5, 2);
        test(6, 9, 102, 6, 2);
        test(6, 9, 212, 6, 4);
        test(6, 9, 432, 6, 8);
        test(6, 9, 1245, 1, 24);
        test(6, 9, 8154, 6, 151);
        test(6, 9, 12633, 6, 234);
        test(6, 9, 46718, 1, 866);
        test(6, 9, 64791, 5, 1200);
        test(6, 9, 142573, 2, 2641);
        test(6, 9, 367248, 6, 6801);
        test(6, 9, 746136, 2, 13818);
        test(6, 9, 1843992, 6, 34148);
        test(6, 9, 6473914, 2, 119888);
        test(6, 9, 9273124, 4, 171725);
        test(6, 9, 21356821, 5, 395497);
        test(6, 9, 46791340, 2, 866507);
        test(6, 9, 97623147, 1, 1807837);
        test(6, 9, 123794316, 2, 2292488);
        test(6, 9, 794316237, 6, 14709560);
        test(6, 9, 1671286011, 6, 30949741);
        test(6, 9, 1937438136, 6, 35878484);

        test(2316, 423517, 342, 1, 1);
        test(2316, 423517, 1422, 1, 1);
        test(2316, 423517, 4352, 1, 1);
        test(2316, 423517, 11625, 1, 1);
        test(2316, 423517, 34251, 1, 1);
        test(2316, 423517, 83721, 1, 1);
        test(2316, 423517, 125363, 1, 1);
        test(2316, 423517, 152363, 1, 1);
        test(2316, 423517, 413243, 1, 1);
        test(2316, 423517, 435252, 2, 1);
        test(2316, 423517, 647382, 2, 1);
        test(2316, 423517, 846353, 2, 1);
        test(2316, 423517, 1562435, 4, 1);
        test(2316, 423517, 58235420, 138, 1);
        test(2316, 423517, 142453638, 337, 1);
        test(2316, 423517, 574956421, 1358, 1);
        test(2316, 423517, 631258912, 1491, 1);
        test(2316, 423517, 647932691, 1530, 1);
        test(2316, 423517, 746125182, 1762, 1);
        test(2316, 423517, 1253245738, 644, 2);
        test(2316, 423517, 2047354681, 203, 3);
        test(2316, 423517, MAX_VALUE, 439, 3);

        test(53234, 2451, 212, 1, 1);
        test(53234, 2451, 432, 1, 1);
        test(53234, 2451, 1245, 1, 1);
        test(53234, 2451, 8154, 4, 1);
        test(53234, 2451, 12633, 6, 1);
        test(53234, 2451, 46718, 20, 1);
        test(53234, 2451, 64791, 27, 1);
        test(53234, 2451, 142573, 59, 1);
        test(53234, 2451, 367248, 150, 1);
        test(53234, 2451, 746136, 305, 1);
        test(53234, 2451, 1843992, 753, 1);
        test(53234, 2451, 6473914, 2642, 1);
        test(53234, 2451, 9273124, 3784, 1);
        test(53234, 2451, 21356821, 8714, 1);
        test(53234, 2451, 46791340, 19091, 1);
        test(53234, 2451, 97623147, 39830, 1);
        test(53234, 2451, 123794316, 50508, 1);
        test(53234, 2451, 794316237, 4675, 7);
        test(53234, 2451, 1671286011, 43072, 13);
        test(53234, 2451, 1937438136, 45193, 15);
        test(53234, 2451, 2047384124, 36817, 16);
        test(53234, 2451, MAX_VALUE, 24423, 17);
    }

    @Test
    public void otherSpecialMeanings() {
        //region 666*666
        test(666, 666, 111, 1, 1);
        test(666, 666, 444, 1, 1);
        test(666, 666, 1111, 2, 1);
        test(666, 666, 2222, 4, 1);
        test(666, 666, 3333, 6, 1);
        test(666, 666, 4444, 7, 1);
        test(666, 666, 5555, 9, 1);
        test(666, 666, 6666, 11, 1);
        test(666, 666, 7777, 12, 1);
        test(666, 666, 8888, 14, 1);
        test(666, 666, 9999, 16, 1);
        test(666, 666, 11111, 17, 1);
        test(666, 666, 22222, 34, 1);
        test(666, 666, 33333, 51, 1);
        test(666, 666, 44444, 67, 1);
        test(666, 666, 55555, 84, 1);
        test(666, 666, 66666, 101, 1);
        test(666, 666, 77777, 117, 1);
        test(666, 666, 88888, 134, 1);
        test(666, 666, 99999, 151, 1);
        test(666, 666, 111111, 167, 1);
        test(666, 666, 222222, 334, 1);
        test(666, 666, 333333, 501, 1);
        test(666, 666, 444444, 2, 2);
        test(666, 666, 555555, 169, 2);
        test(666, 666, 666666, 335, 2);
        test(666, 666, 777777, 502, 2);
        test(666, 666, 888888, 3, 3);
        test(666, 666, 999999, 170, 3);
        test(666, 666, 1111111, 337, 3);
        test(666, 666, 2222222, 7, 6);
        test(666, 666, 3333333, 344, 8);
        //endregion

        //region 777*777
        test(777, 777, 111, 1, 1);
        test(777, 777, 444, 1, 1);
        test(777, 777, 1111, 2, 1);
        test(777, 777, 2222, 3, 1);
        test(777, 777, 3333, 5, 1);
        test(777, 777, 4444, 6, 1);
        test(777, 777, 5555, 8, 1);
        test(777, 777, 6666, 9, 1);
        test(777, 777, 7777, 11, 1);
        test(777, 777, 8888, 12, 1);
        test(777, 777, 9999, 13, 1);
        test(777, 777, 11111, 15, 1);
        test(777, 777, 22222, 29, 1);
        test(777, 777, 33333, 43, 1);
        test(777, 777, 44444, 58, 1);
        test(777, 777, 55555, 72, 1);
        test(777, 777, 66666, 86, 1);
        test(777, 777, 77777, 101, 1);
        test(777, 777, 88888, 115, 1);
        test(777, 777, 99999, 129, 1);
        test(777, 777, 111111, 143, 1);
        test(777, 777, 222222, 286, 1);
        test(777, 777, 333333, 429, 1);
        test(777, 777, 444444, 572, 1);
        test(777, 777, 555555, 715, 1);
        test(777, 777, 666666, 81, 2);
        test(777, 777, 777777, 224, 2);
        test(777, 777, 888888, 367, 2);
        test(777, 777, 999999, 510, 2);
        test(777, 777, 1111111, 654, 2);
        test(777, 777, 2222222, 530, 4);
        test(777, 777, 3333333, 406, 6);
        test(777, 777, 4444444, 282, 8);
        //endregion

        //region 888*888
        test(888, 888, 111, 1, 1);
        test(888, 888, 444, 1, 1);
        test(888, 888, 1111, 2, 1);
        test(888, 888, 2222, 3, 1);
        test(888, 888, 3333, 4, 1);
        test(888, 888, 4444, 6, 1);
        test(888, 888, 5555, 7, 1);
        test(888, 888, 6666, 8, 1);
        test(888, 888, 7777, 9, 1);
        test(888, 888, 8888, 11, 1);
        test(888, 888, 9999, 12, 1);
        test(888, 888, 11111, 13, 1);
        test(888, 888, 22222, 26, 1);
        test(888, 888, 33333, 38, 1);
        test(888, 888, 44444, 51, 1);
        test(888, 888, 55555, 63, 1);
        test(888, 888, 66666, 76, 1);
        test(888, 888, 77777, 88, 1);
        test(888, 888, 88888, 101, 1);
        test(888, 888, 99999, 113, 1);
        test(888, 888, 111111, 126, 1);
        test(888, 888, 222222, 251, 1);
        test(888, 888, 333333, 376, 1);
        test(888, 888, 444444, 501, 1);
        test(888, 888, 555555, 626, 1);
        test(888, 888, 666666, 751, 1);
        test(888, 888, 777777, 876, 1);
        test(888, 888, 888888, 113, 2);
        test(888, 888, 999999, 239, 2);
        test(888, 888, 1111111, 364, 2);
        test(888, 888, 2222222, 727, 3);
        test(888, 888, 3333333, 202, 5);
        test(888, 888, 4444444, 566, 6);
        //endregion
    }

    private void test(int floor, int apartmentsOnTheFloor, int flat, int expectedFloor, int expectedEntrance) {
        int[] result = building.findAFloorAndAnEntrance(floor, apartmentsOnTheFloor, flat);
        Assert.assertArrayEquals(new int[]{expectedFloor, expectedEntrance}, result);
    }
}

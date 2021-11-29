package Nod;

public class Numbers {

    public int findNodForFourNumbers(int first, int second, int third, int fourth) {
        int nod;
            nod = NOD(Math.abs(first), Math.abs(second));
            nod = NOD(Math.abs(nod), Math.abs(third));
            nod = NOD(Math.abs(nod), Math.abs(fourth));
            return nod;
    }

    private int NOD(int first, int second) {
        int t;
        while (second != 0) {
            t = second;
            second = first % second;
            first = t;
        }
        return Math.abs(first);
    }
}

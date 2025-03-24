package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int INITIAL = -1;
    private static final int DEAFULT = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEAFULT;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return DEAFULT;
        return numbers[total--];
    }

}

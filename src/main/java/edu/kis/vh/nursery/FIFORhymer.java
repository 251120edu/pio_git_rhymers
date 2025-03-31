package edu.kis.vh.nursery;

/**
 * The FIFORhymer class extends DefaultCountingOutRhymer to implement a FIFO (First In, First Out) behavior.
 * It overrides the countOut method to ensure that elements are retrieved in the same order they were added.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {


    /**
     * Returns the temporary rhymer used for FIFO processing.
     *
     * @return the temporary DefaultCountingOutRhymer instance.
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

    /**
     * Temporary rhymer used to implement FIFO behavior.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Overrides the countOut method to provide FIFO behavior.
     * It transfers elements to a temporary rhymer and retrieves them in the correct order.
     *
     * @return the first element that was added (FIFO order)
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}

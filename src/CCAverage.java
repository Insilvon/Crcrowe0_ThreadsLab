/**
 * Class which calculates the average value present in the array.
 */
public class CCAverage implements Runnable{

    private CCResult rAverage;
    private int[] nums;

    /**
     * Constructor method for a CCAverage.
     * @param rAverage - The Result which the average result is stored
     * @param nums - the Int[] used to calculate the result
     */
    public CCAverage(CCResult rAverage, int[] nums) {
        this.rAverage = rAverage;
        this.nums = nums;
    }

    @Override
    /**
     * Required Threading method, runs when thread is started
     */
    public void run() {
        long temp = 0;
        long value = 0;
        for (long item: this.nums){
            temp+=item;
            value++;
        }
        temp = temp/value;
        this.rAverage.setValue(temp);
    }
}

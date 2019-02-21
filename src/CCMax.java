/**
 * Class which calculates the max in an array
 */
public class CCMax implements Runnable{

    private CCResult rMax;
    private int[] nums;

    /**
     * Constructor method which assigns the variables passed in.
     * @param rMax - the max of the array is stored in this result
     * @param nums - the int[] to be read
     */
    public CCMax(CCResult rMax, int[] nums) {
        this.rMax = rMax;
        this.nums = nums;
    }

    @Override
    /**
     * Required Threading method, runs when thread is started
     */
    public void run() {
        long temp = 0;
        for (int item: this.nums){
            if (item>temp) temp = item;
        }
        this.rMax.setValue(temp);
    }
}

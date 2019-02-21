/**
 * Class which uses a thread in order to calculate the sum of all elements in an array.
 */
public class CCSum implements Runnable {

    private CCResult rSum;
    private int[] nums;

    /**
     * Constructor method which takes in a result ADT and the int array to sum.
     * @param rSum A result ADT which stores the final sum of the elements of the array.
     * @param nums The array to be summed.
     */
    public CCSum(CCResult rSum, int[] nums) {
        this.rSum = rSum;
        this.nums = nums;
    }

    @Override
    /**
     * Required Threading method, runs when thread is started
     */
    public void run() {
        long temp = 0;
        for (long item:this.nums){
            temp+=item;
        }
        this.rSum.setValue(temp);
    }
}

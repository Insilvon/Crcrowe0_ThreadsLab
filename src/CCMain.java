import java.util.Random;

/**
 * Main Class which runs the program. Uses multiple threads to run
 * multiple arithmetic classes including sum, average, max.
 * It will log the results taken from each class to the console.
 */
public class CCMain {
    /**
     * Main method. Takes in a size from arguments to generate an int[] of that size.
     * Will generate random numbers between 1-1000 to populate the array. Then it will use multiple threads
     * to collect various information on it.
     * @param args Number of elements in the nums array.
     */
    public static void main(String[] args) {
        //Gets the argument to set the size of the array
        int n = Integer.parseInt(args[0]);
        //generate the array
        int[] nums = new int[n];
        Random r = new Random();
        //fill in the array with random numbers
        for (int i = 0; i<nums.length;i++){
            nums[i] = r.nextInt(1000);
        }
        //create new variables to store sum, average, and max, then create threads which instantiate their
        //respective classes and calculate their values
        CCResult rSum = new CCResult();
        Thread t1 = new Thread(new CCSum(rSum, nums));
        CCResult rAverage = new CCResult();
        Thread t2 = new Thread(new CCAverage(rAverage, nums));
        CCResult rMax = new CCResult();
        Thread t3 = new Thread(new CCMax(rMax, nums));
        //run their threads
        t1.start();
        t2.start();
        t3.start();
        try {
            //when done, attempt to join threads and print out results
            t1.join();
            System.out.printf("We made a bunch of random numbers, the sum is %d%n",rSum.getValue());
            t2.join();
            System.out.printf("The average is %d%n",rAverage.getValue());
            t3.join();
            System.out.printf("The max is %d%n",rMax.getValue());
        } catch  (InterruptedException ex){
            //If there's an error, print it out
            System.err.println("Unable to join");
        }
    }
}

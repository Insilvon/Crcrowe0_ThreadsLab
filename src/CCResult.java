/**
 * Class which holds long results taken from other classes
 */
public class CCResult {

    private long value;

    /**
     * Method which will set the value of this Result
     * @param v a long value to assign to this.value
     */
    public void setValue(long v){
        this.value = v;
    }

    /**
     * Method which will fetch the value of this Result
     * @return Object form of a long value
     */
    public Object getValue() {
        return this.value;
    }
}

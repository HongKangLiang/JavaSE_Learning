/**
 * This is a BinarySemaphore class which is derived from Semaphore.
 *
 * @author Hongkang Liang
 * @Date 2020.05.07
 */

public class BinarySemaphore extends Semaphore {

    /**
     * Description: Constructor without parameter for BinarySemaphore
     */
    public BinarySemaphore() {
        super();
    }

    /**
     * Description: Constructor with parameter for BinarySemaphore.The value can only be 0 or 1.
     */
    public BinarySemaphore(int counter) {
        super(counter > 0 ? 1 : 0);
    }

    /**
     * Description: Override the P method. When the value equals 0, make the thread into waitSet.
     *              When the value is bigger than 0, set it to 0.
     * @throws InterruptedException
     */
    @Override
    public synchronized void P() throws InterruptedException {
        while (value == 0){
            wait();
        }
        value = 0;
    }

    /**
     * Description: Override the V method. When the thread call this method and plus 1 to the value.
     *              When the value is bigger than 0, set it to 1. Make sure the value of the instance
     *              of BinarySemaphore is 0 or 1.
     */
    @Override
    public synchronized void V() {
        value++;
        if (value > 1){
            value = 1;
        }
        notify();
    }
}

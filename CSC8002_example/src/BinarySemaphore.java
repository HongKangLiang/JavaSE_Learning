/**
 * @author: Tengxi Liu
 * @date: 2020/4/23 8:46
 * @description:
 * @modifiedBy:
 * @version: 1.0
 */

public class BinarySemaphore extends Semaphore {

    BinarySemaphore() {
        super();
    }

    public BinarySemaphore(int value) {
        super(value > 0 ? 1 : 0);
    }


    @Override
    public synchronized void V() {
        value++;
        while (value > 1) {
            value = 1;
        }
        notify();
    }
}
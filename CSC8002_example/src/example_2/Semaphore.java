package example_2;

public class Semaphore {
    protected int value;

    public Semaphore() {
        value = 0;
    }

    public Semaphore(int initial) {
        value = (initial >= 0) ? initial : 0;
    }

    public synchronized void P() throws InterruptedException {
        try
        {
            while (value == 0) {
                wait();
            }
        }
        catch (InterruptedException e)
        {
        }
        value--;
    }

    public synchronized void V() {
        value++;
        notify();
    }
}

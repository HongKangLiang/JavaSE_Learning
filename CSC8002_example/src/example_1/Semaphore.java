package example_1;

/**
 * This is a example_1.Semaphore class. It works as a counter. It assures the value to be either bigger than zero, if smaller then zero, then it sets it to zero. It contains P and V methods.
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class Semaphore
{
    protected int value;

    /**
     * constructor for example_1.Semaphore class
     */
    public Semaphore()
    {
        value = 0;
    }

    /**
     * constructor for example_1.Semaphore class
     */
    public Semaphore(int initial)
    {
        value = (initial>=0) ? initial : 0;
    }


    /**
     * this method functions as a gate opener as long as the value is equal to zero
     */
    public synchronized void P() throws InterruptedException
    {
        while (value==0)
        {
            wait();
        }
        value--;
    }

    /**
     * this method functions as a gate closer
     */
    public synchronized void V()
    {
        value++;
        notify();
    }
}

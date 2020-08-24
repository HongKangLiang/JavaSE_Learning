package example_1;

/**
 * This is the example_1.BinarySemaphore class. It extends the example_1.Semaphore class.
 * It allows the value to be either zero or one and overrides the V method
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class BinarySemaphore extends Semaphore
{
    /**
     * constructor for example_1.BinarySemaphore class to call the value integer as it is protected in the semaphore class
     */
    private BinarySemaphore()
    {
        super();
    }

    /**
     * constructor for example_1.BinarySemaphore class to call the checks for integers 0 and 1
     */
    public BinarySemaphore(int value)
    {
        super(value > 0 ? 1 :0);

    }

    /**
     * override the V method from the superclass so when the value is greater than 1, set the value to 1 and wake up the next thread
     */
    @Override
    public synchronized void V()
    {
        value++;

        while (value>1)
        {
            value=1;

        }
        notify();
    }


}

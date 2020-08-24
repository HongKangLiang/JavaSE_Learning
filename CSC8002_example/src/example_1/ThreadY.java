package example_1;

/**
 * The purpose of this class is to create a thread by extending the Thread class.
 * It overrides the run method
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class ThreadY extends Thread
{
    private BinarySemaphore Ysemaphore;
    private BinarySemaphore Xsemaphore;
    private Semaphore Zsemaphore;

    /**
     * constructor for example_1.ThreadY class
     */
    public ThreadY(BinarySemaphore y, BinarySemaphore x, Semaphore z)
    {
        Ysemaphore = y;
        Xsemaphore = x;
        Zsemaphore = z;

    }

    /**
     * While the condition is true, start the Z and Y semaphores, then make the thread sleep for a random amount of time before waking up the X semaphore
     */
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                Zsemaphore.P();
                Ysemaphore.P();

                sleep((long)(Math.random() * 1000)+1);

                System.out.println("Y");

            }
            catch(InterruptedException e)
            {
                System.out.println("you will never see this ;)");
            }

                Xsemaphore.V();
        }
    }
}

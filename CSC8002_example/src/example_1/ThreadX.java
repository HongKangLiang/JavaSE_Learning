package example_1;

/**
 * The purpose of this class is to create a thread by extending the Thread class.
 * It overrides the run method
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class ThreadX extends Thread
{
    private BinarySemaphore Xsemaphore;
    private BinarySemaphore Ysemaphore;
    private Semaphore Zsemaphore;

    /**
     * constructor for example_1.ThreadX class
     */
    public ThreadX(BinarySemaphore x, BinarySemaphore y, Semaphore z )
    {
        Xsemaphore = x;
        Ysemaphore = y;
        Zsemaphore = z;
    }

    /**
     * While the condition is true, start the Z and X semaphores, then make the thread sleep for a random amount of time before waking up the Y semaphore
     */
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                Zsemaphore.P();
               Xsemaphore.P();
               sleep((long)(Math.random() * 1000)+1);

                System.out.println("X");
            }
            catch(InterruptedException e)
            {
                //System.out.println("you will never see this ;)");
            }
            Ysemaphore.V();


        }


    }

}

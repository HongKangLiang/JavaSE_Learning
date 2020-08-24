package example_1;

/**
 * The purpose of this class is to create a thread by extending the Thread class.
 * It overrides the run method
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class ThreadZ extends Thread
{
    private Semaphore Zsemaphore;//needs to be example_1.Semaphore cuz needs to be pronted more times than x and y

    /**
     * constructor for example_1.ThreadZ class
     */
    public ThreadZ(Semaphore z)
    {
        Zsemaphore = z;
    }

    /**
     * While the condition is true, print out Z, and increment it
     */
    @Override
    public void run()
    {
        while(true)
        {
            try
            {

                System.out.println("Z");
                Zsemaphore.V();
                sleep((long)(Math.random() * 1000)+1);

            }
            catch(InterruptedException e)
            {
                System.out.println("you will never see this ;)");
            }

        }
    }
}

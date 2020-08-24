package example_1;

/**
 * This is the main class.
 * It runs the run methods of all three threads. It lets the threads sleep and system finially shuts down.
 *
 * @author Cansu Karaboga
 * @version 1.0 10 May 2018
 */
public class Main extends Thread
{
    public static void main(String[] args) throws InterruptedException
    {
        BinarySemaphore Xpermit = new BinarySemaphore(1);//runs first
        BinarySemaphore Ypermit = new BinarySemaphore(0);
        Semaphore Zsemaphore = new Semaphore(0);

        ThreadX threadX = new ThreadX(Xpermit, Ypermit, Zsemaphore);
        ThreadY threadY = new ThreadY(Ypermit, Xpermit, Zsemaphore);
        ThreadZ threadZ = new ThreadZ(Zsemaphore);


        threadX.start();
        threadY.start();
        threadZ.start();

        Thread.sleep(5000);
        System.exit(0);
    }

}

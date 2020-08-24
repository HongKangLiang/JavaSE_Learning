/**
 * This is a class which is used to encapsulate the thread of printing letter W.
 * It extends the Thread.class
 *
 * @author Hongkang Liang
 * @Date 2020.05.07
 */

public class PrintW extends Thread {

    private BinarySemaphore W_permission;
    private BinarySemaphore X_permission;
    private Semaphore WYZ_permission;

    /**
     * Description: Constructor with parameter.
     */
    public PrintW(BinarySemaphore w_permission, BinarySemaphore x_permission, Semaphore wyz_permission) {
        W_permission = w_permission;
        X_permission = x_permission;
        WYZ_permission = wyz_permission;
    }

    /**
     * Description: Override the run method for this thread.
     */
    @Override
    public void run() {
        //use while loop to realize that the letter is printed repeatedly
        while (true) {
            try {
                //call the P method to avoid printing letter W twice in a row.
                W_permission.P();
                System.out.print("W");
                //make the thread sleep for a random time
                sleep((long) (Math.random() + 1) * 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //call the V method to increase the value of the instance of Semaphore Class.
            WYZ_permission.V();
            //call the V method to wake up the thread which can print letter X after the letter W was printed.
            X_permission.V();
        }
    }
}

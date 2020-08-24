/**
 * This is a class which is used to encapsulate the thread of printing letter X.
 * It extends the Thread.class
 *
 * @author Hongkang Liang
 * @Date 2020.05.07
 */

public class PrintX extends Thread {

    private BinarySemaphore X_permission;
    private BinarySemaphore W_permission;

    /**
     * Description: Constructor with parameter.
     */
    public PrintX(BinarySemaphore x_permission, BinarySemaphore w_permission) {
        X_permission = x_permission;
        W_permission = w_permission;
    }

    /**
     * Description: Override the run method for this thread.
     */
    @Override
    public void run() {
        //use while loop to realize that the letter is printed repeatedly
        while (true){
            try {
                //call the P method to avoid printing letter W twice in a row.
                X_permission.P();
                System.out.print("X");
                //make the thread sleep for a random time
                sleep((long)(Math.random()+1)*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //call the V method to wake up the thread which can print letter W after the letter X was printed.
            W_permission.V();
        }
    }
}

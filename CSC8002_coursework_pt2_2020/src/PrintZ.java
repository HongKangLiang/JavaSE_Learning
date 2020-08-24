/**
 * This is a class which is used to encapsulate the thread of printing letter z.
 * It extends the Thread.class
 *
 * @author Hongkang Liang
 * @Date 2020.05.07
 */
public class PrintZ extends Thread{

    private BinarySemaphore Z_permission;
    private BinarySemaphore Y_permission;
    private Semaphore WYZ_permission;

    /**
     * Description: Constructor with parameter.
     */
    public PrintZ(BinarySemaphore z_permission, BinarySemaphore y_permission, Semaphore wyz_permission) {
        Z_permission = z_permission;
        Y_permission = y_permission;
        WYZ_permission = wyz_permission;
    }

    /**
     * Description: Override the run method for this thread.
     */
    @Override
    public void run() {
        //use while loop to realize that the letter is printed repeatedly
        while (true){
            try {
                //call the P method to decrease the value of WYZ_permission.
                //avoid the number of letter y and z can be greater than that of letter W.
                WYZ_permission.P();
                //call the P method to avoid printing letter z twice in a row.
                Z_permission.P();
                System.out.print("z");
                //make the thread sleep for a random time
                sleep((long)(Math.random()+1)*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //call the V method to wake up the thread which can print letter y after the letter z was printed.
            Y_permission.V();
        }
    }
}

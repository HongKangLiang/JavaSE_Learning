/**
 * @author: Tengxi Liu
 * @date: 2020/4/23 8:46
 * @description:
 * @modifiedBy:
 * @version: 1.0
 */
public class ThreadX extends Thread {

    private Semaphore SW;
    private BinarySemaphore BX;
    private BinarySemaphore BW;


    public ThreadX( Semaphore W, BinarySemaphore X,BinarySemaphore bW) {
        SW = W;
        BX = X;
        BW = bW;
    }

    public void run() {
        while (true) {
            try {

             BX.P();
             SW.V();
             Thread.sleep((long) (Math.random() * 1000));
             System.out.print("X");

            } catch (InterruptedException e) {
            }
            BW.V();

        }
    }
}






    

/**
 * @author: Tengxi Liu
 * @date: 2020/4/23 8:46
 * @description:
 * @modifiedBy:
 * @version: 1.0
 */
public class ThreadY extends Thread {

    private Semaphore SW;
    private BinarySemaphore BY;
    private BinarySemaphore BZ;

    public ThreadY(Semaphore W, BinarySemaphore Y,BinarySemaphore Z){
        SW = W;
        BY = Y;
        BZ = Z;
    }


    public void run() {
        while (true) {
            try{
                SW.P();
                BY.P();
                Thread.sleep((long) (Math.random() * 1000));
                System.out.print("y");

            } catch (InterruptedException e) {
            }
            BZ.V();

        }
    }
}

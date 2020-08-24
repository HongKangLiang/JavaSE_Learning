/**
 * @author: Tengxi Liu
 * @date: 2020/4/23 8:46
 * @description:
 * @modifiedBy:
 * @version: 1.0
 */
public class ThreadW extends Thread{

    //private Semaphore SW;
    private BinarySemaphore BX;
    private BinarySemaphore BW;




    public ThreadW(BinarySemaphore X,BinarySemaphore bW){
       // SW = W;
        BX = X;
        BW = bW;
    }

 
    public void run() {


        while (true) {
            try {
                //SW.V();
                BW.P();
                Thread.sleep((long) (Math.random() * 1000));
                System.out.print("W");
                 } catch(InterruptedException e){
                }
            BX.V();

        }

    }
}



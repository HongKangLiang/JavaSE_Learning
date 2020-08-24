/**
 * @author: Tengxi Liu
 * @date: 2020/4/23 8:46
 * @description:Main Class
 * @modifiedBy:
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

       /* Set initial semaphore */
        Semaphore SemaphoreW = new Semaphore(0);
        BinarySemaphore binarySemaphoreW = new BinarySemaphore(1);
        BinarySemaphore binarySemaphoreX = new BinarySemaphore(0);
        BinarySemaphore binarySemaphoreY= new BinarySemaphore(1);
        BinarySemaphore BinarySemaphoreZ = new BinarySemaphore(0);

        ThreadW threadW = new ThreadW(binarySemaphoreX,binarySemaphoreW);
        ThreadX threadX = new ThreadX(SemaphoreW,binarySemaphoreX,binarySemaphoreW);
        ThreadY threadY = new ThreadY(SemaphoreW,binarySemaphoreY,BinarySemaphoreZ);
        ThreadZ threadZ = new ThreadZ(SemaphoreW,binarySemaphoreY,BinarySemaphoreZ);

       
        threadW.start();
        threadX.start();
        threadY.start();
        threadZ.start();


        Thread.sleep(5000);
        System.exit(0);

    }
}

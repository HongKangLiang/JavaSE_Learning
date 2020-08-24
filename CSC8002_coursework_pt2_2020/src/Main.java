/**
 * A class to run the demo.
 *
 * @author Hongkang Liang
 * @Date 2020.05.07
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //create four instance of BinarySemaphore.

        //set the value of w_permission to 1 and the value of x_permission to 0.
        //make sure the first “W” precede the first “X”.
        BinarySemaphore w_permission = new BinarySemaphore(1);
        BinarySemaphore x_permission = new BinarySemaphore(0);

        //set the value of y_permission to 1 and the value of z_permission to 0.
        //make sure the first “y” precede the first “z”.
        BinarySemaphore y_permission = new BinarySemaphore(1);
        BinarySemaphore z_permission = new BinarySemaphore(0);

        //create an instance of Semaphore.
        //set the value of wyz_permission to 0, make sure the first "W" precede the first “y” or "z".
        //also because the "W", "y" and "z" use the same wyz_permission. the number of W will never be less than the number of y and z
        Semaphore wyz_permission = new Semaphore(0);

        //create four thread to print letters
        PrintW printW = new PrintW(w_permission,x_permission,wyz_permission);
        PrintX printX = new PrintX(x_permission,w_permission);
        PrintY printY = new PrintY(y_permission,z_permission,wyz_permission);
        PrintZ printZ = new PrintZ(z_permission,y_permission,wyz_permission);

        //start all the four thread above
        printW.start();
        printX.start();
        printY.start();
        printZ.start();


        //make the main thread sleep to observe the other four threads
        Thread.sleep(5000);
        System.exit(0);

    }
}

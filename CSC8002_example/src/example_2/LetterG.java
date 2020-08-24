package example_2;

public class LetterG extends mainRun implements Runnable {
    public void run() {
        while (true) {
            try {
                bs1.P(); // acquire
                System.out.print("G");
                sema4.V();// release
                Thread.currentThread().sleep(1000);          
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            bs2.V();
        }
    }
}
package example_2;

public class LetterH extends mainRun implements Runnable {
    public void run() {
        while (true) {
            try {
                sema4.P();
                System.out.print("H");
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            bs1.V();
    }
}
}
package example_2;

public class LetterF extends mainRun implements Runnable {
    public void run()
    {
        while (true) {
            try {
                bs2.P();
                System.out.print("F");
                sema4.V();// release 
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            } 
           bs1.V();
        }
    }
}

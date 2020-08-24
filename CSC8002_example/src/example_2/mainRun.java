package example_2;

public class mainRun
{
    protected static final BinarySemaphore bs1 = new BinarySemaphore(0);
    protected static final BinarySemaphore bs2 = new BinarySemaphore(1);
    protected static final Semaphore sema4 = new Semaphore(0);
    public static void main(String[] args) throws InterruptedException 
    {
        new Thread(new LetterF()).start();

        new Thread(new LetterG()).start();
        
        new Thread(new LetterH()).start();
        
        Thread.sleep(2000);
        System.exit(0);
        System.out.println("Program Terminated");
    }
}
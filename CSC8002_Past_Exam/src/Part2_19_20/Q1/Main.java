package Part2_19_20.Q1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintThread printThread = new PrintThread();
        printThread.start();
        //Thread.sleep(1000);
        System.out.println("Main");
        System.exit(0);
    }
}

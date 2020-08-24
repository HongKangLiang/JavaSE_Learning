package Part2_19_20.Q1;

public class PrintThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Thread");
        }
    }
}

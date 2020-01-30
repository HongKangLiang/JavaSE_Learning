package Thread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("Thread A");
        tp2.setName("Thread B");
        tp3.setName("Thread C");

        tp1.setPriority(1);
        tp2.setPriority(10);
        tp3.setPriority(5);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}

package Thread;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("线程A");
        my2.setName("线程B");

        my1.start();
        my2.start();
    }
}

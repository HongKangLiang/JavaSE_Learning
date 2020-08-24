package Exam_17_18.Q3;

public class PrintDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new PrintChar('X', 20);

        Thread t2 = new PrintChar('Y', 2);

        t1.start();

        for (int i = 1; i <= 5; i++) {

            if (i == 2) t1.join();
            System.out.print(i);

        }
        t2.start();

    }
}

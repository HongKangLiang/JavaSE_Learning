package Exam_16_17.B1;

public class Integer extends Thread{
    @Override
    public void run() {
        for (int i = 2; i < 9; i++) {
            System.out.println(i);
        }
    }
}

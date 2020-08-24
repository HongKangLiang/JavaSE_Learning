package Exam_16_17.B1;

public class LetterY extends Thread {
    private static final int TIMES = 5;

    @Override
    public void run() {
        for (int i = 0; i < TIMES; i++) {
            System.out.println("Y");
        }
    }
}

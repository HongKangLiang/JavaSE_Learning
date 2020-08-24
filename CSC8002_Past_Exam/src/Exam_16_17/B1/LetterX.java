package Exam_16_17.B1;

public class LetterX extends Thread {
    private static final int TIMES = 10;

    @Override
    public void run() {
        for (int i = 0; i < TIMES; i++) {
            System.out.println("X");
        }
    }
}

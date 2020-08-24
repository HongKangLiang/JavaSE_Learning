package Exam_17_18.Q3;

public class PrintChar extends Thread {
    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {

        charToPrint = c;

        times = t;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

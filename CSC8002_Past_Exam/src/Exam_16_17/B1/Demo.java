package Exam_16_17.B1;

public class Demo {
    public static void main(String[] args) {
        Thread x = new LetterX();
        Thread y = new LetterY();
        Thread i = new Integer();

        x.start();
        y.start();
        i.start();

    }
}

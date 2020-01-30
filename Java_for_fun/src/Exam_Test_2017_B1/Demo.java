package Exam_Test_2017_B1;

public class Demo {
    public static void main(String[] args) {
        SheetMusic s1 = new SheetMusic("AB","HFJSHD","HJFHKDAHSFHAH");
        SheetMusic s2 = new SheetMusic("BC","FSDFS","HJFHKDAHSFHAH");
        SheetMusic s3 = new SheetMusic("CD","FSDFS","HJFHKDAHSFHAH");

        Catalogue c = new Catalogue("aaa");
        c.addTune(s1);
        c.addTune(s2);
        c.addTune(s3);

        c.tunesMatching("B");
    }
}

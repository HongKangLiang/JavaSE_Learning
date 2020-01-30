package Exam_Test_2018_B1;

public class Demo {
    public static void main(String[] args) {
        Activity a1 = new Activity(80000,6,"a1");
        Activity a2 = new Activity(90000,5,"a2");
        Activity a3 = new Activity(100000,4,"a3");

        Log l = new Log("aaa");

        l.addActivity(a1);
        l.addActivity(a2);
        l.addActivity(a3);

        l.bestSpeed();

    }
}

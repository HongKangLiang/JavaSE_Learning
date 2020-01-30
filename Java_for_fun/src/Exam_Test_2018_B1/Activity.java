package Exam_Test_2018_B1;

public class Activity {
    private double duration;
    private double distance;
    private String comment;

    public Activity() {
    }

    public Activity(double duration, double distance, String comment) {
        this.duration = duration;
        this.distance = distance;
        this.comment = comment;
    }

    //这个get方法仅仅为了测试输出
    public String getComment() {
        return comment;
    }

    public double averageSpeed(){
        double speed;
        return speed = distance / (duration * 3600);
    }
}

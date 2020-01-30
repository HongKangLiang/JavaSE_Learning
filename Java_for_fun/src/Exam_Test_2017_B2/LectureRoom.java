package Exam_Test_2017_B2;

public class LectureRoom extends Room {
    boolean recap;
    public LectureRoom(String name, int seating_capacity, boolean recap){
        super(name,seating_capacity);
        this.recap = recap;
    }
}

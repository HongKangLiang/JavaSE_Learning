package Exam_Test_2017_B2;

public class ComputerCluster extends Room {
    String operating_system;

    public ComputerCluster(String name, int seating_capacity, String operating_system) {
        super(name, seating_capacity);
        this.operating_system = operating_system;
    }

    public String getOperating_system() {
        return operating_system;
    }
}

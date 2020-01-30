package Exam_Test_2017_B2;

public class Room {

    String name;
    int seating_capacity;

    public Room(String name, int seating_capacity){
        this.name = name;
        this.seating_capacity = seating_capacity;
    }

    public String getName(){
        return name;
    }

    public int getSeating_capacity(){
        return seating_capacity;
    }
}

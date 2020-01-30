package Exam_Test_2017_B2;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Demo {
    public static ArrayList<String> suitableCluster(Room[] array_room, int capacity_need, String system){
        ArrayList<String> arraylist = new ArrayList<String>();
        for (Room room : array_room) {
            if (room instanceof ComputerCluster) {
                if ((room.getSeating_capacity() >= capacity_need)&&(system.equals(((ComputerCluster) room).getOperating_system()))) {
                    arraylist.add(room.getName());
                }
            }
        }
        //测试输出
        for (String s : arraylist){
            System.out.println(s);
        }
        return arraylist;
    }

    //main方法测试
    public static void main(String[] args) {
        ComputerCluster c1 = new ComputerCluster("A",100,"Linux");
        ComputerCluster c2 = new ComputerCluster("B",90,"Linux");
        ComputerCluster c3 = new ComputerCluster("C",80,"Windows");
        ComputerCluster c4 = new ComputerCluster("D",70,"Linux");
        LectureRoom c5 = new LectureRoom("E",100,false);
        LectureRoom c6 = new LectureRoom("F",90,true);

        Room[] arr = new Room[6];
        Array.set(arr,0,c1);
        Array.set(arr,1,c2);
        Array.set(arr,2,c3);
        Array.set(arr,3,c4);
        Array.set(arr,4,c5);
        Array.set(arr,5,c6);

        Demo.suitableCluster(arr,80,"Linux");

    }
}

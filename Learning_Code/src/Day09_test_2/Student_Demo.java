package Day09_test_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Student_Demo {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student(1,"a",23,"china");
        Student s2 = new Student(2,"b",22,"uk");
        Student s3 = new Student(3,"c",21,"brazil");

        array.add(s1);
        array.add(s2);
        array.add(s3);


        while (true) {
            Scanner sb = new Scanner(System.in);
            System.out.println("请输入操作指令（例如：add,delete,modify,check）:");
            String order = sb.nextLine();

            if (order.equals("add")) {
                student.add(array);
            } else if (order.equals("delete")) {
                student.delete(array);
            } else if (order.equals("modify")) {
                student.modify(array);
            } else if (order.equals("check")) {
                student.check(array);
            } else if (order.equals("break")) {
                break;
            } else {
                System.out.println("您输入的指令有误");
            }
        }
    }



}

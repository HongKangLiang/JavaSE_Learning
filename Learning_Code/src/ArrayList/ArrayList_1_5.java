package ArrayList;

//创建一个存储学生对象的集合，存储3个学生对象，在控制台遍历student集合
//学生的姓名和年龄来自键盘录入

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_1_5 {
    public static void main(String[] args) {
        ArrayList<student> arr = new ArrayList<student>();
        addstudent(arr);
        addstudent(arr);
        addstudent(arr);

        for(int i = 0; i < arr.size(); i++) {
            student s = arr.get(i);
            System.out.println("学生的名字： " + s.getName());
            System.out.println("学生的年龄： " + s.getAge());
        }
    }

    //构建方法，两个明确
    //1：返回值：这里不需要返回
    //2：参数：
    public static void addstudent(ArrayList<student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个学生姓名： ");
        String name_input = sc.nextLine();
        System.out.println("请输入该学生年龄： ");
        int age_input = sc.nextInt();
        System.out.println("-----------------");
        student s = new student(name_input,age_input);
        arr.add(s);

    }
}

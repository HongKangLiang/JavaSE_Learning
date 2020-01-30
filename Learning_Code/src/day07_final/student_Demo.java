package day07_final;

public class student_Demo {
    public static void main(String[] args) {
        //创建对象s，调用空参构造方法，并用set赋值
        student s = new student();
        s.setName("许三多");
        s.setAge(18);
        s.show();

        //创建对象p，调用有参构造方法，直接赋值
        student p = new student("三多许",66);
        p.show();
    }
}

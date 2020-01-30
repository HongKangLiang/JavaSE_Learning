package inheritance_3_1;

public class test_Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        //使用无参构造方法创建对象techer_1
//        teacher teacher_1 = new teacher();
//        teacher_1.setName("Arsenal");
//        teacher_1.setAge(35);

        //使用有参构造方法创建对象techer_1
        teacher teacher_1 = new teacher("Arsenal", 35);
        System.out.println(teacher_1.getName() + ";" + teacher_1.getAge());
        teacher_1.show_function("tech math");
        System.out.println("-----------------");

        //创建学生类对象进行测试
        student student_1 = new student();
        student_1.setName("Inter");
        student_1.setAge(15);
        System.out.println(student_1.getName() + ";" + student_1.getAge());
        student_1.show_function("study hard");
        System.out.println("------------------");
    }
}

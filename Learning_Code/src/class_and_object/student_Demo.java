
//需求：创建一个类，命名为学生，然后定义一个学生测试类，
// 最后在学生测试类中通过对象完成成员变量和成员方法的使用。

package class_and_object;

//在上一个名为student的class中，我们已经定义好类，以及成员变量和成员方法
//在这个名为student_Demo的测试类中，我们将通过建立对象去实现成员变量和成员方法的使用

public class student_Demo {

    //因为这是一个测试类，所以需要这句psvm语句
    public static void main(String[] args) {

        //创建对象
        //结构：类名 对象名 = new 类名（）；
        //因为我们之前定义好的类，名为student，所以这里的类名就是student
        //这里对象名我们随意取为p
        student p = new student();

        //使用成员变量，给成员变量赋值。结构：对象名.成员变量
        p.name = "连诗雅";
        p.age = 18;
        //输出看结果
        System.out.println(p.name + ","+ p.age);

        //使用成员方法，结构：对象名.成员方法();
        p.study();
        p.dohomework();

    }
}

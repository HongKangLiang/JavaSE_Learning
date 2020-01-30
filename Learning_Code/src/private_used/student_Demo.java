package private_used;

public class student_Demo {

    //因为这是一个测试类，所以需要这句psvm语句
    public static void main(String[] args) {

        //创建对象
        //结构：类名 对象名 = new 类名（）；
        //因为我们之前定义好的类，名为student，所以这里的类名就是student
        //这里对象名我们随意取为p
        student p = new student();

        p.name = "许三多";
        //使用成员变量，给成员变量赋值。结构：对象名.成员变量
        //因为在student类中，我们用private修饰了成员变量，所以这里直接访问就会报错
        //需要使用get/set方法来访问
        //  p.age = 18;
        //p.setAge(180);
        p.setAge(18);


        //使用成员方法，结构：对象名.成员方法();
        //调用student类中的show方法来显示student_Demo测试类中我们对成员变量的赋值
        p.show();

        //如果要在测试类中用别的方式输出，则只需要使用get来获取被private修饰的成员变量
        System.out.println(p.name + "&&&&&&" + p.getAge());

    }
}

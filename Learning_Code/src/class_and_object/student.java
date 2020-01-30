
//需求：创建一个类，命名为学生，然后定义一个学生测试类，
// 最后在学生测试类中通过对象完成成员变量和成员方法的使用。

package class_and_object;

//定义一个学生类
public class student {
    //成员变量
    //这里我们定义了两个变量，一个是name，一个是age
    String name;
    int age;

    //成员方法(在类中定义成员方法，和前面说的方法的定义相似，只需去掉static
    //这里我们定义两个方法，一个是study，一个是dohomework
    public void study() {
        System.out.println("好好学习，天天向上");
    }
    public void dohomework() {
        System.out.println("家庭作业，每日必做");
    }
}
//综上，我们完成对类（命名为学生）的定义，并定义了两个成员变量和两个成员方法

package private_used;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//定义一个学生类
public class student {
    //成员变量
    String name;
    //用private修饰来定义
    private int age;

    //因为我们用private修饰，所以age和name只能在学生类中访问，不能在其他类中访问
    //这其实是保证类age和name的安全性
    //但我们可以提供get和set的方法，让其他类可以合理访问

   //在get和set方法中，age和name的首字母要大写
    public void setAge(int age) {
        // age = a; 这样设置是可以的，但是会和不加private没有区别
        //所以我们会在方法中定义一些合理性的条件
        if(age<0 || age>120) {
            System.out.println("你输入的年龄有误");
        } else {
//            age = a;
//            如果这里用this关键字来命名，将更加合理
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }


    //成员方法
    //定义成员方法来显示成员变量，因为在其他类中不能直接定义方法来显示
    public void show() {
        System.out.println(name + "----" + age);
    }
}

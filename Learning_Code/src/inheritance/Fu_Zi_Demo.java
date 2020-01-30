package inheritance;

//测试类

public class Fu_Zi_Demo {
    public static void main(String[] args) {
        //使用无参构造方法在Fu类中创建对象f，并调用Fu类中的方法
        Fu f = new Fu();
        f.method_Fu();

        //使用无参构造方法在Zi类中创建对象z，并调用Zi类中的方法
        Zi z = new Zi();
        z.method_Zi();

        //因为Zi是Fu的子类，所以Zi可以调用Fu中的方法
        z.method_Fu();
    }
}

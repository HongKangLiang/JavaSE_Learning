package Test_group;

public class Method_test3 {
    public static void main(String[] args) {

        //调用get_Bigger方法
        //调用方法的时候，方法定义中有几个参数，就给几个参数；定义的参数类型是什么，就给什么类型的数据(只可给小，不可给大)
        //例如：方法定义中的数据类型是int，则调用的时候不能定义double；但反过来是可以的

        get_Bigger(80,45);

        int hahah = 90;
        int kakak = 88;
        get_Bigger(hahah,kakak);

    }
    public static void get_Bigger(double number_A,double number_B) {
        if (number_A > number_B) {
            System.out.println("The bigger number is " + number_A);
        }else {
            System.out.println("The bigger number is " + number_B);
        }
    }
}

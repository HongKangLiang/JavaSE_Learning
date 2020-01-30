package Test_group;

//需求：设计一个方法可以获取两个数的较大值，数据来自于参数（该方法需要带有返回值）。


public class Method_test5 {
    public static void main(String[] args) {

        //调用函数，测试程序

        double compare = get_Bigger(80,90);
        System.out.println(compare);

        //问题：这样写可以吗？
        // System.out.println(get_Bigger(90,80));

    }
    public static double get_Bigger(double number_1,double number_2) {
        if (number_1 >= number_2) {
            return number_1;
        }else {
            return number_2;
        }
    }
}

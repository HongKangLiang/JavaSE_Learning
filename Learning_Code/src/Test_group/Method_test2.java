package Test_group;

public class Method_test2 {
    public static void main(String[] args) {

        //调用下方定义好的方法
        //常量值的调用
        parity(90);
        //变量的调用
        int parameter = 90;
        parity(parameter);
    }

    //定义一个带参数的方法，实现判断数字是否为偶数
    public static void parity(int number) {
        if (number % 2 ==0) {
            System.out.println(number + "是一个偶数");
        }else {
            System.out.println(number + "是一个奇数");
        }
    }
}

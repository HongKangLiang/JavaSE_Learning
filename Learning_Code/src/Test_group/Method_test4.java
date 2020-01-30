package Test_group;

public class Method_test4 {
    public static void main(String[] args) {

        //调用函数
        //方法一：方法名（参数）；
        //parity(10);
        //System.out.println(parity(10));

        //方法二：数据类型 变量名 = 方法名（参数）；
        boolean Arsenal = parity(10);
        System.out.println(Arsenal);
        //我们通常使用方法二对"带返回值的方法"进行调用，因为变量可以接收返回值并输出，否则将没有意义。

    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否为偶数，并返回真假值
    public static boolean parity(int number) {
        if(number % 2 ==0) {
            return true;
        }else {
            return false;
        }
    }
}

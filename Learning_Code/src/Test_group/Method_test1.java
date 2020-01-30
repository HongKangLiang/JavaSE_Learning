package Test_group;

public class Method_test1 {
    public static void main(String[] args) {
        //方法已经在下方定义好了，调用该方法需要在main方法里调用
        parity();

    }

    public static void parity() {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + "是一个偶数");
        } else {
            System.out.println(number + "是一个奇数");
        }
    }

    }

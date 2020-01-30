package Recursion;

/*需求：
 *     有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子
 *     假如兔子都不会死，问第二十个月的兔子对数是多少？
 * */
public class Recursion_Demo_1 {
    public static void main(String[] args) {

        System.out.println("20个月时兔子的数量：" + method(20));
    }

    public static int method(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return method(month - 1) + method(month - 2);
        }
    }
}


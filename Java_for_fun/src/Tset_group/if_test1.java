package Tset_group;

import java.util.Scanner;

public class if_test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");

        int number = sc.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + "是一个偶数");
        } else {
            System.out.println(number + "是一个奇数");
        }

    }

}

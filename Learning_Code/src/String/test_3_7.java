package String;

///定义一个方法，实现字符串的反转。键盘录入字符串，实现控制台输入反转后的字符串。
//例如：输入abc，输出cba
//可以和test_2_10对比一些"String"和"StringBuilder"。

import java.util.Scanner;

public class test_3_7 {
    public static void main(String[] args) {
        //导包，构建方法，定义变量接收数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String print_in = sc.nextLine();
        //调用方法
        String print_out = reverse(print_in);
        System.out.println("反转后的字符串如下：");
        System.out.println(print_out);
    }
    //创建方法，明确返回值是一个字符串，输入也是一个字符串
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String output = sb.toString();
        return output;
        //也可以简化为以下代码，直接返回
        // return new StringBuilder().reverse().toString();
    }
}

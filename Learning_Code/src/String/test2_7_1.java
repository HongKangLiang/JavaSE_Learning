package String;
//需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class test2_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
            String s = new String(line);
            for (int i = 0; i < line.length(); i++) {
                System.out.println(line.charAt(i));
            }

        }
    }
}


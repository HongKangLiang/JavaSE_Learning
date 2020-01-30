package String;

//定义一个方法，实现字符串的反转。键盘录入字符串，实现控制台输入反转后的字符串。
//例如：输入abc，输出cba

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class test_2_10 {
    public static void main(String[] args) {
        //定义输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String print_line = sc.nextLine();
        //调用方法
        String new_illustration = reverse(print_line);
        System.out.println("经反转后的字符串是：");
        System.out.println(new_illustration);
    }

    /*
    定义一个方法，明确两点：
    1：明确返回值类型
    2：明确输入参数
     */
    public static String reverse(String s) {
        String new_output = "";
        for(int i = s.length()-1; i >= 0; i--) {
            new_output += s.charAt(i) ;
        }
         return new_output;
    }
}

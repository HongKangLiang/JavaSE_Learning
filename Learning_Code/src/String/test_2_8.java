package String;

//输入一个字符串，实现统计该字符串的大写字母，小写字母，数字的个数统计，在控制台输出

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class test_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int Big_account = 0;
        int Small_account = 0;
        int Number_account = 0;

        for(int i = 0; i < line.length(); i++) {
            //调用charAt()函数，用来返回字符串里指定位置的字符。因为for循环，所以能厉遍字符。
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                Big_account++;
            } else if (ch >= 'a' && ch <= 'z') {
                Small_account++;
            } else if (ch >= '0' && ch <= '9') {
                /*
                这里的0和9是由charAt()函数返回的，所以也属于字符，所以条件判断语句里的
                数字也要加上单引号，否则返回值将无法被识别，下面是错误代码
                } else if (ch >= 0 && ch <= 9) {
                 */
                Number_account++;
            }
        }
        System.out.println("大写字母的个数是：" + Big_account);
        System.out.println("小写字母的个数是：" + Small_account);
        System.out.println("数字的个数是：" + Number_account);
    }
}

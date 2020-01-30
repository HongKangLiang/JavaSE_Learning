package String;

import java.util.Scanner;
public class account_password_Demo {
    public static void main(String[] args) {

        for (int i = 1; i <=3; i++) {

        Scanner sc = new Scanner(System.in);
        Scanner sw = new Scanner(System.in);
        System.out.println("请输入账号：");
        String account_input = sc.nextLine();
        System.out.println("----------------------");;
        System.out.println("请输入密码：");
        String password_input = sw.nextLine();

        account_password a = new account_password();


            if (account_input.equals(a.getAccount_insert()) && password_input.equals(a.getPassword_insert())) {
                System.out.println("恭喜您，登陆成功");
                break;
            } else {
                if( i - 3 == 0) {
                    System.out.println("账号被锁定，请与管理员联系");
                }else {
                    System.out.println("您输入的账号密码有误，还剩" + (3 - i) + "次机会");
                }

            }
        }
    }

}

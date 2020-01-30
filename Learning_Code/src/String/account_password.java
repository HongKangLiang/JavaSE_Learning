package String;

//需求：已知用户名和密码，请用程序实现模拟用户登陆。总共给三次机会，登陆之后，给出相应的提示

/*
    思路：1-已知的用户名和密码直接用字符串赋值；
         2-调用Scanner输入数据函数，输入用户名和密码的字符串；
         3-总共给三次机会，我们用for循环来实现，并在登陆成功之后break循环

 */
public class account_password {

    private String account_insert = "HONG XUE";
    private String password_insert = "19930701";

    public String getAccount_insert(){
        return account_insert;
    }
    public String getPassword_insert(){
        return password_insert;
    }

}


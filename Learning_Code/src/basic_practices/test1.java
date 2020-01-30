
//输入星期数，显示今天的减肥活动，周一：跑步；周二：游泳；周三：慢走；
//周四：动感单车；周五：拳击；周六：爬山；周日：好好吃一顿

package basic_practices;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的星期数：");

        //调用switch方法来实现需求
        int i = sc.nextInt();
        activity_day(i);

        //调用if语句方法来实现需求
//        int i = sc.nextInt();
//        Activity_day(i);


    }


    //方法一，用switch语句实现该方法
    public static void activity_day(int number) {
        switch (number) {
            case 1 :
                System.out.println("跑步");
                break;
            case 2 :
                System.out.println("游泳");
                break;
            case 3 :
                System.out.println("慢走");
                break;
            case 4 :
                System.out.println("动感单车");
                break;
            case 5 :
                System.out.println("拳击");
                break;
            case 6 :
                System.out.println("爬山");
                break;
            case 7 :
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你输入的星期数有误");
                break;
        }

    }

    //方法二，用if语句实现该方法
//    public static void  Activity_day(int number) {
//        if (number == 1) {
//            System.out.println("跑步");
//        }else if(number == 2) {
//            System.out.println("游泳");
//        }else if(number == 3) {
//            System.out.println("慢走");
//        }else if(number == 4) {
//            System.out.println("动感单车");
//        }else if(number == 5) {
//            System.out.println("拳击");
//        }else if(number == 6) {
//            System.out.println("爬山");
//        }else if(number == 7) {
//            System.out.println("好好吃一顿");
//        }else {
//            System.out.println("你输入的星期数有误");
//        }
//    }
}

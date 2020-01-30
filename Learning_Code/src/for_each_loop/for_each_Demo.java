package for_each_loop;

import java.util.ArrayList;
import java.util.List;

/*
         增强for（for-each）：
             1、简化数组和collection集合的遍历；
             2、实现Iterable接口的类，允许其对象成为for-each语句的目标
             3、JDK5以后出现的方法，其内部原理是一个Iterator迭代器

          格式：
             for(元素范型类型 范型的自定义变量名 : 数组或者collection集合) {
                  循环体；
             }
*/
public class for_each_Demo {
    public static void main(String[] args) {
        //int类型数组
        int[] arr = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("-----------");

        //String类型数组
        String[] strArray = {"hello", "world", "java", "world"};
        for(String s : strArray) {
            System.out.println(s);
        }
        System.out.println("-----------");

        //集合
        List<String> list = new ArrayList<String>();
        list.add("what");
        list.add("when");
        list.add("where");
        list.add("who");

        for (String s: list) {
            System.out.println(s);
        }
    }
}

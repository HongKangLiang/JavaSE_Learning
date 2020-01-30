package ArrayList;

// 创建一个储存字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

import java.util.ArrayList;
public class ArrayList_1_3 {
    public static void main(String[] args) {
        ArrayList<String> array_test = new ArrayList<>();
        array_test.add("A");
        array_test.add("B");
        array_test.add("C");

        for (int i = 0; i < array_test.size(); i++) {
            System.out.println(array_test.get(i));
        }
    }
}

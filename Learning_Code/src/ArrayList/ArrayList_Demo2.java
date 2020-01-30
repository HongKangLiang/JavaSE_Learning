package ArrayList;

//ArrayList中一些常用的方法

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_Demo2 {
    public static void main(String[] args) {
        ArrayList<String> array_test = new ArrayList<String>();
        array_test.add("A");
        array_test.add("B");
        array_test.add("C");
        array_test.add("D");
        array_test.add("E");
        System.out.println(array_test);

        //删除指定的元素，返回删除是否成功
        System.out.println("----------------");
        System.out.println(array_test.remove("C"));
        System.out.println("array_test: "+ array_test);

        //删除指定索引处的元素，返回被删除的元素
        System.out.println("----------------");
        System.out.println(array_test.remove(2));
        System.out.println("array_test: "+ array_test);

        //修改指定索引处的元素，输入位置和新元素，返回被修改元素
        System.out.println("----------------");
        System.out.println(array_test.set(1,"K"));
        System.out.println("array_test: "+ array_test);

        //返回指定索引处的元素
        System.out.println("----------------");
        System.out.println(array_test.get(2));
        System.out.println("array_test: "+ array_test);

        //返回集合中的元素个数
        System.out.println("----------------");
        System.out.println(array_test.size());
        System.out.println("array_test: "+ array_test);

    }
}

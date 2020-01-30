package collection;

import java.util.ArrayList;
import java.util.Collection;

/*常用方法：
      1- boolean add(E e) ：添加元素
      2- boolean remove(Object o) ：从集合中移除指定的元素
      3- void clear() ：清空集合中的元素
      4- boolean contains(Object o) ：判断集合中是否存在指定的元素
      5- boolean isEmpty() ：判断集合是否为空
      6- int size() ：集合的长度，也就是集合中元素的个数



*/
public class Collection_Demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("HELLO");
        c.add("JAVA");
        System.out.println(c);
        c.remove("HELLO");
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.add("PYTHON");
        System.out.println(c.size());

    }
}

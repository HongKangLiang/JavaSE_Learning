package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Iterator {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<String>();
        c.add("hello");
        c.add("hi");
        c.add("what");
        c.add("when");

        // Iterator iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> itr = c.iterator();

        // E next(): 返回迭代中的下一个元素
        //boolean hasNext(): 如果迭代具有更多元素，则返回true
        //根据以上两种方法，再利用while循环完成厉遍


        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }

    }
}

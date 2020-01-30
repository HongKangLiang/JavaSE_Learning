package ArrayList;

/*
       ArrayList构造方法：
           pubic ArrayLis () :创建一个空的集合对象

       ArrayList添加方法：
           public boolean add(E e) :将指定元素添加到集合的末尾
           public void add(int index, E element) :在此集合的指定位置添加指定元素
 */

//导包
import  java.util.ArrayList;

public class ArrayList_Demo1 {
    public static void main(String[] args) {
        //创建一个空的集合
        ArrayList<String> array_1 = new ArrayList<>();
//        ArrayList<String> array_2 = new ArrayList<String>();
//        System.out.println(array_1);
//        System.out.println(array_2);
        //上述两种方法都可以用来定义对象，第一种在JDK7之后默认了后面的
        //ArrayList的（）自动识别前面的前面的String

        //在集合的末尾添加指定元素
        array_1.add("Hello");
        array_1.add("World");
        array_1.add("Java");
        System.out.println(array_1);
        //在集合的指定位置添加元素
        array_1.add(1,"Hah");
        array_1.add(3,"love");
        System.out.println(array_1);
        //但不能在超出集合的范围添加元素，这样就会产生越界，道理类似于数组的越界
        //例如，这是ArrayList有5个元素，位置从0到4，可以将元素添加到0到5的任何位置
        // 但如果添加元素在位置6上，就会越界"IndexOutOfBoundsException"
        array_1.add(6,"Newcastle");
        System.out.println(array_1);



    }
}

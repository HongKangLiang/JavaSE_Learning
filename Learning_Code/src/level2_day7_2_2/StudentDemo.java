package level2_day7_2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
案例需求:
ArrayList存储学生对象，使用Collections对ArrayList进行排序
要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
* */
public class StudentDemo {
    public static void main(String[] args) {
        //创建集合，创建学生类对象
        List<Student> arr = new ArrayList<Student>();
        Student s1 = new Student("Ana",23);
        Student s2 = new Student("Ali",23);
        Student s3 = new Student("Ben",26);
        Student s4 = new Student("Karl",21);
        Student s5 = new Student("Jack",21);

        //将学生类对象添加入集合
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        //调用Collections的静态方法.sort
        //用匿名内部类实现接口Comparator，重写compare方法

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //年龄按从小到大排序
                int num = s1.getAge() - s2.getAge();
                //姓名按字母先后顺序排序
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()): num;
                return num2;
            }
        });

        for (Student s: arr) {
            String name_output = s.getName();
            int age_output = s.getAge();
            System.out.println("Name: " +name_output+ " ; " + "Age: " + age_output);
        }

    }
}

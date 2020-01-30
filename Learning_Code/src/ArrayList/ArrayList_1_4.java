package ArrayList;

//创建一个存储学生对象的集合，存储3个学生对象，在控制台遍历student集合

import java.util.ArrayList;
public class ArrayList_1_4 {
    public static void main(String[] args) {
        ArrayList<student> test_1 = new ArrayList<student>();
        student s1 = new student("Ben", 30);
        student s2 = new student("Clay", 28);
        student s3 = new student("David", 22);

         test_1.add(s1);
         test_1.add(s2);
         test_1.add(s3);

         for (int i = 0; i < test_1.size(); i++) {
             student s = test_1.get(i);
             System.out.println("--------------");
             System.out.println("学生名字： " + s.getName());
             System.out.println("年龄： " + s.getAge());
         }
    }
}

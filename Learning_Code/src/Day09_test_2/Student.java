package Day09_test_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int student_ID;
    private String student_name;
    private int student_age;
    private String student_nationality;

    public Student() {
    }

    public Student(int student_ID, String student_name, int student_age, String student_nationality) {
        this.student_ID = student_ID;
        this.student_name = student_name;
        this.student_age = student_age;
        this.student_nationality = student_nationality;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_age(int student_age) {
        if (student_age < 0 || student_age > 120) {
            System.out.println("你输入的学生年龄有误");
        } else {
            this.student_age = student_age;
        }
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_nationality(String student_nationality) {
        this.student_nationality = student_nationality;
    }

    public String getStudent_nationality() {
        return student_nationality;
    }

    public static void add(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        Scanner sp = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入学生ID： ");
        int ID_input = sc.nextInt();
        s.setStudent_ID(ID_input);
        System.out.println("请输入学生姓名： ");
        String name_input = sp.nextLine();
        s.setStudent_name(name_input);
        System.out.println("请输入学生年龄： ");
        int age_input = sc.nextInt();
        s.setStudent_age(age_input);
        System.out.println("请输入学生国籍： ");
        String nationality_input = sp.nextLine();
        s.setStudent_nationality(nationality_input);
        System.out.println("---------------------------");
        arr.add(s);
    }

    public static void delete(ArrayList<Student> arr) {
        Scanner sw = new Scanner(System.in);
        System.out.println("请输入学生ID： ");
        int ID_input_delete = sw.nextInt();
        System.out.println("---------------------------");
        for (int n = 0; n < arr.size(); n++) {
            int ID_check = arr.get(n).getStudent_ID();
            if (ID_check == ID_input_delete) {
                arr.remove(n);
            }
        }
    }

    public static void modify(ArrayList<Student> arr) {
        Scanner sf = new Scanner(System.in);
        System.out.println("请输入学生ID： ");
        int ID_input_modify = sf.nextInt();
        System.out.println("---------------------------");
        for (int m = 0; m < arr.size(); m++) {
            int ID_check = arr.get(m).getStudent_ID();
            if (ID_check == ID_input_modify) {
                Scanner sc = new Scanner(System.in);
                Scanner sp = new Scanner(System.in);
                System.out.println("请修改学生ID： ");
                int ID_input = sc.nextInt();
                System.out.println("请修改学生姓名： ");
                String name_input = sp.nextLine();
                System.out.println("请修改学生年龄： ");
                int age_input = sc.nextInt();
                System.out.println("请修改学生国籍： ");
                String nationality_input = sp.nextLine();
                System.out.println("---------------------------");
                Student s_modify = new Student(ID_input, name_input, age_input, nationality_input);
                arr.set(m, s_modify);
            }
        }
    }

    public static void check(ArrayList<Student> array) {
        for (int i = 0; i < array.size(); i++) {
            Student s_check = array.get(i);
            System.out.println("学生的学号： " + s_check.getStudent_ID());
            System.out.println("学生的姓名： " + s_check.getStudent_name());
            System.out.println("学生的年龄： " + s_check.getStudent_age());
            System.out.println("学生的国籍： " + s_check.getStudent_nationality());
            System.out.println("-----------------------------");
        }
    }

}

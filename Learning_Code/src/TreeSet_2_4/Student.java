package TreeSet_2_4;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
    private String name;
    private int chinese_mark;
    private int math_mark;
    private int overall_mark = math_mark + chinese_mark;

    public static Comparator<Student> mark_comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int num = s2.overall_mark - s1.overall_mark;
            int num2 = num == 0 ? s2.chinese_mark - s1.chinese_mark : num;
            int num3 = num2 == 0 ? s2.math_mark - s1.math_mark : num2;
            return num3;
        }

    };

    public Student() {
    }

    public Student(String name, int overall_mark, int chinese_mark, int math_mark) {
        this.name = name;
        this.chinese_mark = chinese_mark;
        this.math_mark = math_mark;
        this.overall_mark = overall_mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese_mark() {
        return chinese_mark;
    }

    public void setChinese_mark(int chinese_mark) {
        this.chinese_mark = chinese_mark;
    }

    public int getMath_mark() {
        return math_mark;
    }

    public void setMath_mark(int math_mark) {
        this.math_mark = math_mark;
    }

    public int getOverall_mark() {
        return overall_mark;
    }

    public void setOverall_mark(int overall_mark) {
        this.overall_mark = overall_mark;
    }


}

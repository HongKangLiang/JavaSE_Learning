package TreeSet_2_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Demo {
    public static void main(String[] args) {
        List<Student> ts_test = new ArrayList<Student>();

        Student s1 = new Student("david", 178, 90, 88);
        Student s2 = new Student("ben", 178, 92, 86);
        Student s3 = new Student("clay", 164, 94, 70);
        Student s4 = new Student("adam", 178, 88,90 );
        Student s5 = new Student("frank", 197, 98, 99);

        ts_test.add(s1);
        ts_test.add(s2);
        ts_test.add(s3);
        ts_test.add(s4);
        ts_test.add(s5);

        Collections.sort(ts_test, Student.mark_comparator);

        for (Student s :
                ts_test
        ) {
            System.out.println(s.getName() + ";" + s.getOverall_mark() + ";" + s.getChinese_mark() + ";" + s.getMath_mark());
        }
    }
}

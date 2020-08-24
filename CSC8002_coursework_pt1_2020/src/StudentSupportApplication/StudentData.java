package StudentSupportApplication;

import java.util.Date;

/**
 * Class Description: This is a class to encapsulate student's data including type, name, birth_day.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */
public class StudentData {
    private String student_type;
    private Name student_name;
    private Date student_birth;

    /**
     * Method Description: Constructor with parameters.
     */
    public StudentData(String student_type, Name student_name, Date student_birth) {
        this.student_type = student_type;
        this.student_name = student_name;
        this.student_birth = student_birth;
    }

    /**
     * Method Description: get the student's type from student data.
     */
    public String getStudent_type() {
        return student_type;
    }

    /**
     * Method Description: get the student's name from student data.
     */
    public Name getStudent_name() {
        return student_name;
    }

    /**
     * Method Description: get the student's birthday from student data.
     */
    public Date getStudent_birth() {
        return student_birth;
    }


}

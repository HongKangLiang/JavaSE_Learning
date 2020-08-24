package StudentSupportApplication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Class Description: This is a class for school's student management system.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */
public class StudentSystem {
    private HashMap<StudentID, AbstractStudent> student_record;

    /**
     * Method Description: Constructor with parameters.
     */
    public StudentSystem() {
        this.student_record = new HashMap<>();
    }

    /**
     * Method Description: This method registers a new student onto the system and allocates a student ID.
     */
    public AbstractStudent registerStudent(AbstractStudent student) {
        StudentID studentID = StudentID.generateStudentID();
        student.setStudentID(studentID);
        SmartCard smartCard = SmartCard.issueSMC(student);
        student.setSmartCard(smartCard);
        student_record.put(studentID, student);
        return student;
    }

    /**
     * Method Description: A method returns the number of students of the specified type that are currently enrolled.
     */
    public int noOfStudents(String type) {
        int number = 0;
        Set<StudentID> key_set = student_record.keySet();
        for (StudentID studentID : key_set) {
            if (type.equals(student_record.get(studentID).getStudentType())) {
                number++;
            }
        }
        return number;
    }

    /**
     * Method Description: This method changes a student record.
     */
    public void amendStudentData(StudentID studentID, StudentData studentData) {
        Set<StudentID> key_set = student_record.keySet();
        for (StudentID temp : key_set) {
            if (temp.equals(studentID)) {
                student_record.get(temp).setStudentData(studentData);
            }
        }
    }

    /**
     * Method Description: This method changes a student record.
     */
    public void terminateStudent(StudentID studentID) {
        Iterator<StudentID> iterator = student_record.keySet().iterator();
        while (iterator.hasNext()) {
            StudentID temp = iterator.next();
            if (temp.equals(studentID)) {
                iterator.remove();
            }
        }
    }

    /**
     * Method Description: get a map which contains student's information.
     */
    public HashMap<StudentID, AbstractStudent> getStudent_record() {
        return student_record;
    }
}

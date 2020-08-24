package StudentSupportApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

/**
 * Class Description: This is an abstract class for student to implement the Student Interface.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public abstract class AbstractStudent implements Student {

    private StudentData studentData;
    private StudentID studentID;
    private HashSet<Module> modules;
    private SmartCard smartCard;


    /**
     * Method Description: Constructor without parameters.
     */
    public AbstractStudent() {
    }

    /**
     * Method Description: Constructor with parameters.
     */
    public AbstractStudent(StudentData studentData) {
        this.studentData = studentData;
        this.modules = new HashSet<>();
    }

    /**
     * Method Description: get an instance of StudentData from a student.
     */
    public StudentData getStudentData() {
        return studentData;
    }

    /**
     * Method Description: set an instance of StudentData to a student.
     */
    public void setStudentData(StudentData studentData) {
        this.studentData = studentData;
    }

    /**
     * Method Description: get student's ID
     *
     * @return studentID
     */
    @Override
    public StudentID getStudentID() {
        return studentID;
    }

    /**
     * Method Description: get student's type
     *
     * @return student_type
     */
    @Override
    public String getStudentType() {
        return this.studentData.getStudent_type();
    }

    /**
     * Method Description: this method allow student to register for modules.
     */
    @Override
    public void registerModule(Module module) {
        modules.add(module);
    }


    /**
     * Method Description: A method to list the modules that the student is registered for.
     */
    @Override
    public void showModules() {
        if (modules.isEmpty()) {
            System.out.println("There is no registered module for this student.");
            return;
        }
        System.out.println("All registered modules for this student are:");
        for (Module module : modules) {
            System.out.println(module);
        }
    }

    /**
     * Method Description: A method which returns the credits of a student.
     *
     * @return int: the total credits of all modules registered by a student.
     */
    @Override
    public int getAllCredits() {
        int credits = 0;
        if (studentData == null) {
            return 0;
        }
        if (modules == null) {
            return 0;
        }
        for (Module module : modules) {
            credits += module.getModule_credit();
        }
        return credits;
    }

    /**
     * Method Description: A method which returns true if the student is currently registered as required.
     */
    @Override
    public boolean isEnoughRegister() {
        return false;
    }

    /**
     * Method Description: this method calculate a student's age.
     */
    @Override
    public int calculateAge() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(studentData.getStudent_birth());
        int year_birth = calendar1.get(Calendar.YEAR);
        int month_birth = calendar1.get(Calendar.MONTH);
        int date_birth = calendar1.get(Calendar.DATE);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        int year_current = calendar2.get(Calendar.YEAR);
        int month_current = calendar2.get(Calendar.MONTH);
        int date_current = calendar2.get(Calendar.DATE);

        int age = year_current - year_birth;
        if ((month_current > month_birth) || ((month_current == month_birth) && (date_current >= date_birth))) {
            return age;
        } else {
            return age - 1;
        }
    }

    /**
     * Method Description: get a set which contains modules registered by a student.
     */
    public HashSet<Module> getModules() {
        return modules;
    }

    /**
     * Method Description: set a ID to a student.
     */
    public void setStudentID(StudentID studentID) {
        this.studentID = studentID;
    }

    /**
     * Method Description: set a smart card to a student.
     */
    public void setSmartCard(SmartCard smartCard) {
        this.smartCard = smartCard;
    }
}

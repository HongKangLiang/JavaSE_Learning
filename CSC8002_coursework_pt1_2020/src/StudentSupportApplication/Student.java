package StudentSupportApplication;

/**
 * Class Description: an interface class for student and define a number of methods.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public interface Student {

    /**
     * Method Description: get student's ID
     *
     * @return studentID
     */
    public StudentID getStudentID();

    /**
     * Method Description: get student's type
     *
     * @return student_type
     */
    public String getStudentType();


    /**
     * Method Description: A method to list the modules that the student is registered for.
     */
    public void showModules();

    /**
     * Method Description: A method which returns the credits of a student.
     *
     * @return int
     */
    public int getAllCredits();

    /**
     * Method Description: A method which returns true if the student is currently registered for enough credits.
     *
     * @return true or false
     */
    public boolean isEnoughRegister();

    /**
     * Method Description: this method allow student to register for modules.
     */
    public void registerModule(Module module);

    /**
     * Method Description: this method calculate a student's age.
     */
    public int calculateAge();

}

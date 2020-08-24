package StudentSupportApplication;

/**
 * Class Description: This is a class for underground student and extend from AbstractStudent class.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public final class PGRStudent extends AbstractStudent {
    private Name supervisor;

    /**
     * Method Description: Constructor without parameters.
     */
    public PGRStudent() {
    }

    /**
     * Method Description: Constructor with parameters.
     */
    public PGRStudent(StudentData studentData, Name supervisor) {
        super(studentData);
        this.supervisor = supervisor;
    }

    /**
     * Method Description: get supervisor's name.
     *
     * @return Name
     */
    public Name getSupervisor() {
        return supervisor;
    }

    /**
     * Method Description: A method to check if the postgraduate-research student is currently registered as required.
     *
     * @return true: if a student register for 0 credits and have been allocated a supervisor.
     * false: any situation not meet the requirements of true.
     */
    @Override
    public boolean isEnoughRegister() {
        if (getAllCredits() == 0 && (supervisor) != null) {
            return true;
        } else {
            return false;
        }
    }


}

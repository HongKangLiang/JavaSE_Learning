package StudentSupportApplication;

/**
 * Class Description: This is a class for underground student and extend from AbstractStudent class.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public final class UGStudent extends AbstractStudent {

    /**
     * Method Description: Constructor with parameters.
     */
    public UGStudent(StudentData studentData) {
        super(studentData);
    }

    /**
     * Method Description: A method which returns true if the undergraduate student is currently registered for 120 credits.
     *
     * @return true: if a student register for 120 credits
     *         false: if a student register for more than or less than 120 credits
     */
    @Override
    public boolean isEnoughRegister() {
        if (getAllCredits() == 120) {
            return true;
        } else {
            return false;
        }
    }


}


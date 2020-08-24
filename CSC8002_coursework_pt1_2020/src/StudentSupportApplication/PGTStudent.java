package StudentSupportApplication;

/**
 * Class Description: This is a class for postgraduate taught student and extend from AbstractStudent class.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public final class PGTStudent extends AbstractStudent {

    /**
     * Method Description: Constructor with parameters.
     */
    public PGTStudent(StudentData studentData) {
        super(studentData);
    }

    /**
     * Method Description: A method which returns true if the postgraduate-taught student is currently registered for 180 credits.
     *
     * @return true: if a student register for 180 credits
     * false: if a student register for more than or less than 180 credits
     */
    @Override
    public boolean isEnoughRegister() {
        if (getAllCredits() == 180) {
            return true;
        } else {
            return false;
        }
    }


}

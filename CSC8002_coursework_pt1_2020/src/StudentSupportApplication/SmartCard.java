package StudentSupportApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * Class Description: This is a class to encapsulate smart card.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */
public final class SmartCard {
    private Name student_name;
    private SmartCardNumber smartCardNumber;
    private Date student_birth;
    private final Date issue;
    private final Date expiry;
    private static final HashMap<AbstractStudent,SmartCard> SMC_MAP = new HashMap<>();
    public static final int UG_AGE = 17;
    public static final int PG_AGE = 20;
    public static final int UG_VAL_YEAR = 4;
    public static final int PGT_VAL_YEAR = 2;
    public static final int PGR_VAL_YEAR = 5;

    /**
     * Method Description: Constructor with parameters.
     */
    public SmartCard(AbstractStudent abstractStudent, Date issue) {
        if (abstractStudent.getStudentData().getStudent_name() == null)
            throw new IllegalArgumentException("name is null");
        if (abstractStudent.getStudentData().getStudent_birth() == null)
            throw new IllegalArgumentException("date of birth is null");
        if (issue == null)
            throw new IllegalArgumentException("date of issue is null");

        this.student_name = abstractStudent.getStudentData().getStudent_name();
        this.smartCardNumber = SmartCardNumber.generateSMCN(abstractStudent.getStudentData().getStudent_name(),issue);
        this.student_birth = abstractStudent.getStudentData().getStudent_birth();
        this.issue = issue;
        this.expiry = setExpiryDate(abstractStudent);
    }

    /**
     * Method Description: Check if a student is already has a smart card.
     */
    public final static boolean hasSMC(AbstractStudent abstractStudent){
        if (SMC_MAP.containsKey(abstractStudent)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Method Description: Issue a smartCard to student.
     */
    public final static SmartCard issueSMC(AbstractStudent abstractStudent){
        if (hasSMC(abstractStudent)){
            throw new IllegalArgumentException("A student cannot be issued with more than one smartcard");
        }
        if (abstractStudent instanceof UGStudent){
            if (abstractStudent.calculateAge() < UG_AGE){
                throw new IllegalArgumentException("Underground student's age must be over " + UG_AGE);
            }
        }
        if ((abstractStudent instanceof PGRStudent)||(abstractStudent instanceof PGTStudent)){
            if (abstractStudent.calculateAge() < PG_AGE){
                throw new IllegalArgumentException("Postgraduate student's age must be over " + PG_AGE);
            }
        }
        Name name = abstractStudent.getStudentData().getStudent_name();
        Calendar calendar = Calendar.getInstance();
        Date issue = calendar.getTime();
        SmartCard smartCard = new SmartCard(abstractStudent,issue);
        SMC_MAP.put(abstractStudent,smartCard);
        return smartCard;
    }

    /**
     * Method Description: Automatically set the date of expiry of SmartCard.
     */
    private Date setExpiryDate(Student student) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(issue);

        if (student instanceof UGStudent) {
            calendar.add(Calendar.YEAR, UG_VAL_YEAR);
        } else if (student instanceof PGTStudent) {
            calendar.add(Calendar.YEAR, PGT_VAL_YEAR);
        } else if (student instanceof PGRStudent) {
            calendar.add(Calendar.YEAR, PGR_VAL_YEAR);
        } else {
            throw new IllegalArgumentException("Cannot set the expiry date of this student");
        }
        Date expiryDate = calendar.getTime();
        return expiryDate;
    }

    /**
     * Method Description: Get the date of expiry of SmartCard.
     */
    public Date getExpiryDate() {
        return expiry;
    }

    /**
     * Method Description: Get the student's name of SmartCard.
     */
    public Name getStudent_name() {
        return student_name;
    }

    /**
     * Method Description: Get the issue date name of SmartCard.
     */
    public Date getIssue() {
        return issue;
    }





}

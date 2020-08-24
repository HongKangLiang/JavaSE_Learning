package StudentSupportApplication;

import java.util.HashMap;
import java.util.Random;

/**
 * Class Description: This is a class for student's ID.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public final class StudentID {
    //use a map to store all studentID to guarantee that no two students have the same ID
    //references are constant during initialization
    private static final HashMap<String, StudentID> IDMAP = new HashMap<>();
    //a single letter
    private final char id_letter;
    //four digit number
    private final int id_number;
    //studentID with a required format
    private final String id;

    /**
     * Method Description: Constructor with parameters.
     */
    public StudentID(char id_letter, int id_number) {
        this.id_letter = id_letter;
        this.id_number = id_number;
        this.id = String.format("%c%d", id_letter, id_number);
    }

    /**
     * Method Description: Automatically generate a studentID
     *
     * @return String
     */
    public final static StudentID generateStudentID() {
        Random random = new Random();
        final char id_letter = (char) (random.nextInt(26) + 'a');
        final int id_number = random.nextInt(9000) + 1000;
        final String id = String.format("%c%d", id_letter, id_number);
        if (IDMAP.containsKey(id)) {
            return generateStudentID();
        } else {
            StudentID studentID = new StudentID(id_letter, id_number);
            IDMAP.put(id, studentID);
        }
        return IDMAP.get(id);
    }

    /**
     * Method Description: get the first part of student ID.
     */
    public char getId_letter() {
        return id_letter;
    }

    /**
     * Method Description: get the second part of student ID.
     */
    public int getId_number() {
        return id_number;
    }

    /**
     * Method Description: get id of student ID.
     */
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        //return (obj instanceof StudentID) && (this.id_number==((StudentID)obj).getId_number())&&(this.id_letter==(((StudentID)obj).getId_letter()));
        if (!(obj instanceof StudentID)) {
            return false;
        }
        if (this.id.equals(((StudentID) obj).getId())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = result * 31 + id_letter;
        result = result * 31 + id_number;
        return result;
    }
}

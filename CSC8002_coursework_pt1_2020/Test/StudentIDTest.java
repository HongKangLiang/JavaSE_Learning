import StudentSupportApplication.StudentID;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class StudentIDTest {

    @Test
    public void generateStudentID() {
        Assert.assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
        assertNotEquals(StudentID.generateStudentID(), StudentID.generateStudentID());
    }

    @Test
    public void getId_letter() {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher1 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_letter()));
        Matcher matcher2 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_letter()));
        Matcher matcher3 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_letter()));
        Matcher matcher4 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_letter()));
        Matcher matcher5 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_letter()));
        assertTrue(matcher1.matches());
        assertTrue(matcher2.matches());
        assertTrue(matcher3.matches());
        assertTrue(matcher4.matches());
        assertTrue(matcher5.matches());
    }

    @Test
    public void getId_number() {
        Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher1 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_number()));
        Matcher matcher2 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_number()));
        Matcher matcher3 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_number()));
        Matcher matcher4 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_number()));
        Matcher matcher5 = pattern.matcher(String.valueOf(StudentID.generateStudentID().getId_number()));
        assertTrue(matcher1.matches());
        assertTrue(matcher2.matches());
        assertTrue(matcher3.matches());
        assertTrue(matcher4.matches());
        assertTrue(matcher5.matches());
    }

}
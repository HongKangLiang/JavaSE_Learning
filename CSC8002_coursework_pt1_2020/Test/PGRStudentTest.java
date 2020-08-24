import StudentSupportApplication.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class PGRStudentTest {

    Calendar calendar1 = new Calendar.Builder().setDate(1996, 8 - 1, 8).build();
    Date birthday1 = calendar1.getTime();

    PGRStudent pgrStudent1 = new PGRStudent(new StudentData("postgraduate research", new Name("Jimmy", "Buttler"), birthday1), new Name("White", "Fred"));
    PGRStudent pgrStudent2 = new PGRStudent();
    Module module1 = new Module("CSC8001", "Data Structure", 20);

    @Test
    public void getStudentID() {
        StudentID testID = new StudentID('y', 9921);
        pgrStudent1.setStudentID(testID);
        assertEquals(testID, pgrStudent1.getStudentID());
    }

    @Test
    public void getType() {
        String expect_type = "postgraduate research";
        assertEquals(expect_type, pgrStudent1.getStudentType());
    }

    @Test
    public void isEnoughRegister() {
        assertTrue(pgrStudent1.isEnoughRegister());
        assertFalse(pgrStudent2.isEnoughRegister());

        pgrStudent1.registerModule(module1);
        assertFalse(pgrStudent1.isEnoughRegister());
    }

    @Test
    public void calculateAge() {
        assertEquals(23, pgrStudent1.calculateAge());
    }
}
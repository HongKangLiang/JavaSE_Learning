import StudentSupportApplication.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class UGStudentTest {

    Calendar calendar1 = new Calendar.Builder().setDate(1999, 1 - 1, 1).build();
    Date birthday1 = calendar1.getTime();
    Calendar calendar2 = new Calendar.Builder().setDate(1997, 8 - 1, 8).build();
    Date birthday2 = calendar2.getTime();

    UGStudent ugStudent1 = new UGStudent(new StudentData("underground", new Name("Kobe", "Bryant"), birthday1));
    UGStudent ugStudent2 = new UGStudent(new StudentData("underground", new Name("Allen", "Jack"), birthday2));
    Module module1 = new Module("CSC8001", "Data Structure", 20);
    Module module2 = new Module("CSC8002", "Programming", 30);
    Module module3 = new Module("CSC8003", "Cloud Computing", 30);
    Module module4 = new Module("CSC8004", "Database", 20);
    Module module5 = new Module("CSC8005", "Algorithm", 20);


    @Test
    public void getStudentID() {
        StudentID testID = new StudentID('a', 1223);
        ugStudent1.setStudentID(testID);
        assertEquals(testID, ugStudent1.getStudentID());
    }

    @Test
    public void getType() {
        String expect_type = "underground";
        assertEquals(expect_type, ugStudent1.getStudentType());
        assertEquals(expect_type, ugStudent2.getStudentType());
    }

    @Test
    public void registerModule() {
        assertFalse(ugStudent1.getModules().contains(module1));
        assertFalse(ugStudent1.getModules().contains(module2));
        assertFalse(ugStudent2.getModules().contains(module3));
        assertFalse(ugStudent2.getModules().contains(module4));

        ugStudent1.registerModule(module1);
        ugStudent1.registerModule(module2);
        assertTrue(ugStudent1.getModules().contains(module1));
        assertTrue(ugStudent1.getModules().contains(module2));
        ugStudent2.registerModule(module3);
        ugStudent2.registerModule(module4);
        assertTrue(ugStudent2.getModules().contains(module3));
        assertTrue(ugStudent2.getModules().contains(module4));
    }

    @Test
    public void getAllCredits() {
        assertEquals(0, ugStudent1.getAllCredits());
        assertEquals(0, ugStudent2.getAllCredits());

        ugStudent1.registerModule(module1); // 20 credits
        ugStudent1.registerModule(module2); // 30 credits
        ugStudent1.registerModule(module3); // 30 credits
        assertEquals(80, ugStudent1.getAllCredits());

    }

    @Test
    public void isEnoughRegister() {
        assertFalse(ugStudent1.isEnoughRegister());

        ugStudent1.registerModule(module1); // 20 credits
        ugStudent1.registerModule(module2); // 30 credits
        ugStudent1.registerModule(module3); // 30 credits
        ugStudent1.registerModule(module4); // 20 credits
        ugStudent1.registerModule(module5); // 20 credits
        assertTrue(ugStudent1.isEnoughRegister());
    }

    @Test
    public void calculateAge() {
        assertEquals(21, ugStudent1.calculateAge());
        assertEquals(22, ugStudent2.calculateAge());
    }
}
import StudentSupportApplication.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class PGTStudentTest {

    Calendar calendar1 = new Calendar.Builder().setDate(1996, 9 - 1, 1).build();
    Date birthday1 = calendar1.getTime();
    Calendar calendar2 = new Calendar.Builder().setDate(1997, 8 - 1, 8).build();
    Date birthday2 = calendar2.getTime();

    PGTStudent pgtStudent1 = new PGTStudent(new StudentData("postgraduate taught", new Name("Tim", "Duncan"), birthday1));
    PGTStudent pgtStudent2 = new PGTStudent(new StudentData("postgraduate taught", new Name("Kevin", "Durant"), birthday2));
    Module module1 = new Module("CSC8001", "Data Structure", 20);
    Module module2 = new Module("CSC8002", "Programming", 30);
    Module module3 = new Module("CSC8003", "Cloud Computing", 30);
    Module module4 = new Module("CSC8004", "Database", 20);
    Module module5 = new Module("CSC8005", "Algorithm", 20);
    Module module6 = new Module("CSC8006", "Interaction Design", 40);
    Module module7 = new Module("CSC8007", "Software Engineering", 20);

    @Test
    public void getStudentID() {
        StudentID testID = new StudentID('p', 3723);
        pgtStudent1.setStudentID(testID);
        assertEquals(testID, pgtStudent1.getStudentID());
    }

    @Test
    public void getType() {
        String expect_type = "postgraduate taught";
        assertEquals(expect_type, pgtStudent1.getStudentType());
        assertEquals(expect_type, pgtStudent2.getStudentType());
    }

    @Test
    public void registerModule() {
        assertFalse(pgtStudent1.getModules().contains(module1));
        assertFalse(pgtStudent1.getModules().contains(module2));
        assertFalse(pgtStudent2.getModules().contains(module3));
        assertFalse(pgtStudent2.getModules().contains(module4));

        pgtStudent1.registerModule(module1);
        pgtStudent1.registerModule(module2);
        assertTrue(pgtStudent1.getModules().contains(module1));
        assertTrue(pgtStudent1.getModules().contains(module2));
        pgtStudent2.registerModule(module3);
        pgtStudent2.registerModule(module4);
        assertTrue(pgtStudent2.getModules().contains(module3));
        assertTrue(pgtStudent2.getModules().contains(module4));
    }

    @Test
    public void getAllCredits() {
        assertEquals(0, pgtStudent1.getAllCredits());
        assertEquals(0, pgtStudent2.getAllCredits());

        pgtStudent1.registerModule(module1); // 20 credits
        pgtStudent1.registerModule(module2); // 30 credits
        pgtStudent1.registerModule(module3); // 30 credits
        assertEquals(80, pgtStudent1.getAllCredits());

    }

    @Test
    public void isEnoughRegister() {
        assertFalse(pgtStudent1.isEnoughRegister());

        pgtStudent1.registerModule(module1); // 20 credits
        pgtStudent1.registerModule(module2); // 30 credits
        pgtStudent1.registerModule(module3); // 30 credits
        pgtStudent1.registerModule(module4); // 20 credits
        pgtStudent1.registerModule(module5); // 20 credits
        pgtStudent1.registerModule(module6); // 40 credits
        pgtStudent1.registerModule(module7); // 20 credits
        assertTrue(pgtStudent1.isEnoughRegister());
    }

    @Test
    public void calculateAge() {
        assertEquals(23, pgtStudent1.calculateAge());
    }
}
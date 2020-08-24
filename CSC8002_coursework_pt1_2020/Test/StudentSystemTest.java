import StudentSupportApplication.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class StudentSystemTest {

    StudentSystem studentSystem = new StudentSystem();

    Calendar calendar1 = new Calendar.Builder().setDate(1999, 1 - 1, 1).build();
    Date birthday1 = calendar1.getTime();
    UGStudent ugStudent1 = new UGStudent(new StudentData("underground", new Name("Kobe", "Bryant"), birthday1));

    Calendar calendar2 = new Calendar.Builder().setDate(1996, 9 - 1, 1).build();
    Date birthday2 = calendar2.getTime();
    PGTStudent pgtStudent1 = new PGTStudent(new StudentData("postgraduate taught", new Name("Tim", "Duncan"), birthday2));

    Calendar calendar3 = new Calendar.Builder().setDate(1996, 8 - 1, 8).build();
    Date birthday3 = calendar3.getTime();
    PGRStudent pgrStudent1 = new PGRStudent(new StudentData("postgraduate research", new Name("Jimmy", "Buttler"), birthday3), new Name("White", "Fred"));

    @Test
    public void registerStudent() {
        assertEquals(0, studentSystem.getStudent_record().size());
        assertTrue(ugStudent1.getStudentID() == null);
        assertTrue(pgtStudent1.getStudentID() == null);
        assertTrue(pgrStudent1.getStudentID() == null);
        studentSystem.registerStudent(ugStudent1);
        studentSystem.registerStudent(pgtStudent1);
        studentSystem.registerStudent(pgrStudent1);
        assertEquals(3, studentSystem.getStudent_record().size());
        assertTrue(ugStudent1.getStudentID() != null);
        assertTrue(pgtStudent1.getStudentID() != null);
        assertTrue(pgrStudent1.getStudentID() != null);

    }

    @Test
    public void noOfStudents() {
        assertEquals(0, studentSystem.noOfStudents("underground"));
        assertEquals(0, studentSystem.noOfStudents("postgraduate taught"));
        assertEquals(0, studentSystem.noOfStudents("postgraduate research"));
        studentSystem.registerStudent(ugStudent1);
        studentSystem.registerStudent(pgtStudent1);
        studentSystem.registerStudent(pgrStudent1);
        assertEquals(1, studentSystem.noOfStudents("underground"));
        assertEquals(1, studentSystem.noOfStudents("postgraduate taught"));
        assertEquals(1, studentSystem.noOfStudents("postgraduate research"));

    }

    @Test
    public void amendStudentData() {
        studentSystem.registerStudent(ugStudent1);
        assertEquals("Kobe", ugStudent1.getStudentData().getStudent_name().getFirst_name());
        assertEquals("Bryant", ugStudent1.getStudentData().getStudent_name().getLast_name());
        assertEquals("underground", ugStudent1.getStudentType());

        StudentData new_studentData = new StudentData("test", new Name("test", "test"), new Date());
        studentSystem.amendStudentData(ugStudent1.getStudentID(), new_studentData);

        assertNotEquals("Kobe", ugStudent1.getStudentData().getStudent_name().getFirst_name());
        assertNotEquals("Bryant", ugStudent1.getStudentData().getStudent_name().getLast_name());
        assertNotEquals("underground", ugStudent1.getStudentType());
        assertEquals("test", ugStudent1.getStudentData().getStudent_name().getFirst_name());
        assertEquals("test", ugStudent1.getStudentData().getStudent_name().getLast_name());
        assertEquals("test", ugStudent1.getStudentType());


    }

    @Test
    public void terminateStudent() {
        AbstractStudent registered_ugStudent1 = studentSystem.registerStudent(ugStudent1);
        AbstractStudent registered_pgtStudent1 = studentSystem.registerStudent(pgtStudent1);
        AbstractStudent registered_pgrStudent1 = studentSystem.registerStudent(pgrStudent1);
        StudentID studentID1 = registered_ugStudent1.getStudentID();
        StudentID studentID2 = registered_pgtStudent1.getStudentID();
        StudentID studentID3 = registered_pgrStudent1.getStudentID();

        assertEquals(1, studentSystem.noOfStudents("underground"));
        assertEquals(1, studentSystem.noOfStudents("postgraduate taught"));
        assertEquals(1, studentSystem.noOfStudents("postgraduate research"));

        studentSystem.terminateStudent(studentID1);
        studentSystem.terminateStudent(studentID2);
        studentSystem.terminateStudent(studentID3);

        assertEquals(0, studentSystem.noOfStudents("underground"));
        assertEquals(0, studentSystem.noOfStudents("postgraduate taught"));
        assertEquals(0, studentSystem.noOfStudents("postgraduate research"));
    }

}
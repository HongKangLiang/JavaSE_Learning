import StudentSupportApplication.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class SmartCardTest {

    Calendar calendar1 = new Calendar.Builder().setDate(1996, 6 - 1, 6).build();
    Date birthday1 = calendar1.getTime();
    Calendar calendar2 = new Calendar.Builder().setDate(1997, 7 - 1, 7).build();
    Date birthday2 = calendar1.getTime();
    Calendar calendar3 = new Calendar.Builder().setDate(1998, 8 - 1, 8).build();
    Date birthday3 = calendar1.getTime();
    PGTStudent pgtStudent = new PGTStudent(new StudentData("postgraduate taught", new Name("Tim", "Duncan"), birthday1));
    PGRStudent pgrStudent = new PGRStudent(new StudentData("postgraduate research", new Name("Jimmy", "Butler"), birthday2), new Name("White", "Fred"));
    UGStudent ugStudent = new UGStudent(new StudentData("underground", new Name("Kobe", "Bryant"), birthday3));

    Calendar calendar4 = new Calendar.Builder().setDate(2006, 6 - 1, 6).build();
    Date birthday4 = calendar4.getTime();
    Calendar calendar5 = new Calendar.Builder().setDate(2002, 7 - 1, 7).build();
    Date birthday5 = calendar5.getTime();
    PGTStudent invalid_pgtStudent = new PGTStudent(new StudentData("postgraduate taught", new Name("Tim", "Duncan"), birthday4));
    UGStudent invalid_ugStudent = new UGStudent(new StudentData("underground", new Name("Kobe", "Bryant"), birthday5));

    @Test
    public void issueSMC() {
        SmartCard pgt = SmartCard.issueSMC(pgtStudent);
        SmartCard pgr = SmartCard.issueSMC(pgrStudent);
        SmartCard ug = SmartCard.issueSMC(ugStudent);

        assertEquals("Tim", pgt.getStudent_name().getFirst_name());
        assertEquals("Duncan", pgt.getStudent_name().getLast_name());
        assertEquals("Jimmy", pgr.getStudent_name().getFirst_name());
        assertEquals("Butler", pgr.getStudent_name().getLast_name());
        assertEquals("Kobe", ug.getStudent_name().getFirst_name());
        assertEquals("Bryant", ug.getStudent_name().getLast_name());

        Calendar c1 = Calendar.getInstance();
        c1.setTime(pgt.getIssue());
        Calendar c2 = Calendar.getInstance();
        c2.setTime(pgt.getExpiryDate());

        assertEquals(c1.get(Calendar.YEAR) + 2, c2.get(Calendar.YEAR));
        assertEquals(c1.get(Calendar.MONTH), c2.get(Calendar.MONTH));
        assertEquals(c1.get(Calendar.DATE),c2.get(Calendar.DATE));

        Calendar c3 = Calendar.getInstance();
        c3.setTime(pgr.getIssue());
        Calendar c4 = Calendar.getInstance();
        c4.setTime(pgr.getExpiryDate());

        assertEquals(c3.get(Calendar.YEAR) + 5, c4.get(Calendar.YEAR));
        assertEquals(c3.get(Calendar.MONTH), c4.get(Calendar.MONTH));
        assertEquals(c3.get(Calendar.DATE),c4.get(Calendar.DATE));

        Calendar c5 = Calendar.getInstance();
        c5.setTime(ug.getIssue());
        Calendar c6 = Calendar.getInstance();
        c6.setTime(ug.getExpiryDate());

        assertEquals(c5.get(Calendar.YEAR) + 4, c6.get(Calendar.YEAR));
        assertEquals(c5.get(Calendar.MONTH), c6.get(Calendar.MONTH));
        assertEquals(c5.get(Calendar.DATE),c6.get(Calendar.DATE));


    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        //Test for IllegalArgumentException about student's age
        SmartCard invalid1 = SmartCard.issueSMC(invalid_pgtStudent);
        SmartCard invalid2 = SmartCard.issueSMC(invalid_ugStudent);

        //Test for IllegalArgumentException about issue a student two smart card
        SmartCard pgt = SmartCard.issueSMC(pgtStudent);
        SmartCard pgr = SmartCard.issueSMC(pgrStudent);
        SmartCard ug = SmartCard.issueSMC(ugStudent);
        SmartCard invalid3 = SmartCard.issueSMC(pgtStudent);
        SmartCard invalid4 = SmartCard.issueSMC(pgrStudent);
        SmartCard invalid5 = SmartCard.issueSMC(ugStudent);

    }

    @Test
    public void hasSMC() {
        assertEquals(false, SmartCard.hasSMC(ugStudent));
        assertEquals(false, SmartCard.hasSMC(pgtStudent));
        assertEquals(false, SmartCard.hasSMC(pgrStudent));

        SmartCard pgt = SmartCard.issueSMC(pgtStudent);
        SmartCard pgr = SmartCard.issueSMC(pgrStudent);
        SmartCard ug = SmartCard.issueSMC(ugStudent);

        assertEquals(true, SmartCard.hasSMC(ugStudent));
        assertEquals(true, SmartCard.hasSMC(pgtStudent));
        assertEquals(true, SmartCard.hasSMC(pgrStudent));

    }


}
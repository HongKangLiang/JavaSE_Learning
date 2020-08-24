import StudentSupportApplication.Name;
import StudentSupportApplication.SmartCardNumber;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class SmartCardNumberTest {

    @Test
    public void generateSMCN() {
        Name name = new Name("jack", "bruce");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 2, 2);
        Date issue = calendar.getTime();
        SmartCardNumber actual = SmartCardNumber.generateSMCN(name, issue);
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(String.valueOf(actual.getNumber()));

        assertTrue(matcher.matches());
        assertEquals("JB", actual.getInit_name());
        assertEquals(2020, actual.getYear());

        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());
        assertNotEquals(SmartCardNumber.generateSMCN(name, issue).getNumber(), SmartCardNumber.generateSMCN(name, issue).getNumber());

    }

}
package coursework_pt1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
/**
 * Class Description: a test class for some methods in Observatory class.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */
public class ObservatoryTest {

    Observatory ob;
    Earthquake e1;
    Earthquake e2;
    Earthquake e3;

    /**
     * Description: Initialize objects.
     */
    @Before
    public void setUp() {

        ob = new Observatory("England","UK",1967,"30 square kilometres",new ArrayList<Earthquake>());
        e1 = new Earthquake("55.125 N , 1.532 W",9.0,1998);
        e2 = new Earthquake("51.459 N , 2.587 W",6.0,1967);
        e3 = new Earthquake("29.773 N , 95.391 W",9.0,2019);
        ob.getList_earthquake().add(e1);
        ob.getList_earthquake().add(e2);
        ob.getList_earthquake().add(e3);
    }

    /**
     * Method Description: To test "Average_earthquake()" method by using assertion.
     */
    @Test
    public void TestAverage_earthquake() {
        double result = ob.Average_earthquake(ob);
        assertEquals((Double)8.0,(Double)result);
    }

    /**
     * Method Description: To test "Max_earthquake()" method by using assertion.
     */
    @Test
    public void TestMax_earthquake() {
        List<Earthquake> expection = new ArrayList<Earthquake>();
        expection.add(e1);
        expection.add(e3);
        ArrayList<Earthquake> result = (ArrayList<Earthquake>)ob.Max_earthquake(ob);
        assertEquals(expection,result);
    }

    /**
     * Method Description: To test "Bigger_mag_earthquake()" method by using assertion.
     */
    @Test
    public void TestBigger_mag_earthquake() {
        ArrayList<Earthquake> expection = new ArrayList<Earthquake>();
        expection.add(e1);
        expection.add(e3);
        ArrayList<Earthquake> result = (ArrayList<Earthquake>)ob.Bigger_mag_earthquake(ob,6.1);
        assertEquals(expection,result);
    }

    @After
    public void tearDown() {
    }
}

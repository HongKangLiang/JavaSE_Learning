package coursework_pt1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Class Description: a test class for some methods in Monitoring class.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */
public class MonitoringTest {

    Monitoring mo;
    Observatory ob1;
    Observatory ob2;
    Earthquake e1;
    Earthquake e2;
    Earthquake e3;
    Earthquake e4;
    Earthquake e5;
    Earthquake e6;

    /**
     * Description: Initialize objects.
     */
    @Before
    public void setUp() {

        mo = new Monitoring(new ArrayList<Observatory>());
        ob1 = new Observatory("England","UK",1967,"30 square kilometres",new ArrayList<Earthquake>());
        ob2 = new Observatory("America","USA",1953,"70 square kilometres",new ArrayList<Earthquake>());
        mo.getList_observatory().add(ob1);
        mo.getList_observatory().add(ob2);
        e1 = new Earthquake("55.125 N , 1.532 W",9.0,1998);
        e2 = new Earthquake("51.459 N , 2.587 W",4.8,1967);
        e3 = new Earthquake("29.773 N , 95.391 W",9.0,2019);
        e4 = new Earthquake("29.809 N , 93.982 W",6.9,1993);
        e5 = new Earthquake("31.477 N , 103.582 E",8.0,2009);
        e6 = new Earthquake("22.735 N , 110.342 E",5.0,2019);
        ob1.getList_earthquake().add(e1);
        ob1.getList_earthquake().add(e2);
        ob1.getList_earthquake().add(e3);
        ob2.getList_earthquake().add(e4);
        ob2.getList_earthquake().add(e5);
        ob2.getList_earthquake().add(e6);
    }

    /**
     * Method Description: To test "MaxAverage_observatory()" method by using assertion.
     */
    @Test
    public void TestMaxAverage_observatory() {
        Observatory expection = ob1;
        Observatory result = mo.MaxAverage_observatory(mo);
        assertEquals(expection,result);
    }

    /**
     * Method Description: To test "MaxALL_earthquake()" method by using assertion.
     */
    @Test
    public void TestMaxALL_earthquake() {
        List<Earthquake> expection = new ArrayList<Earthquake>();
        expection.add(e1);
        expection.add(e3);
        ArrayList<Earthquake> result = (ArrayList<Earthquake>)mo.MaxALL_earthquake(mo);
        assertEquals(expection,result);

    }

    /**
     * Method Description: To test "All_bigger_mag_earthquake()" method by using assertion.
     */
    @Test
    public void TestAll_bigger_mag_earthquake() {
        ArrayList<Earthquake> expection = new ArrayList<Earthquake>();
        expection.add(e1);
        expection.add(e3);
        expection.add(e5);
        ArrayList<Earthquake> result = (ArrayList<Earthquake>)mo.All_bigger_mag_earthquake(mo,7);
        assertEquals(expection,result);
    }

    @After
    public void tearDown() {
    }
}
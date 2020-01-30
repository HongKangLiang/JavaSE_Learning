package coursework_pt1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Description: an Observatory that can be created with its field.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Observatory {
    private String name_observatory;
    private String name_locatedCountry;
    private int year_start;
    private String area_cover;
    private List<Earthquake> list_earthquake;

    /**
     * Constructor without parameter.
     */
    public Observatory() {
    }
    /**
     * Constructor with parameter.
     */
    public Observatory(String name_observatory, String name_locatedCountry, int year_start, String area_cover, List<Earthquake> list_earthquake) {
        this.name_observatory = name_observatory;
        this.name_locatedCountry = name_locatedCountry;
        this.year_start = year_start;
        this.area_cover = area_cover;
        this.list_earthquake = new ArrayList<Earthquake>();
    }

    /**
     * Accessor methods for name_observatory.
     */
    public String getName_observatory() {
        return name_observatory;
    }

    /**
     * Mutator methods for name_observatory.
     */
    public void setName_observatory(String name_observatory) {
        this.name_observatory = name_observatory;
    }

    /**
     * Accessor methods for name_locatedCountry.
     */
    public String getName_locatedCountry() {
        return name_locatedCountry;
    }

    /**
     * Mutator methods for name_locatedCountry.
     */
    public void setName_locatedCountry(String name_locatedCountry) {
        this.name_locatedCountry = name_locatedCountry;
    }

    /**
     * Accessor methods for year_start.
     */
    public int getYear_start() {
        return year_start;
    }

    /**
     * Mutator methods for year_start.
     */
    public void setYear_start(int year_start) {
        this.year_start = year_start;
    }

    /**
     * Accessor methods for area_cover.
     */
    public String getArea_cover() {
        return area_cover;
    }

    /**
     * Mutator methods for area_cover.
     */
    public void setArea_cover(String area_cover) {
        this.area_cover = area_cover;
    }

    /**
     * Accessor methods for list_earthquake.
     */
    public List<Earthquake> getList_earthquake() {
        return list_earthquake;
    }

    /**
     * Mutator methods for list_earthquake.
     */
    public void setList_earthquake(List<Earthquake> list_earthquake) {
        this.list_earthquake = new ArrayList<Earthquake>();
    }

    /**
     * Method Description: this is a method to get average magnitude's value of all earthquake in an observatory.
     * @param observatory an observatory object.
     * @return double average magnitude's value of all earthquake in an observatory object.
     */
    public static double Average_earthquake(Observatory observatory) {
        double sum = 0;
        for(Earthquake e : observatory.getList_earthquake()) {
            sum += e.getMagnitude();
        }
        double ave = sum/observatory.getList_earthquake().size();
        return ave;
    }

    /**
     * Method Description: this is a method to get a List which contains all the earthquakes with maximum magnitude in an observatory.
     *
     * @param observatory an observatory object.
     * @return List<Earthquake> Sometimes there are more than one earthquake with maximum magnitude, so here I use a List to collect them.
     */
    public static List<Earthquake> Max_earthquake(Observatory observatory) {
        List<Earthquake> earthquake = observatory.getList_earthquake();
        Earthquake max = new Earthquake();
        List<Earthquake> list_e = new ArrayList<Earthquake>();
        for (Earthquake e: earthquake) {
            if (e.getMagnitude() >= max.getMagnitude()) {
                max = e;
            }
        }
        for (Earthquake ee: earthquake) {
            if (ee.getMagnitude() >=max.getMagnitude()){
                list_e.add(ee);
            }
        }
        return list_e;
    }

    /**
     * Method Description: this is a method to get a List which contains some earthquakes with a higher magnitude than input value.
     * @param observatory an observatory object.
     * @param input an Double input number.
     * @return List<Earthquake> a List contain qualified earthquakes.
     */
    public static List<Earthquake> Bigger_mag_earthquake(Observatory observatory,double input) {
        List<Earthquake> earthquake = observatory.getList_earthquake();
        List<Earthquake> list_bigger = new ArrayList<Earthquake>();
        for (int i = 0; i < earthquake.size(); i++) {
            Earthquake e = earthquake.get(i);
            if (e.getMagnitude() > input) {
                list_bigger.add(e);
            }
        }
        return list_bigger;
    }

}


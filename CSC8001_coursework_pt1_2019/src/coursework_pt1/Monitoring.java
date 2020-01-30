package coursework_pt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Description: a Monitoring class which object contains a List of observatory.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Monitoring {
    private List<Observatory> list_observatory;

    /**
     * Constructor without parameter.
     */
    public Monitoring() {
    }

    /**
     * Constructor with parameter.
     */
    public Monitoring(List<Observatory> list_observatory) {
        this.list_observatory = new ArrayList<Observatory>();
    }

    /**
     * Accessor methods for list_observatory.
     */
    public List<Observatory> getList_observatory() {
        return list_observatory;
    }

    /**
     * Mutator methods for list_observatory.
     */
    public void setList_observatory(List<Observatory> list_observatory) {
        this.list_observatory = new ArrayList<Observatory>();
    }

    /**
     * Method Description: this is a method to print all observatories in a monitoring object.
     * @param monitoring an monitoring object.
     */
    public static void Check_observatory(Monitoring monitoring) {

        for (Observatory ob_check : monitoring.getList_observatory()) {
            System.out.println("Name_observatory: " + ob_check.getName_observatory());
            System.out.println("Name_locatedCountry: " + ob_check.getName_locatedCountry());
            System.out.println("Year_start: " + ob_check.getYear_start());
            System.out.println("Area_cover: " + ob_check.getArea_cover());
            System.out.println("-------");
        }
    }

    /**
     * Method Description: this is a method to print all earthquakes in a monitoring object.
     * @param monitoring an monitoring object.
     */
    public static void Check_earthquake(Monitoring monitoring) {
        for (Observatory ob : monitoring.getList_observatory()) {
            for (Earthquake e: ob.getList_earthquake()) {
                System.out.println("Position: " + e.getPosition());
                System.out.println("Magnitude: " + e.getMagnitude());
                System.out.println("Year_of_event: " + e.getYear_of_event());
                System.out.println("Recorded by " + ob.getName_observatory());
                System.out.println("----------------");
            }
        }
    }

    /**
     * Method Description: this is a method to return a observatory which contains a List of earthquakes with a maximum average magnitude.
     * @param monitoring a monitoring object.
     * @return a observatory with a maximum average magnitude.
     */
    public static Observatory MaxAverage_observatory(Monitoring monitoring) {
        Observatory observatory_max = new Observatory();
        double max = 0;
        for (Observatory ob: monitoring.getList_observatory() ) {
            if (ob.Average_earthquake(ob) > max) {
                max = ob.Average_earthquake(ob);
                observatory_max = ob;
            }
        }
        return observatory_max;
    }

    /**
     * Method Description: this is a method to get a List which contains all the earthquakes with maximum magnitude in a monitoring.
     *
     * @param monitoring an monitoring object.
     * @return List<Earthquake> Sometimes there are more than one earthquake with maximum magnitude, so here I use a List to collect them.
     */
    public static List<Earthquake> MaxALL_earthquake(Monitoring monitoring) {
        Earthquake max = new Earthquake();
        List<Earthquake> list_e = new ArrayList<Earthquake>();
        for (Observatory ob : monitoring.getList_observatory()) {
            for (int i = 0; i < ob.getList_earthquake().size(); i++) {
                Earthquake e = ob.getList_earthquake().get(i);
                if (e.getMagnitude() >= max.getMagnitude()) {
                    max = e;
                }
            }
        }
        for (Observatory ob1: monitoring.getList_observatory()) {
            for (Earthquake ee: ob1.getList_earthquake()) {
                if(ee.getMagnitude() >= max.getMagnitude()) {
                    list_e.add(ee);
                }
            }
        }
        return list_e;

    }

    /**
     * Method Description: this is a method to get a List which contains some earthquakes with a higher magnitude than input value.
     * @param monitoring an monitoring object.
     * @param input an Double input number.
     * @return List<Earthquake> a List contain qualified earthquakes.
     */
    public static List<Earthquake> All_bigger_mag_earthquake(Monitoring monitoring,double input) {
        List<Earthquake> list_bigger = new ArrayList<Earthquake>();
        for (Observatory ob : monitoring.getList_observatory()) {
            for (int i = 0; i < ob.getList_earthquake().size(); i++) {
                Earthquake e = ob.getList_earthquake().get(i);
                if(e.getMagnitude() > input) {
                    list_bigger.add(e);
                }
            }
        }
        return list_bigger;
    }

    /**
     * Method Description: this is a method to add a new observatory object to a monitoring.
     * @param monitoring an monitoring object.
     */
    public static void Add_observatory(Monitoring monitoring) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Observatory ob = new Observatory();

        System.out.println("Please set the name of observatory: ");
        String input_name = sc.nextLine();
        ob.setName_observatory(input_name);

        System.out.println("Please set the country of observatory: ");
        String input_country = sc.nextLine();
        ob.setName_locatedCountry(input_country);

        System.out.println("Please set the started year of observatory: ");
        int input_year_start = sc.nextInt();
        ob.setYear_start(input_year_start);

        System.out.println("Please set the covered area of observatory: ");
        String input_area = sd.nextLine();
        ob.setArea_cover(input_area);

        ob.setList_earthquake(new ArrayList<Earthquake>());
        System.out.println("--------");
        monitoring.getList_observatory().add(ob);
        System.out.println("Add finished");




    }

    /**
     * Method Description: this is a method to add a new earthquake object to observatory object in a monitoring.
     * @param monitoring an monitoring object.
     */
    public static void Add_earthquake(Monitoring monitoring) {
        Scanner sc = new Scanner(System.in);
        Earthquake e = new Earthquake();

        System.out.println("Please set the position of earthquake: ");
        System.out.println("( For example: 35.897 N , 12.234 W ) ");
        String input_position = sc.nextLine();
        e.setPosition(input_position);
        System.out.println("Please set the magnitude of earthquake: ");
        double input_magnitude = sc.nextDouble();
        e.setMagnitude(input_magnitude);
        System.out.println("Please set the year of earthquake: ");
        int input_year_of_event = sc.nextInt();
        e.setYear_of_event(input_year_of_event);
        System.out.println("Please select the number of observatory: ");
        for(int i = 0; i < monitoring.getList_observatory().size(); i++) {
            System.out.println(i+1 + "----" + monitoring.getList_observatory().get(i).getName_observatory());
        }
        System.out.println("please enter the number: ");
        int input_observatory = sc.nextInt();
        monitoring.getList_observatory().get(input_observatory-1).getList_earthquake().add(e);
        System.out.println("Add finished");

    }

}

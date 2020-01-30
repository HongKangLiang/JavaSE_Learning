package coursework_pt1;

/**
 * Class Description: an Earthquake that can be created with its field.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Earthquake {
    private String position;
    private double magnitude;
    private int year_of_event;

    /**
     * Constructor without parameter.
     */
    public Earthquake(){}

    /**
     * Constructor with parameter.
     */
    public Earthquake(String position, double magnitude, int year_of_event){
        this.position = position;
        this.magnitude = magnitude;
        this.year_of_event = year_of_event;

    }
    /**
     * Accessor methods for magnitude.
     */
    public double getMagnitude() {
        return magnitude;
    }
    /**
     * Mutator methods for magnitude.
     */
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    /**
     * Accessor methods for year_of_event.
     */
    public int getYear_of_event() {
        return year_of_event;
    }
    /**
     * Mutator methods for year_of_event.
     */
    public void setYear_of_event(int year_of_event) {
        this.year_of_event = year_of_event;
    }
    /**
     * Accessor methods for position.
     */
    public String getPosition() {
        return position;
    }
    /**
     * Mutator methods for position.
     */
    public void setPosition(String position) {
        this.position = position;
    }

}

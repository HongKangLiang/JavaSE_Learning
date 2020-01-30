package TEST2_CSC8001;

public class Earthquake {
    private String position;
    private double magnitude;
    private int year_of_event;


    public Earthquake(){}
    public Earthquake(String position, double magnitude, int year_of_event){
        this.position = position;
        this.magnitude = magnitude;
        this.year_of_event = year_of_event;

    }

    public double getMagnitude() {
        return magnitude;
    }
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    public int getYear_of_event() {
        return year_of_event;
    }
    public void setYear_of_event(int year_of_event) {
        this.year_of_event = year_of_event;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }




    //--------------------------setting-------------------------------------------


}

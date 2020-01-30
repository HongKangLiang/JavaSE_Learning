package Exam_Test_2018_B2;

public class House extends Property{
    private int band;

    public House(String owner_name, double value){
        super(owner_name,value);
        if(value < 100000){
            this.band = 0;
        }else if(value > 500000){
            this.band = 2;
        } else {
            this.band = 1;
        }
    }

    public double houseTax(double r1, double r2){
        double tax;
        return tax = value * (r1 + r2 * band);
    }
}


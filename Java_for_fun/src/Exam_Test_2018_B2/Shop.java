package Exam_Test_2018_B2;

public class Shop extends Property{
    public Shop(String owner_name, double value){
        super(owner_name, value);
    }

    public double shopTax(double r){
        double tax;
        return tax = value * r;
    }
}
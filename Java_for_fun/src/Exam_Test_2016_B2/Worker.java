package Exam_Test_2016_B2;

public class Worker {
    String name;
    double salary_rate;

    public Worker(String name, double salary_rate){
        this.name = name;
        this.salary_rate = salary_rate;
    }

    public double computePay(int hours){
        double weekly_paid;
        return weekly_paid = hours * salary_rate;
    }

    public String getName(){
        return name;
    }

    public double getSalary_rate(){
        return salary_rate;
    }
}

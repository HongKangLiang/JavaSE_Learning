package Exam_Test_2016_B2;

public class HourlyWorkers extends Worker {
    public HourlyWorkers(String name, double salary_rate){
        super(name,salary_rate);
    }
    @Override
    public double computePay(int hours){
        double weekly_paid;
        if (hours <= 40) {
            return weekly_paid = hours * salary_rate;
        } else {
            return weekly_paid = 40 * salary_rate + (hours-40)*salary_rate*2;
        }
    }
}

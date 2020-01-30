package Exam_Test_2016_B2;

public class Test {
    public static String weeklyReport(Worker worker, int hours){
        String report;
        String name = worker.getName();
        String information;
        double salary_amount;
        if (worker instanceof HourlyWorkers) {
            information = "This is a hourly workers.";
            salary_amount = worker.computePay(hours);
        }else{
            information = "This is a salaried workers.";
            salary_amount = worker.computePay(hours);
        }
        report = "Name: " + name + "; "+ "Salary: " + salary_amount + "\n" + information;
        //测试输出
        System.out.println(report);
        return report;
    }
}

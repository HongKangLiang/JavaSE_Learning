package level2_day2_final;

public class Athlete_Basketball extends Athlete {
    public Athlete_Basketball() {

    }

    public Athlete_Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void learning() {
        System.out.println("学习篮球技术");
    }
}

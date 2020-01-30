package level2_day2_final;

public class Athlete_Pingpong extends Athlete implements Leaning_English{
    public Athlete_Pingpong() {

    }

    public Athlete_Pingpong(String name, int age) {
        super(name, age);
    }

    @Override
    public void learning() {
        System.out.println("学习乒乓球技术");
    }

    @Override
    public void LearnEnglish() {
        System.out.println("学习英语以便交流");
    }
}

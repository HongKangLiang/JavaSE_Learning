package level2_day2_final;

public class Person_Demo {
    public static void main(String[] args) {
        Coach_Pingpong coach1 = new Coach_Pingpong("刘国梁",45);
        System.out.println("Name: " + coach1.getName());
        System.out.println("Age: " + coach1.getAge());
        coach1.eat();
        coach1.teaching();
        coach1.LearnEnglish();
        System.out.println("------------------");

        Coach_Basketball coach2 = new Coach_Basketball("宫鲁鸣", 60);
        System.out.println("Name: " + coach2.getName());
        System.out.println("Age: " + coach2.getAge());
        coach2.eat();
        coach2.teaching();
        System.out.println("------------------");

        Athlete_Pingpong athlete1 = new Athlete_Pingpong("张继科", 25);
        System.out.println("Name: " + athlete1.getName());
        System.out.println("Age: " + athlete1.getAge());
        athlete1.eat();
        athlete1.learning();
        athlete1.LearnEnglish();
        System.out.println("------------------");

        Athlete_Basketball athlete2 = new Athlete_Basketball("易建联", 28);
        System.out.println("Name: " + athlete2.getName());
        System.out.println("Age: " + athlete2.getAge());
        athlete2.eat();
        athlete2.learning();
        System.out.println("------------------");
    }
}

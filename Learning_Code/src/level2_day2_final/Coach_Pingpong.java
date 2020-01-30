package level2_day2_final;

public class Coach_Pingpong extends Coach implements Leaning_English {
    public Coach_Pingpong() {

    }

    public Coach_Pingpong(String name, int age) {
        super(name, age);
    }

    @Override
    public void teaching() {
        System.out.println("教乒乓球技术");
    }

    @Override
    public void LearnEnglish() {
        System.out.println("学习英语以便交流");
    }
}

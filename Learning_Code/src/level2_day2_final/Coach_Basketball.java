package level2_day2_final;

public class Coach_Basketball extends Coach {
    public Coach_Basketball() {

    }

    public Coach_Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void teaching() {
        System.out.println("教篮球技术");
    }
}

package level2_day2_final;

public abstract class Athlete extends Person  {

    public Athlete() {

    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃运动员营养餐");;
    }

    public abstract void learning();
}

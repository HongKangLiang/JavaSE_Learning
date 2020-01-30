package level2_day2_final;

public abstract class Coach extends Person {
    public Coach() {

    }

    public Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃正常餐");
    }

    public abstract void teaching();
}


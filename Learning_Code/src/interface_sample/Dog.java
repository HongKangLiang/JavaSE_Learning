package interface_sample;

public class Dog extends Animal implements Jumpping{

    public Dog() {

    }

    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat bones");
    }

    @Override
    public void jump() {
        System.out.println("dog jumps low");
    }
}

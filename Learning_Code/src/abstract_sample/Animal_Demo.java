package abstract_sample;

public class Animal_Demo {
    public static void main(String[] args) {
        Animal s1 = new Cat("jerry", 18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.eat();

        System.out.println("--------------");

        Animal s2 = new Dog("puppy", 15);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        s2.eat();
    }
}

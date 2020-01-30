package polymorphism;

public class Animal_Demo {
    public static void main(String[] args) {
        //无参创建对象,采用多态创建
        Animal s1 = new Cat();
        s1.setName("jerry");
        s1.setAge(5);
        System.out.println(s1.getName() + ";" + s1.getAge());
        s1.eat();
        //带参创建对象
        s1 = new Cat("jerry", 5);
        System.out.println(s1.getName() + ";" + s1.getAge());
        s1.eat();

        //创建狗class的对象，采用多态，有参创建
        Animal s2 = new Dog("puppy",7);
        System.out.println(s2.getName() + ";" + s2.getAge());
        s2.eat();

    }
}

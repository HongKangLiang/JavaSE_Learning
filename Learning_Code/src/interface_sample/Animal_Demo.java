package interface_sample;

public class Animal_Demo {
    public static void main(String[] args) {
        //用多态方式创建接口，接口多态只能调用接口里的方法，不能调用父类抽象类里的方法
        Jumpping s = new Cat();
        s.jump();
        System.out.println("----------------");

        //在这个JDK版本中，用多态创建父类抽象类创建对象，他也可以调用接口里的方法，这在之前的JDK版本中是不允许的
        Animal s1 = new Cat("jerry",5);
        s1.eat();
        s1.jump();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        System.out.println("------------------");

        Animal s2 = new Dog("puppy",6);
        s2.eat();
        s2.jump();
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        System.out.println("-------------------");
        //但是真正在使用过程中，我们不会用上述两种多态的方法来创建实例对象
        //而是直接用子类Cat或者Dog来创建，因为这些子类即继承来父类的方法，又用implement实现了接口的方法
        //所以直接用子类创建的对象拥有的内容是最丰富的

        Cat s3 = new Cat("jerry", 8);
        s3.eat();
        s3.jump();
        System.out.println(s3.getName());
        System.out.println(s3.getAge());

    }
}

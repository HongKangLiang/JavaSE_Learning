package Anonymous_Inner_Class;

public class Jumpping_Demo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        Jumpping_Operator j0 = new Jumpping_Operator();
        /*
        在创建好接口操作类的对象j1之后，我们想要调用接口操作类里的method方法
        而method方法里的传入参数是接口Jumpping名，根据参数传递的知识，当接口名作为方法的形参的时候
        需要传入method这个方法的是接口的实例化对象，所以就需要创建一个实例化对象，这里我们创建cat和dog
        对接口进行实例化，并通过无参和多态创建接口的实例化对象
         */
        Jumpping j1 = new Cat();
        Jumpping j2 = new Dog();
        j0.method(j1);
        j0.method(j2);
        System.out.println("------------------");
        /*
        上述方法确实可以实现调用里method方法，但是太麻烦，每次调用的时候都需要创建一个实例化对象
        并重写接口里的抽象类方法，所以我们有更简单的方法，就是直接创建匿名内部类
        因为匿名内部类的本质：是一个继承了该类或者实现类该接口的子类匿名对象
        */

        j0.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("兔子可以跳高");
            }
        });

        j0.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("老鼠可以跳高");
            }
        });
       /*
       这就是匿名内部类最常使用的情况，当我们想直接使用以接口或者类作为参数传入的方法，来实现接口或者类中的
       抽象方法时，就不需要每一次都创建一个类来创建子类对象或者实例化对象，进而作为传入参数才能调用方法
       可以直接在抽象方法里直接创建匿名内部类
       */
    }
}

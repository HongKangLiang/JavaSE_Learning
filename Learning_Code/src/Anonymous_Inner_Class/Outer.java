package Anonymous_Inner_Class;

/*匿名内部类面试题：
   按照要求，补齐代码
        interface Inter { void show(); }
        Class Outer { //补齐代码 }
        Class OuterDemo {
              public static void main(String[] args) {
                      Outer.method().show();
                    }
             }
         要求在控制台输出"HelloWorld"


  思路：1：在main方法中，Outer.method()可以看出，method()应该是一个静态方法；
       2：在main方法中，Outer.method().show()可以看出：
                      1）method()方法的返回值是一个对象；
                      2）又由于接口Inter中有一个show()方，所以可以认为method()方法的返回值是一个接口的实现类对象；
                      3）但是题目没有定义类去实现接口Inter，所以只能是利用匿名内部类的方法作为接口的实现类对象；
                      4）又因为在调用show()方法时要输出HelloWorld，所以要把show()方法在匿名内部类中重写。
*/


class Outer {
    public static Inter method() {
       return new Inter() {
           public void show() {
               System.out.println("HelloWorld");
           }
        };
    }
}

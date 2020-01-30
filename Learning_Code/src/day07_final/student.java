package day07_final;

/*
    需求：定义标准学生类，使用private和this的修饰，
         要求分别使用空参和有参的方法创建对象，
         空参创建的对象通过set来赋值，
         有参创建的对象直接赋值
 */
//   定义成员变量
public class student {
    private String name;
    private int age;

//   构造方法
    public student() {}                     //空参构造方法
    public student(String name,int age){    //带参构造方法
        this.name = name;
        this.age = age;
    }

//  set/get方法，为空餐创建的对象赋值
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

//   show方法
    public void show() {
        System.out.println(name+ "--------"+age);
    }

}

package ArrayList;

//定义一个学生类，以便test_1_4使用

public class student {
    private String name;
    private int age;

    public student() {}
    public student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //下面是根据空参构造方法定义的get/set方法
    //但其实我们上面使用的有参构造方法后，可以在其他类中直接定义name和age，不用使用set定义
    //但我们要把name和age输出的话，是需要调用get方法的，所以我们在这里定义了get/set
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
}

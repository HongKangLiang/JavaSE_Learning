package level2_day7_2_2;

public class Student {
    private int age;
    private String name;

    public Student() {

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAge() {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

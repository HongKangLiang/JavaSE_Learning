package interface_sample;

public abstract class Animal implements Jumpping {
    private String name;
    private int age;

    public Animal(){

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

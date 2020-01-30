package inheritance_3_1;

public class human {
    String name;
    int age;

    public human() {

    }

    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show_name(String name) {
        System.out.println("Name: " + name);
    }

    public void show_age(int age) {
        System.out.println("Age: " + age);
    }
}

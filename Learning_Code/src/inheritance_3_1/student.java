package inheritance_3_1;

public class student extends human {

    public student() {
    }

    public student(String name, int age) {
        super(name,age);
    }

    public void show_function(String studying) {
        System.out.println("Function: " + studying);
    }
}

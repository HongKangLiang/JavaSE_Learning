package inheritance_3_1;

public class teacher extends human {

    public teacher() {

    }

    public teacher(String name, int age) {
        super(name,age);
    }

    public void show_function(String teaching) {
        System.out.println("Function: " + teaching);
    }
}

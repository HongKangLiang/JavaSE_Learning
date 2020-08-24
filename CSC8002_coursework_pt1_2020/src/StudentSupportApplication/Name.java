package StudentSupportApplication;

/**
 * Class Description: This is a class to encapsulate student's name.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */
public class Name {
    private String first_name;
    private String last_name;

    /**
     * Method Description: Constructor without parameters.
     */
    public Name() {
    }

    /**
     * Method Description: Constructor with parameters.
     */
    public Name(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    /**
     * Method Description: get the first name of an instance of name.
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Method Description: get the last name of an instance of name.
     */
    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {
        return first_name + " " + last_name;
    }
}

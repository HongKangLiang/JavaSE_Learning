package coursework2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Description: a class that can be created with its field as an client.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Client implements Comparable<Client> {
    private String surname;
    private String firstname;
    private List<Order> list_order;

    /**
     * Constructor without parameter.
     */
    public Client() {
    }

    /**
     * Constructor with parameter.
     */
    public Client(String firstname, String surname) {
        this.surname = surname;
        this.firstname = firstname;
        this.list_order = new ArrayList<Order>();
    }

    /**
     * Accessor methods for surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Mutator methods for surname.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Accessor methods for firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Mutator methods for firstname.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Accessor methods for list_ticket.
     */
    public List<Order> getList_ticket() {
        return list_order;
    }

    /**
     * Mutator methods for list_ticket.
     */
    public void setList_ticket(List<Order> list_ticket) {
        this.list_order = list_ticket;
    }

    /**
     * Method Description: this is a method to check if a client is a registered one.
     * @param new_client: a client to be checked
     * @param list: a list contains information of all clients.
     * @return boolean: if the client is a registered one, return true.
     */
    public static boolean CheckIfValid(Client new_client, SortedArrayList<Client> list){
        boolean b = false;
        for (Client c : list) {
            if ((new_client.getFirstname().equals(c.firstname)) && (new_client.getSurname().equals(c.surname))) {
                b = true;
                break;
            }
        }
        return b ;
    }

    /**
     * Method Description: this is a method to get an object of client with its field.
     * @param s1: firstname of client
     * @param s2: surname of client
     * @return Client : an object of Client class which meet the same firstname and surname as require.
     */
    public static Client FindClient(String s1, String s2, SortedArrayList<Client> list) {
        int index = 0;
        for (int i =0; i < list.size(); i++) {
            if ((list.get(i).getFirstname().equals(s1)) && (list.get(i).getSurname().equals(s2))) {
                index = i;
                break;
            }
        }
        return list.get(index);
    }

    /**
     * Method Description: this is a method to display information about specific client.
     * @param c: an object of Client class
     * @return int t: capacity of list of orders for the specific client.
     */
    public static int Display(Client c) {
        System.out.println("--------Information of client-----------");
        System.out.println("First Name: " + c.getFirstname()+ "    " + "Surname: " + c.getSurname());
        if (!(c.getList_ticket().isEmpty())) {
            System.out.println("Order details: ");
            for (int i = 0; i < c.getList_ticket().size(); i++) {
                System.out.println(i+1 + "----"+"Event: " + c.getList_ticket().get(i).getName_event() + "   " + "Quantity: " + c.getList_ticket().get(i).getTicket_quantity());
            }
        }else {
            System.out.println("No ticket orders!");
        }
        return c.getList_ticket().size();
    }

    /**
     * Method Description: this is a method to override the compareTo method in Comparable interface.
     *                     Firstly, the clients will be sorted in the ascending order of their surnames.
     *                     If they have the same surnames, the firstname will be sorted.
     */
    @Override
    public int compareTo(Client o) {
        int num1 = this.surname.compareTo(o.surname);
        int num2 = num1==0 ? this.firstname.compareTo(o.firstname) : num1 ;
        return num2;
    }

}

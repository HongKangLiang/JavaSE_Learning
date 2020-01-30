package coursework2;

/**
 * Class Description: a class that can be created with its field as an order.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Order {
    private int ticket_quantity;
    private String name_event;

    /**
     * Constructor without parameter.
     */
    public Order() {
    }

    /**
     * Constructor with parameter.
     */
    public Order(int ticket_quantity, String name_event) {
        this.ticket_quantity = ticket_quantity;
        this.name_event = name_event;
    }

    /**
     * Accessor methods for ticket_quantity.
     */
    public int getTicket_quantity() {
        return ticket_quantity;
    }

    /**
     * Mutator methods for ticket_quantity.
     */
    public void setTicket_quantity(int ticket_quantity) {
        this.ticket_quantity = ticket_quantity;
    }

    /**
     * Accessor methods for name_event.
     */
    public String getName_event() {
        return name_event;
    }

    /**
     * Mutator methods for name_event.
     */
    public void setName_event(String name_event) {
        this.name_event = name_event;
    }


    /**
     * Method Description: this is a method to get an object of Order class for specific client and number.
     * @param i
     * @param c : an object of Client class
     * @return Order t : an object of Order class
     */
    public static Order FindTicket (int i, Client c) {
        Order t = c.getList_ticket().get(i-1);
        return t;
    }
}

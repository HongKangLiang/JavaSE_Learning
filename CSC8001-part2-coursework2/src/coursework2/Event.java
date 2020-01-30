package coursework2;

/**
 * Class Description: a class that can be created with its field as an event.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class Event implements Comparable<Event> {
    private String name;
    private int ticket_available;

    /**
     * Constructor without parameter.
     */
    public Event() {
    }

    /**
     * Constructor with parameter.
     */
    public Event(String name, int ticket_available) {
        this.name = name;
        this.ticket_available = ticket_available;
    }

    /**
     * Accessor methods for name.
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator methods for name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor methods for ticket_available.
     */
    public int getTicket_available() {
        return ticket_available;
    }

    /**
     * Mutator methods for ticket_available.
     */
    public void setTicket_available(int ticket_available) {
        this.ticket_available = ticket_available;
    }

    /**
     * Method Description: this is a method to display information of all events to the terminal window.
     * @param list: A list with event object as its element.
     */
    public static void display_event(SortedArrayList<Event> list) {
        int i = 1;
        for (Event e : list) {
            System.out.println("Event: "+ i + "------" + e.getName());
            i++;
        }
    }

    /**
     * Method Description: this is a method to update information of event when an order is cancelled.
     * @param list: A list with event object as its element.
     */
    public static void updateEvent_cancel(String s, int n, SortedArrayList<Event> list) {
        for (Event e : list) {
            if (e.getName().equals(s)) {
                e.setTicket_available(e.ticket_available + n);
                break;
            }
        }
    }

    /**
     * Method Description: this is a method to override the compareTo method in Comparable interface.
     */
    @Override
    public int compareTo(Event e) {
        return this.name.compareTo(e.getName());
    }
}

package coursework2;

import java.io.*;
import java.util.Scanner;

/**
 * Class Description: a Interaction_Demo class with a main method.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */
public class Interaction_Demo {

    /**
     * Method Description: this is a main method to realize the function of interaction.
     */
    public static void main(String[] args) throws IOException {

        /**
         * Description: creat objects to get information from specific file.
         */
        FileReader input_file = new FileReader("/Users/lianghongkang/Java-file-test/input_file_CSC8001.txt");
        FileWriter output_file = new FileWriter("/Users/lianghongkang/Java-file-test/output_file_CSC8001.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(output_file);
        SortedArrayList<SortedArrayList> list = new SortedArrayList<>();
        /**
         * Description: call ReadFile() method.
         */
        Interaction_Demo.ReadFile(list,input_file);
        /**
         * Description: Define list of client and event separately.
         */
        SortedArrayList<Event> list_event = list.get(0);
        SortedArrayList<Client> list_client = list.get(1);

        /**
         * Description: display a menu on terminal window.
         */
        while (true) {
            System.out.println("Welcome to ticket managing System:");
            System.out.println("(Please check the function menu below and enter the corresponding letter)");
            System.out.println("-------------------------------");
            System.out.println("f----to finish running the program");
            System.out.println("e----to display the information about all the events");
            System.out.println("c----to display the information about all the clients");
            System.out.println("b----to book tickets for the registered clients");
            System.out.println("r----to cancel orders for the registered clients");
            System.out.println("-------------------------------");

            /**
             * Description: realize all the functions provided in menu by calling variety of methods.
             */
            Scanner sc = new Scanner(System.in);
            Scanner sb = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "f":
                    System.out.println("Thank you for using our system !");
                    bufferedWriter.close();
                    System.exit(0);
                    break;
                case "e":
                    for (Event e : list_event) {
                        System.out.println("Type of event: " + e.getName());
                        System.out.println("Available tickets: " + e.getTicket_available());
                    }
                    break;
                case "c":
                    for (Client c : list_client) {
                        Client.Display(c);
                    }
                    break;
                case "b":
                    System.out.println("Please choose the number of event: ");
                    Event.display_event(list_event);
                    int num_b = sc.nextInt();
                    System.out.println("-------Information of event------");
                    System.out.println("Event: " + list_event.get(num_b - 1).getName());
                    System.out.println("Available tickets: " + list_event.get(num_b - 1).getTicket_available());
                    System.out.println("--------------------------------");
                    System.out.println("Please enter the number of tickets to book: ");
                    int num_bb = sc.nextInt();
                    if (num_bb > list_event.get(num_b - 1).getTicket_available()) {
                        System.out.println("Notification : There is not sufficient tickets of " + list_event.get(num_b - 1).getName() + " !");
                        Interaction_Demo.RecordNotification(list_event.get(num_b - 1),bufferedWriter);
                        break;
                    } else {
                        System.out.println("Please enter the first name of client:  ");
                        String first_input = sb.nextLine();
                        System.out.println("Please enter the surname of client:  ");
                        String surname_input = sb.nextLine();
                        Client c = new Client(first_input, surname_input);
                        if (c.CheckIfValid(c, list_client)) {
                            Order order = new Order(num_bb, list_event.get(num_b - 1).getName());
                            Client c_valid = Client.FindClient(first_input, surname_input, list_client);
                            c_valid.getList_ticket().add(order);
                            int previous_ticket = list_event.get(num_b - 1).getTicket_available();
                            int current_ticket = previous_ticket - num_bb;
                            list_event.get(num_b - 1).setTicket_available(current_ticket);
                            System.out.println("Successful booking!");
                        } else {
                            System.out.println("Invalid client!");
                        }
                    }
                    break;
                case "r":
                    System.out.println("Please enter the first name of client:  ");
                    String first_input = sb.nextLine();
                    System.out.println("Please enter the surname of client:  ");
                    String surname_input = sb.nextLine();
                    Client c = new Client(first_input, surname_input);
                    if (c.CheckIfValid(c, list_client)) {
                        Client c_valid = Client.FindClient(first_input, surname_input, list_client);
                        int num_order = Client.Display(c_valid);
                        if (num_order == 0) {
                            break;
                        } else {
                            System.out.println("Please select the number of order to cancel: ");
                            Scanner sf = new Scanner(System.in);
                            int input_order = sf.nextInt();
                            if (input_order <= num_order) {
                                Order order = Order.FindTicket(input_order, c_valid);
                                c_valid.getList_ticket().remove(order);
                                Event.updateEvent_cancel(order.getName_event(), order.getTicket_quantity(), list_event);
                                System.out.println("Successful Cancel!");
                            } else {
                                System.out.println("Invalid number, please retry!");
                            }
                        }
                    } else {
                        System.out.println("Invalid client !");
                    }

                    break;
                default:
                    System.out.println("Invalid number, please retry!");
            }
        }
    }

    /**
     * Method Description: this is a method to get a List which contains information about events and clients from a txt file.
     * @param list
     * @param input_file
     * @return SortedArrayList<SortedArrayList<T>> list: contains two list as its element.
     */
    public static SortedArrayList ReadFile(SortedArrayList list, FileReader input_file) throws IOException {

        SortedArrayList<Event> list_event = new SortedArrayList<Event>();
        SortedArrayList<Client> list_client = new SortedArrayList<Client>();
        BufferedReader br = new BufferedReader(input_file);

        /**
         * To get information about events from specific file.
         */
        String total_event = br.readLine();
        int line_event = (Integer.parseInt(total_event)) * 2;
        int line_read_e = 1;
        String name;
        String ticket;
        while (line_read_e < line_event + 1) {
            name = br.readLine();
            ticket = br.readLine();
            int num_ticket = Integer.parseInt(ticket);
            Event e = new Event();
            e.setName(name);
            e.setTicket_available(num_ticket);
            list_event.insertion(e,list_event);
            line_read_e ++;
            line_read_e ++;
        }
        list.add(list_event);

        /**
         * To get information about clients from specific file.
         */
        int line_read_c = line_read_e + line_event + 1 ;
        String total_client = br.readLine();
        int line_client = (Integer.parseInt(total_client)) + line_read_e + line_event + 1 ;
        String client;
        while (line_read_c < line_client ) {
            client = br.readLine();
            String[] arr = client.split(" ");
            Client c = new Client(arr[0],arr[1]);
            list_client.insertion(c,list_client);
            line_read_c ++;
        }
        list.add(list_client);

        /**
         * Release resources.
         */
        br.close();
        return list;
    }

    /**
     * Method Description: this is a method to print a note to a file when there are not enough tickets of specific event.
     * @param bw: an object of BufferedWriter class.
     * @param e: it is the specific object of event which cannot meet the demand of ticket.
     * @return SortedArrayList<SortedArrayList<T>> list: contains two list as its element.
     */
    public static void RecordNotification(Event e, BufferedWriter bw) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Notification : There is not sufficient tickets of ").append(e.getName()).append(" !");
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();
    }
}

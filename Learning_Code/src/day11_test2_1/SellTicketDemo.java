package day11_test2_1;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st,"Ticket Window 1");
        Thread t2 = new Thread(st,"Ticket Window 2");
        Thread t3 = new Thread(st,"Ticket Window 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

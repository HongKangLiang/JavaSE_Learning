package day11_test2_1;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    int num_ticket = 101 - tickets;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //public static Thread currentThread()
                    System.out.println(Thread.currentThread().getName() + " is selling ticket No." + num_ticket+ ". ");
                    tickets--;
                }
            }
        }
    }
}


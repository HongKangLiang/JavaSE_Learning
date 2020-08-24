package Exam_17_18.Q3;

public class BankAccountDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount b1 = new BankAccount(1000);
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        b1.withdraw(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    b1.deposit(1000);
                }
            }
        };

        t1.start();
        t2.start();
        Thread.sleep(5000);
        System.out.println(b1.getBalance());
    }
}

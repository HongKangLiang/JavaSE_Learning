package Exam_17_18.Q3;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double money){
        balance += money;
        notifyAll();
    }

    public synchronized void withdraw(double money) throws InterruptedException {
        while (balance < money){
            wait();
        }
        balance -= money;
    }

    public double getBalance() {
        return balance;
    }
}

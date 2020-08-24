package Exam_18_19.Q3;

public class LemonadeMachine {
    private int counter;

    public LemonadeMachine(int counter) {
        this.counter = counter;
    }

    public synchronized void dispense() throws InterruptedException {
        while (counter == 0){
            wait();
        }
        counter--;
    }

    public synchronized void refill(int value){
        counter += value;
        notifyAll();
    }
}

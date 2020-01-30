package HAHAHA;

public class MaxAndMin_Demo {
    public static void main(String[] args) {
        MaxAndMin test_1 = new MaxAndMin(3);

        test_1.store(5);
        test_1.store(4);
        test_1.store(6);
        test_1.store(90);
        test_1.store(25);
        test_1.store(-5);
        test_1.store(0);

        int max = test_1.getValue_max();
        int min = test_1.getValue_min();

        System.out.println("Value: " + test_1.getValue());
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

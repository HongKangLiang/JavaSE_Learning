package HAHAHA;

public class Total {
    public static void main(String[] args) {

        int[] numbers = {4,1,22,9,14,3,9};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("total: " + sum);
    }
}

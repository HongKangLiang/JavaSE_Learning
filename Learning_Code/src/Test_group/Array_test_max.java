package Test_group;

public class Array_test_max {
    public static void main(String[] args) {
        int[] arr = {90, 89, 07, 78, 99, 35, 47, 82};
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
            }
        }
        System.out.println("max:" + max);
    }
}

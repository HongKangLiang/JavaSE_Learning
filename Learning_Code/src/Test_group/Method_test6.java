package Test_group;

//需求：设计一个方法用于获取数组中元素最大值


public class Method_test6 {
    public static void main(String[] args) {

        //调用函数
        double[] arr = {89,23,43,535,232,3432,45,23432,435,564,675};
        double Arsenal = get_Max(arr);
        System.out.println("The biggest number is " +  Arsenal);

    }

    public static double get_Max(double arr[]) {
        double max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if(arr[x] > max) {
                max =arr[x];
            }
        }
        return max;
    }
}


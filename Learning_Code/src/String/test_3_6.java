package String;

//定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，
//并在数据台实现输出。例如：数组为{1,2,3}，在控制台输出[1,2,3]

public class test_3_6 {
    public static void main(String[] args) {
        int[] print_in = {1,2,3};
        //调用方法
        System.out.println(printout(print_in));
    }

    //定义一个方法实现需求，明确返回值和输入参数
    public static String printout(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}

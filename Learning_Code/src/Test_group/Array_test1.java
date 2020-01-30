package Test_group;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Array_test1 {
    public static void main(String[] args) {
        int[] arr = new int[3];

     /*
        左边：
            int:说明数组中的元素类型是int类型
            []:说明这是一个数组
            arr:这是数组的名称，可以随意命名
         右边：
             new:为数组申请内存空间
             int:说明数组中的元素类型是int类型
             []:说明这是一个数组
             3:数组长度，其实就是指数组中的元素个数
      */

        //输出数组名
        System.out.println(arr);   //输出"[I@61bbe9ba"是内存地址

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}

package int_String;

//有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”

import java.util.Arrays;

public class level2_day04_test1_4 {
    public static void main(String[] args) {
        String original = "91 27 46 38 50";
        String[] s1 = original.split(" ");
       /* for(int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }*/
        int[] s2 = new int[s1.length];
        for(int i = 0; i < s1.length; i++) {
           s2[i] = Integer.parseInt(s1[i]);
       }

        Arrays.sort(s2);

        StringBuilder result = new StringBuilder();
        for (int x = 0; x < s2.length; x++) {
            if(x == s2.length - 1) {
                result.append(s2[x]);
            }else {
                result.append(s2[x]).append(" ");
            }
        }

        System.out.println(result);
    }
}

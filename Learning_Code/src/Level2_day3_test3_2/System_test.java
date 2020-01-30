package Level2_day3_test3_2;

/*
     需求：在控制台输出1到10000，计算这段代码执行需要多长时间
 */
public class System_test {
    public static void main(String[] args) {

        double time_1 = System.currentTimeMillis();

        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }

        double time_2 = System.currentTimeMillis();

        System.out.println("此段代码执行共耗时： "  + (time_2 - time_1));
    }
}

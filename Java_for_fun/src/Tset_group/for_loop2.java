package Tset_group;

//求1-5之间的和，并把求和结果在数据台输出

public class for_loop2 {
	public static void main(String[] args) {
		
		int sum = 0 ;
		for (int x = 1 ; x <= 5; x++ ) {
			sum = sum + x;
		}
		System.out.println(sum);
	}
}

package Tset_group;

import java.util.Scanner;

public class weekdays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个代表今天的数字");
		
		int day = sc.nextInt();
		
		if(day == 1) {
			System.out.println("今天是星期一");
		} else if(day == 2) {
			System.out.println("今天是星期二");
		} else if(day == 3) {
			System.out.println("今天是星期三");
		} else if(day == 4) {
			System.out.println("今天是星期四");
		} else if(day == 5) {
			System.out.println("今天是星期五");
		} else if(day == 6) {
			System.out.println("今天是星期六");
		} else {
			System.out.println("今天是星期日");
		}
			
			
	}

}

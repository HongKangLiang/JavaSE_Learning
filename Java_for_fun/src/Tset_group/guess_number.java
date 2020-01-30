
/*
 * 程序自动生成一个1-100之间的数字，使用程序实现猜出整个数字是多少？
 * 当猜错的时候根据不同情况给出相应的提示
 * ～当猜的数字比生成的数字大，提示你猜的数字大了
 * ～当猜的数字比生成的数字小，提示你猜的数字小了
 * ～当猜的数字等于生成的数字，提示恭喜你猜中了
 */

package Tset_group;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
	public static void main(String[] args) {
		
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		while (true ) {
		Scanner sc = new Scanner(System.in);
	     	System.out.println("请猜一个数字并且输入：");
	     	int guess = sc.nextInt();
			
			if (guess > number) {
				System.out.println("你猜的数字大了");
			} else if (guess < number){
				System.out.println("你猜的数字小了");
			}else if (guess == number){
				System.out.println("恭喜你猜中了");
				break;
			}
		else {
			System.out.println("你输入的数字不在猜测范围内");
	       	}
	      }
		
	   }
	}



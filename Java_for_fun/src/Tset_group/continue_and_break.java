
/*
 * continue:在循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次执行
 * break:在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环
 */


package Tset_group;

public class continue_and_break {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if ( i % 2 == 0) {
				//可以分别放开下面的continue和break看过程
				//continue;
				//break;
			}
				System.out.println(i);
			}
		}
	}



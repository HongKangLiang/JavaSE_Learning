package Tset_group;

//第一步：导包，在public class上面
import java.util.Scanner;

public class monk_test_Scanner {
	public static void main(String[] args) {
//第二步：创建对象,sc为变量名，其他均可不变
		Scanner sc = new Scanner(System.in);
//第三步：接收变量
		System.out.println("请输入第一个和尚的身高：");
		int height_1 = sc.nextInt();
		System.out.println("请输入第二个和尚的身高：");
		int height_2 = sc.nextInt();
		System.out.println("请输入第三个和尚的身高：");
		int height_3 = sc.nextInt();
		
		int temp_height = height_1 > height_2 ? height_1 : height_2;
		int max_height = temp_height > height_3 ? temp_height : height_3;
		
		System.out.println("这三个和尚中身高最高的是:" + max_height + " cm");
		
		
	}

}

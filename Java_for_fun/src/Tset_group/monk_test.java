package Tset_group;
//
//
//题目：现在有三个和尚，身高分别为150cm，210cm，165cm，请用程序实现这三个和尚的最高身高。
//
//

public class monk_test {
	public static void main(String[] args) {
		int height_1 = 150;
		int height_2 = 210;
		int height_3 = 165;
		
		int temp_height = height_1 > height_2 ? height_1 : height_2;
		int max_height = temp_height > height_3 ? temp_height : height_3;
		
		System.out.println("max_height:" + max_height + " cm");
	}

}

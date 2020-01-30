package Tset_group;

/*珠穆朗玛峰的高度是8844.43米，折合8844430毫米
 * 假如有一张足够大的纸，厚度是0.1毫米
 * 请问：折叠多少次，可以折叠成珠穆朗玛峰的高度？
 * 
 */
public class while_loop1 {
	public static void main(String[] args) {
		int i = 0;
		double height = 0.1 ;
		while (height <= 8844430) {
				i++;
				height *= 2;
			} 
				System.out.println(i);
			}
			
		
	}


/* 用for循环来编写
public class while_loop1 {
	public static void main(String[] args) {
		int i = 0;
		
		for (double height = 0.1; height < 8844430 ; i++) {
			height *= 2;
		}
		System.out.println(i);
		
	}
}
*/
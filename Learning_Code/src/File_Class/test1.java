package File_Class;

import java.io.File;

/*需求：判断某个目录下是否有后缀名为.txt的文件，如果有就输出此文件名称

  思路：1、封装Java-file-test这个目录
       2、获取该目录下所有的文件或者文件夹到一个数组
       3、遍历数组，得到每一个对象然后判断：是否是文件
             是：继续判断是否是以.txt结尾
                是：输出名称
                否：不理会
             否：不理会
* */
public class test1 {
    public static void main(String[] args) {
        //创建对象，封装目录
        File f = new File("/Users/lianghongkang/Java-file-test");
        //用listFiles方法获取目录下所有文件或文件夹
        File[] f_arr = f.listFiles();
        //遍历
        for (File f1 : f_arr) {
            //判断是否是文件
            if (f1.isFile()) {
                //判断文件的后缀是否为.txt
                if (f1.getName().endsWith(".txt")) {
                    //输出后缀为.txt的文件的名称
                    System.out.println(f1.getName());
                }
            }
        }
    }
}

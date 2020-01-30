package Recursion;

import java.io.File;
import java.lang.reflect.Array;

/*需求：把电脑/Users/lianghongkang/Downloads目录下，所有的以.java结尾的文件的名称输出在控制台
*
* 思路：A:封装电脑目录
*      B:获取改目录下所有的文件或文件夹的File数组
*      C:遍历该数组，得到每一个File对象
*      D:判断该File对象是否为文件夹
*         是：回到B！！！！！
*         否：继续判断是否以.doc结尾
*              是：输出名字
*              否：不用管
* 因为思路中有返回B的操作，所以我们可以写一个带递归Recursion的方法
* */
public class Recursion_Demo_2 {
    public static void main(String[] args) {
        File srcfile = new File("/Users/lianghongkang/Downloads");
        method(srcfile);

    }
    public static void method(File file) {
            File[] array = file.listFiles();

            for (File file1 : array) {
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".java")) {
                        System.out.println(file1.getName());
                    }
                } else {
                    method(file1);
                }
            }
        }

}

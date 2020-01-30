package File_Class;

import java.io.File;
import java.io.FilenameFilter;

/*需求：判断某个目录下是否有后缀名为.txt的文件，如果有就输出此文件名称

  思路：1、封装Java-file-test这个目录
       2、获取该目录下所有以.txt结尾的文件到一个数组
       3、遍历数组，并输出每一个对象的名称

* */
public class test1_advanced {
    public static void main(String[] args) {
        //创建对象，封装目录
        File f = new File("/Users/lianghongkang/Java-file-test/Flie-Class-test1");

        //获取该目录下所有以.txt结尾的文件到一个数组
        //用这个方法 public String[] list(FilenameFilter filter),注意返回值不是File而是String

        String[] f_arr = f.list(new FilenameFilter() {   //匿名内部类实现FilenameFilter这个接口
            @Override
            public boolean accept(File dir, String name) {
                //return false;
                //return false;
                //返回true才会把对象添加到集合中
                //所以我们要加入我们想要的判断条件，决定是否将对象加入数组
                /*
                File file = new File(dir,name);
                boolean flag1 = file.isFile();
                boolean flag2 = name.endsWith(".txt");
                return  flag2;
                */

                //上述代码简写
                return new File(dir,name).isFile() && name.endsWith(".txt");
            }
        });
        for (String s : f_arr) {
            System.out.println(s);
        }
    }
}

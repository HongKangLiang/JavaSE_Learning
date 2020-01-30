package InputStream_OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     需求：把picture.zip文件，复制到Flie-Class-test3文件夹中的picture_copy.zip文件中
     方法： 基本字节流一次读写一个字节

     数据源：/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip

     目的地：/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip

     释放资源

* */
public class Demo_1 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip");

        //基本字节流一次读写一个字节
        int by = 0 ;
        while ((by = fis.read()) != 0) {
            fos.write(by);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}

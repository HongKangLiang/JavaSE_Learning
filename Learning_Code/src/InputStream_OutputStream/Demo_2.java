package InputStream_OutputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     需求：把picture.zip文件，复制到Flie-Class-test3文件夹中的picture_copy.zip文件中
     方法： 基本字节流一次读取一个字节数组int read(byte[] b)，返回值是int，这个int对应的数据是实际读取的字节个数

     数据源：/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip

     目的地：/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip

     释放资源

* */
public class Demo_2 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip");

        //定义一个数组
        //方法： 一次读取一个字节数组int read(byte[] b)，返回值是int，这个int对应的数据是实际读取的字节个数
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            //public void write(byte[] b, int off, int len)
            //从位于偏移量 off的指定字节数组写入 len字节到该文件输出流
            fos.write(bys,0,len);
        }
    }
}

package InputStream_OutputStream;


import java.io.*;

/*
     需求：把picture.zip文件，复制到Flie-Class-test3文件夹中的picture_copy.zip文件中

     方法： 高效字节流一次读写一个字节数组
     采用 BufferedOutputStream 和 BufferedInputStream
     写数据：BufferedOutputStream：
     该类实现缓冲输出流。 通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用
     读数据：BufferedInputStream：
     当创建BufferedInputStream时，将创建一个内部缓冲区数组

     数据源：/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip

     目的地：/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip

     释放资源

 */
public class Demo_3 {
    public static void main(String[] args) throws IOException {

        //字节缓冲输入流：BufferedInputStream(InputStream in)
        //字节缓冲输出流：BufferedOutputStream(OutputStream out)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test2/picture.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/lianghongkang/Java-file-test/Flie-Class-test3/picture_copy.zip"));

//        //高效字节流一次读取
//        int by = 0;
//        while ((by = bis.read()) != -1 ) {
//            bos.write(by);
//        }

        //高效字节流一次读取一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();

    }
}

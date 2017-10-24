package controller;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/shangri-la/b.txt");
            fos.write(97);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("文件写入失败！请重试");
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
                throw new RuntimeException("关闭资源失败");
            }
        }
    }
}

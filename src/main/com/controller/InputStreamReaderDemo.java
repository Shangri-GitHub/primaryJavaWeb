package controller;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("/Users/shangri-la/c.txt");
//        // 输出流的转换流
//        InputStreamReader fsr = new InputStreamReader(fis, "GBK");
//        char[] ch = new char[1024];
//        int len = 0;
//        while ((len = fsr.read(ch)) != -1) {
//            System.out.println(new String(ch, 0, len));
//        }
//        fsr.close();
        String str = new String();

        // 缓存输入流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/shangri-la/c.txt"));
        // 输入流的转换流
        OutputStreamWriter osw = new OutputStreamWriter(bos);
        osw.write("你好啊");
        osw.close();
    }
}

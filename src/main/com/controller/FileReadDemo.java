package controller;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 读取单个的字符流
         */
        FileReader fr = new FileReader("/Users/shangri-la/c.txt");
//        int len = 0;
//        while ((len = fr.read()) != -1) {
//            System.out.print((char)len);
//        }
//        fr.close();
        char[] ch = new char[1024];
        int len = 0;
        while ((len = fr.read(ch)) != -1) {
            System.out.print(new String(ch,0,len));
        }
        fr.close();




    }
}

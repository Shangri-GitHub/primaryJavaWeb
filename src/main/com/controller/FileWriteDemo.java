package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/shangri-la/c.txt"));
        bw.write('a');
        bw.newLine();
        bw.flush();
        bw.write("hello world");
        bw.newLine();
        bw.flush();
        bw.write("你好");



        bw.write("你好".toCharArray());

        bw.close();
    }
}

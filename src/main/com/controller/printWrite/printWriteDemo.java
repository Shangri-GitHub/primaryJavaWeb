package controller.printWrite;

import java.io.*;

/**
 * 打印流实现文本复制
 * 读取数据源 BufferedReader + FileReader 读取文本行
 * 写入数据目的  PrintWriter + Println 自动刷新
 */
public class printWriteDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("/Users/shangri-la/c.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("/Users/shangri-la/a.txt"), true);
        String line = null;
        while ((line = bfr.readLine()) != null) {
            pw.println(line);
        }
        pw.close();
        bfr.close();
    }
}

package controller;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFileDemo {
    public static void main(String[] args) {
        FileReader fr = null;

        FileWriter fw = null;
        try {
            fr = new FileReader("/Users/shangri-la/c.txt");
            fw = new FileWriter("/Users/shangri-la/d.txt");
            char[] ch = new char[1024];
            int len = 0;
            while ((len = fr.read(ch)) != -1) {
                fw.write(ch, 1, len);
                fw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                throw new RuntimeException("释放资源失败");
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException ex) {
                    throw new RuntimeException("释放资源失败");
                }
            }
        }


    }
}

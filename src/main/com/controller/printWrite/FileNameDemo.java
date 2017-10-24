package controller.printWrite;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class FileNameDemo {
    public static void main(String[] args) throws IOException {
        fun_3();

    }

    public static void fun() throws IOException {
        String str = FileUtils.readFileToString(new File("/Users/shangri-la/a.txt"));
        System.out.println(str);
    }

    public static void fun_1() throws IOException {
        FileUtils.writeStringToFile(new File("/Users/shangri-la/a.txt"), "123");
    }

    public static void fun_2() throws IOException {
        FileUtils.copyFile(new File("/Users/shangri-la/a.txt"), new File("/Users/shangri-la/Desktop/a.txt"));
    }

    public static void fun_3() {
        int a = 1;
        int b = a++ + 1;
        System.out.println(a);
        System.out.println(b);


    }

}

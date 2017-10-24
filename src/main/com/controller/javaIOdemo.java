package controller;

import java.io.File;
import java.io.IOException;

public class javaIOdemo {
    public static void main(String[] args) {

        File file = new File("/Users/shangri-la/Sites");
        String pathSeparator = File.pathSeparator;
        String separator = File.separator;

        File file1 = new File("/Users", "shangri-la/Sites");
        System.out.println(file1);   //  /Users/shangri-la/Sites

        System.out.println(pathSeparator);  //  :
        System.out.println(separator);     //   /
        System.out.println(file);     //   /Users/shangri-la/Sites

        try {
            creatFile();
            mkDir();

        } catch (IOException e) {
            e.printStackTrace();
        }
        delete();
        getName();
        getFiles();
    }

    // 创建文件
    public static void creatFile() throws IOException {
        File file = new File("/Users/shangri-la/Sites/a.txt");
        //只能创建文件，不能创建文件夹
        boolean b = file.createNewFile();
        System.out.println(b);
    }

    /**
     * 创建文件
     * mkdir
     * mkdirs 创建多文件夹
     *
     * @throws IOException
     */
    public static void mkDir() throws IOException {
        File file = new File("/Users/shangri-la/Sites/abc");
        boolean b = file.mkdirs();
        System.out.println(b);
    }

    /**
     * 删除文件／文件夹
     *
     * @throws IOException
     */
    public static void delete() {
        File file = new File("/Users/shangri-la/Sites/abc");
        boolean b = file.delete();
        System.out.println(b);
    }

    /**
     * String getName()
     * 获取文件夹／文件名字
     * String path  获取字符串路径
     * long length
     * Srting getAbsoluteFile()   获取绝对路径 String
     * File getAbsoluteFile()     获取绝对路径 File
     * String getParent     获取父路径
     * File getParentFile   获取父路径
     * boolean exists  判断路径是否存在
     * boolean isDirectory  判断是不是文件夹
     * boolean isFile  判断是不是文件夹
     */
    public static void getName() {
        File file = new File("/Users/shangri-la/Sites/abc.text");
        String name = file.getName();
        String path = file.getPath();
        Long lenth = file.length();
        File absolutefile = file.getAbsoluteFile();
        System.out.println(name);
        System.out.println(absolutefile);
        System.out.println(path);
        System.out.println(lenth);

        File parentFile = file.getParentFile().getParentFile().getParentFile().getParentFile();
        System.out.println(parentFile);
        Boolean b = file.exists();
        Boolean c = file.isFile();
        System.out.println(b);
    }

    public static void getFiles() {
        File file = new File("/Users/shangri-la/Sites");
        String[] fileNames = file.list();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

}

package com.controller.ReflectTest;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 读取配置文件
        FileReader fr = new FileReader("/Users/shangri-la/Public/clone-project/primaryJavaWeb/src/main/com/Config.txt");
        Properties properties = new Properties();
        properties.load(fr);
        System.out.println(properties.getProperty("className"));
        // 调用方法
        Class c = Class.forName(properties.getProperty("className"));
        Method method = c.getMethod(properties.getProperty("methodName"));
        Object obj = c.newInstance();
        method.invoke(obj);
    }
}

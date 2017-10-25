package com.controller.reflectDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射构造方法并进行，又快速的方法
 * 条件：
 * 1.被反射的类，具有空参的构造方法
 * 2.构造方法必须用public
 */
public class ReflectFastDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("com.controller.reflectDemo.Person");
        Object obj = Class.forName("com.controller.reflectDemo.Person").newInstance();
        /**
         * 获取成员变量的Class的方法getFields（）| 所有的公共成员变量
         * getDeclaredFields获取到所有的成员变量
         */
        Field[] fields = c.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        // 获取指定的field变量并修改
        Field field = c.getField("name");
        field.set(obj,"金毛");
        System.out.println(obj);

        /**
         * 获取指定方法eat运行
         * method[] getMethods() 获取所有的class文件中所有的公共成员变量
         * methid getMethod（String MethodName,Calss....c）
         */

        Method[] methods = c.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        // 指定的method调用方法
        Method m = c.getMethod("eat");
        m.invoke(obj);

    }
}

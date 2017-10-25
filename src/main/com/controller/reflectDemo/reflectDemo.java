package com.controller.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取类class对象的三种方式
 * 1. 对象类型
 * 2. 类的获取
 * 3. Class的静态方法获取 forName(String str)包名.类名
 * 使用class文件对象获得构造方法
 */
public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 对象类型
        Person p = new Person();
        Class c = p.getClass();
        System.out.println(c);
        // 2.类的获取
        Class c1 = Person.class;
        System.out.println(c1);
        System.out.println(c.equals(c1)); //T
        System.out.println(c == c1);        //T
        /**
         *  3. Class的静态方法获取
         *  Constructor[] getConstructor() 获取class文件中所有公共的方法
         *  Constructor[] getDeclaredConstructors() 获取class文件中所有的方法
         *  Constructor getDeclaredConstructor() 获取class文件中所有的方法
         */
        Class c2 = Class.forName("com.controller.reflectDemo.Person");
        System.out.println(c2);

        Constructor con = c2.getConstructor(String.class, int.class);
        Object obj = con.newInstance("hanxing", 18);
        System.out.println(obj);

        /**
         * 暴力反射（私有方法）
         */
        Constructor con1 = c2.getDeclaredConstructor(int.class,String.class);
        con1.setAccessible(true);
        Object obj1 = con1.newInstance(18,"jinbo");
        System.out.println(obj1);


    }
}

package com.controller.reflectDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 泛型擦除（修改）
 */
public class modifyReflectDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        ArrayList <String> list = new ArrayList <>();
        list.add("你好");
        Class c = list.getClass();
        Method method = c.getMethod("add", Object.class);
        method.invoke(list, 12);
        method.invoke(list, 0);
        System.out.println(list);
    }
}

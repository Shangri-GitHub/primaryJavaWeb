package controller;


import java.util.*;

/**
 * 传智播客
 * 1.java基础班
 * 001 :张三
 * 002 ：李四
 * 2.java大神班
 * 003 :王五
 * 004 ：赵六
 * <p>
 * <p>
 * 基础班Map <学号，姓名>
 * 传智播客Map <班级名字，基础班Map>
 */

public class ClassNameDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);


//        基础班级
        HashMap<String, String> javase = new HashMap<String, String>();
        javase.put("001", "张三");
        javase.put("002", "李四");
        System.out.println(javase);
//        java大神班
        HashMap<String, String> javaee = new HashMap<String, String>();
        javaee.put("003", "王五");
        javaee.put("004", "赵六");
        System.out.println(javaee);

//        传智播客
        HashMap<String, HashMap<String, String>> czbk = new HashMap<String, HashMap<String, String>>();
        czbk.put("java基础班", javase);
        czbk.put("java神班", javaee);
        System.out.println(czbk);

        keyset(czbk);

    }

    public static void keyset(HashMap<String, HashMap<String, String>> czbk) {
//        将健存到set集合
//        Set<String> classNameSet = czbk.keySet();
//
//        Iterator<String> classnameIt = classNameSet.iterator();
//
//        while (classnameIt.hasNext()) {
////            classnameIt.kext()czbk的健
//            String className = classnameIt.next();
////            czbk.get()获取值
//            HashMap<String, String> classMap = czbk.get(className);
//            System.out.println(classMap);
//
//            Set<String> classNum = classMap.keySet();
//            Iterator<String> classNumIt = classNum.iterator();
//            while (classNumIt.hasNext()) {
//                String studentNum = classNumIt.next();
//                String studentName = classMap.get(studentNum);
//                System.out.println(studentName);
//            }
//        }


        for(String classnameKey : czbk.keySet()){
            HashMap<String, String> classMap = czbk.get(classnameKey);
            System.out.println(classMap);
            for(String studentNum :classMap.keySet()){
                String studentName = classMap.get(studentNum);
                System.out.println(studentName);
            }
        }

    }
}

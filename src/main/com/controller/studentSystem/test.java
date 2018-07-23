package com.controller.studentSystem;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ManageSystem ms = new ManageSystem();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("-----学生管理系统--------");
            System.out.println("1、添加学生  2、查询单个学生 3、删除学生 4、查询所有学生 5、退出系统");
            System.out.println("请输入要查询的序号?");
            // 接收用户的菜单选项
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addStudent(ms);
                    break;
                case 2:
                    findStudent(ms);
                    break;
                case 3:
                    removeStudent(ms);
                    break;
                case 4:
                    queryStudent(ms);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }


    }

    private static void removeStudent(ManageSystem ms) {
        Scanner sc = new Scanner(System.in);
        String s = ms.remove(sc.next());
        System.out.println(s);
    }

    private static void findStudent(ManageSystem ms) {
        System.out.println("请输入学生姓名");
        Scanner sc = new Scanner(System.in);
        Student s = ms.find(sc.next());
        if (s != null) {
            System.out.println("学生姓名: " + s.getName() + "; ID: " + s.getId() + "; 电话:" + s.getCellphone());
        } else {
            System.out.println("没有找到学生");
        }
    }

    private static void queryStudent(ManageSystem ms) {
        ms.list();
    }

    private static void addStudent(ManageSystem ms) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入手机号");
        String cellphone = sc.next();
        Student student = new Student(id, name, cellphone);
        ms.add(student);
    }
}

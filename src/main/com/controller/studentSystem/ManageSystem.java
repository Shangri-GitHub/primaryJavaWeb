package com.controller.studentSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManageSystem {
    private List<Student> container = new ArrayList<>();

    public ManageSystem() {

    }

    // 添加一个学生对象
    public void add(Student s) {
        container.add(s);
    }

    // 列出所有学生对象
    public void list() {
//        for (int i = 0; i < container.size(); i++) {
//            Student s = container.get(i);
//            System.out.println("学生姓名" + s.getName() + "; ID: " + s.getId() + "; 电话:" + s.getCellphone());
//        }
        for(Student s : container) {
            System.out.println("学生姓名" + s.getName() + "; ID: " + s.getId() + "; 电话:" + s.getCellphone());
        }
    }

    // 根据姓名来查找
    public Student find(String name) {
        for (int i = 0; i < container.size(); i++) {
            Student s = container.get(i);
            if (name.equals(s.getName())) {
                return s;
            }
        }
        return null;
    }

    //  删除学生
    public String remove(String name) {
        // 通过迭代器的方式
//        Iterator<Student> iterator = container.iterator();
//        while(iterator.hasNext()){
//            Student s = iterator.next();
//            if(s.getName().equals(name)){
//                iterator.remove();   //注意这个地方
//            }
//        }
        // 删除下标的方式
        for (int i = 0; i < container.size(); i++) {
            if(container.get(i).getName().equals(name)){
                container.remove(i);   //注意这个地方
            }
        }
        for(Student s : container) {
            return "学生姓名" + s.getName() + "; ID: " + s.getId() + "; 电话:" + s.getCellphone();
        }
        return null;
    }
}

package com.controller.eatAppleGame;

/**
 * 案例：总共有50个苹果，分三个人吃，使用多线程技术实现谁吃的多
 * 方式1，继承thread方式来实现、
 *
 *  -----总结------
 * 继承方式：
 * 1）java中的类是继承的，如果继承了Thread就不可以继承其他类
 * 2）不能实现共享资源
 * 实现方式
 * 1）java可以实现多实现接口，还可以继承其他类（设计更优雅）
 * 2）能实现共享资源
 *  ----------
 *
 */


// 每一个同学好比是一个线程
class Person extends Thread {
    static int num = 50; //苹果总数

    public Person(String name) {
        super(name);
    }


    public void run() {
        for (int i = 0; i < 50; i++) {
            if (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "吃了" + num-- + "个苹果");  // getName()获取Thread的名称
            }
        }
    }
}

public class eatAppleGameExtend {
    public static void main(String[] args) {
        // 创建三个线程（同学）吃苹果
        new Person("小A").start();
        new Person("小B").start();
        new Person("小C").start();

    }
}

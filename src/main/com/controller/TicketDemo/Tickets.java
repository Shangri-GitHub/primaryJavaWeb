package com.controller.TicketDemo;

/**
 * 采用同步方法形式,解决线程的安全问题
 * 好处: 代码简洁
 * 将线程共享数据,和同步,抽取到一个方法中
 * 在方法的声明上,加入同步关键字
 * 问题:
 * 同步方法有锁吗,肯定有,同步方法中的对象锁,是本类对象引用 this
 * 如果方法是静态的呢,同步有锁吗,绝对不是this
 * 锁是本类自己.class 属性
 * 静态方法,同步锁,是本类类名.class属性
 */

public class Tickets implements Runnable {
    private int tickets = 100;

    public void run() {
        while (true) {
            payTicket();
        }
    }

    public synchronized void payTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 第" + tickets-- + "张");
        }
    }
}

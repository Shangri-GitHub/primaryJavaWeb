package controller.Thread;

import static java.lang.Thread.currentThread;

public class ThreadDemo {



    /**
     * 每个线程都有自己的名字
     * 运行的方法main线程，名字就是main
     * 其他新建的线程，默认名字都是"Thread-0"
     * static Thread currentThread() 返回正在执行的线程对象
     * <p>
     * 接口的另一种实现方法
     * 创建Thread类，传递Runavle接口实现类
     * 调用Thread类的start（）方法
     */
    public static void main(String[] args) throws Exception {
        System.out.println(new Thread().currentThread().getName());
        // 第一种方法
        new SleepThread().start();
        // 第二种方法（接口方式Runable）
        RunableDemo rd = new RunableDemo();
        new Thread(rd).start();
        /**
         * 匿名内部类的实现程序
         * new 父类的接口(){
         *    重新的方法
         *  }
         */

        new Thread() {
            public void run() {
                System.out.println("匿名内部类的实现");
            }
        }.start();

        // 实现接口方式 XXX implements Runable {public void run (){}}
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("匿名接口内部类");
            }
        };
        new Thread(r).start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println("匿名接口内部类");
            }
        }).start();


    }
}
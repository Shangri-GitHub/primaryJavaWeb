package controller.Thread;


import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println(es);
        es.submit(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 匿名接口内部类1");
            }
        });
        es.submit(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 匿名接口内部类2");
            }
        });

        es.submit(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 匿名接口内部类3");
            }
        });
        es.shutdown();

        /**
         * callable接口方式实现线程
         *  实现步骤
         *      工厂类Executors静态方法 newFixedThreadPool方法，创建线程池对象
         *      submit（callabel c）
         */

        ExecutorService es1 = Executors.newFixedThreadPool(2);
        Future f = es1.submit(new Callable() {
            public String call() throws Exception {
                return "abc";
            }
        });
        System.out.println(f.get());
        es1.shutdown();
    }
}

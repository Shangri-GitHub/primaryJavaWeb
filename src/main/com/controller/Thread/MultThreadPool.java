package controller.Thread;

import java.util.concurrent.*;

/**
 * 使用多线程技术，求和
 * 两个线程
 * 第1个是1+...+100
 * 第2个是1+...+200
 */
public class MultThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future f1 = es.submit(new GetSumCallable(100));
        Future f2 = es.submit(new GetSumCallable(200));

        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}

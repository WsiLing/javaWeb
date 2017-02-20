package com.qianphone.javasedemo.thread;

/**
 * Created by Admin on 2017/1/4.
 */
public class TestThread {

    public static void main(String[] args) throws InterruptedException {
        //获取调用本方法的那个线程对象
        Thread thread = Thread.currentThread();

        System.out.println("当前调用main方法的线程叫: " + thread.getName());
//        boolean isFinish = false;
//        while (!isFinish) {
//            System.out.println("主线程在执行工作");
//            Thread.sleep(1000);
//        }

        //实现多线程的第一种方式：
//        //创建一个线程的对象
//        MyWorkerThread myThread = new MyWorkerThread();
//        //调用线程的启动方法，让线程启动起来
//        myThread.start();


        //实现多线程的第二种方式：
        //创建一个线程能够执行的任务对象
        MyJob job = new MyJob();
        //创建一个线程对象，并且把任务交给线程去执行
        Thread  thread1 = new Thread(job);
        thread1.start();


        System.out.println("主线程执行结束");
    }
}

class MyJob implements Runnable{

    @Override
    public void run() {
        int progress = 0;
        while (progress != 100) {
            System.out.println("子线程正在下载,当前进度为：" + progress);
            progress++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("子线程下载完毕");
    }
}


class MyWorkerThread extends Thread {

    public void run() {
        int progress = 0;
        while (progress != 100) {
            System.out.println("子线程正在下载,当前进度为：" + progress);
            progress++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("子线程下载完毕");
    }

}

package com.huawei;

/**
 * @author xiongjianjian
 * @dte 2019/8/7 - 17:00
 */
public class ThreadRunable implements Runnable{
    @Override
    public void run() {
    printName();
    }
    public ThreadRunable(){

    }
    public synchronized void printName(){
        System.out.println("tom "+System.currentTimeMillis());
    }
    public static void main(String[] args) {
        ThreadRunable t=new ThreadRunable();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);

        t1.start();
        t2.start();
    }
}

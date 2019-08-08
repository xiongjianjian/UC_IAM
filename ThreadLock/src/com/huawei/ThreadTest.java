package com.huawei;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiongjianjian
 * @dte 2019/8/7 - 16:23
 */
public class ThreadTest extends Thread{
    Lock lock=new ReentrantLock();
    public synchronized void printName(){
        System.out.println("tom "+System.currentTimeMillis());
    }
    public void printAge(){
        synchronized (this){
            System.out.println(22+" "+System.currentTimeMillis());
        }
    }
    public void printMsg(){
        lock.lock();
        System.out.println("tom is a sunny boy! "+System.currentTimeMillis());
        lock.unlock();
    }

    @Override
    public void run() {
        printAge();
    }

    public static void main(String[] args) {
        ThreadTest t1= new ThreadTest();
        t1.start();
        ThreadTest t2= new ThreadTest();
        t2.start();
    }
}

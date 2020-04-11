package test;

import sun.awt.geom.AreaOp;

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2(t1);
        t1.start();
        t2.start();

        t2.setPriority(9);

        System.out.println("线程1"+t1.getState());
        System.out.println("线程2"+t2.getState());
    }



}

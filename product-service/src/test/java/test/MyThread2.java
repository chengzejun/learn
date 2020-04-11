package test;

public class MyThread2 extends Thread {
    private Object lock;



    public MyThread2(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
       synchronized (lock){
           System.out.println("mythread2");
       }
    }

    public synchronized  void doSome(){

    }
}

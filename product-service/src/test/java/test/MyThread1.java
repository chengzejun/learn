package test;

public class MyThread1 extends Thread{
        @Override
        public void run() {
          doSome();
        }

    public synchronized  void doSome(){
        System.out.println("thread1");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep end");

    }

}

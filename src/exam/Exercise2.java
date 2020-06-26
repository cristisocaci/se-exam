package exam;

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 11; ++i){
            System.out.println(this.getName() + " - " + i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Exercise2 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("VThread1");
        t2.setName("VThread2");
        t3.setName("VThread3");
        t1.start();
        t2.start();
        t3.start();
    }
}

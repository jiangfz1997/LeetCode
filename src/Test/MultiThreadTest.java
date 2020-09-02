package Test;

public class MultiThreadTest {
    static class Threads extends Thread{
        int ID;
        @Override

        public void run() {
            System.out.println("Thread " + ID + " Start ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + ID + "Ends");
        }
        public Threads(int ID){
            this.ID = ID;
        }
    }
    static class Threads2 implements Runnable{

        int ID;
        @Override

        public void run() {
            System.out.println("Thread " + ID + " Start ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + ID + "Ends");
        }
        public Threads2(int ID){
            this.ID = ID;
        }
    }
    public static void main(String[] args) {
        Threads t1 = new Threads(1);
        Threads t2 = new Threads(2);
        Threads t3 = new Threads(3);
//        Thread a = new Thread(t1);
//        Thread b = new Thread(t2);
//        Thread c = new Thread(t3);
        t1.start();
        t2.start();
        t3.start();
        //Threads2 t1 = new Thread2(1);

    }
}

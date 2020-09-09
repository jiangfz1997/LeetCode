package Test;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;
abstract class test{
    int a;
    public abstract void tes();
}
public class TryCache extends test implements Runnable {
    @Override
    public void tes() {
        super.a = 1;
        System.out.println(a);
    }

    public static class system{
        public system(){
            System.out.println("system");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        test c = new TryCache();
        c.a = 2;
        System.out.println(c.a);
        // Thread s = new Thread(new TryCache());
        //Thread s2 = new Thread(new TryCache());
        //s.start();
        //s2.start();
    }

    @Override
    public void run() {
        try{
            System.out.println("start");
            //int a = 10/0;
            Thread.sleep(2000);

            System.out.println("end");
            return;

        }catch (InterruptedException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }finally{
            System.out.println("finally");
        }
    }
}

package diamond;

class mythread1 extends Thread{
    public void run()
    {
        int i=1000;
        while(i>0)
        {
            System.out.println("I am thread1...");
            i--;
        }
    }
}

class mythread2 extends Thread{
    public void run()
    {
        int i=1000;
        while(i>0)
        {
            System.out.println("I am thread2...");
            i--;
        }
    }
}

public class creating_threads_extendingthreadclass{
    public static void main(String[] args){
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}
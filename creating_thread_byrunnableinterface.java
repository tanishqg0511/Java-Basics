package diamond;

class mythrrunnable1 implements Runnable{
    public void run(){
        int i=1000;
        while(i>0){
            System.out.println("I am a thread1");
            i--;
        }
    }
}

class mythrrunnable2 implements Runnable{
    public void run(){
        int i=1000;
        while(i>0){
            System.out.println("I am a thread2");
            i--;
        }
    }
}

public class creating_thread_byrunnableinterface{
    public static void main(String[] args)
    {
        mythrrunnable1 bullet1=new mythrrunnable1();
        Thread gun1=new Thread(bullet1);

        mythrrunnable2 bullet2=new mythrrunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
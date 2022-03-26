package diamond;

class mythre extends Thread
{
    mythre(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<10000){
        System.out.println("I am "+ this.getName());
        i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args)
    {
        mythre t1=new mythre("tanishq01");
        mythre t2=new mythre("tanishq02");
        mythre t3=new mythre("tanishq03");
        mythre t4=new mythre("tanishq04");
        mythre t5=new mythre("tanishq05");
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

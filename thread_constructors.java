package diamond;
class mythr extends Thread
{
    mythr(String name){
        super(name);
    }
    public void run()
    {
        System.out.println("thank you");
    }
}
public class thread_constructors{
    public static void main(String[] args)
    {
        mythr t=new mythr("tanishq");
        t.start();
        System.out.println("the id of thread is "+t.getId());
        System.out.println("the name os thread is "+t.getName());
    }
}
package diamond;

public class finally_block {
    public static int divide() {
        try{
            int a=10,b=0;
            return a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // basically finally block will run even if there is no exception in the program 
        finally{
            System.out.println("coming out of func()");
        }
        return 0;
    }    
    public static void main(String[] args)
    {
        divide();
    }
}

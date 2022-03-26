package diamond;
import java.util.Scanner;
class myexception extends Exception{
    public String toString()
    {
        return super.toString()+" I am toString()...";
    }
    public String getMessage()
    {
        return super.getMessage()+" I am getMessage()...";
    }
}
public class exception_class {
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9)
        {
            try{
                throw new myexception();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}

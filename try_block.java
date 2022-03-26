package diamond;
import java.util.Scanner;
public class try_block {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println("After dividing -> "+ a/b);
        }
        catch(Exception e){
            System.out.println("Unable to execute because "+ e);
        }
    }
}

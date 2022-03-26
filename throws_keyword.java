package diamond;
import java.util.Scanner;

class NegativeRadiusException extends Exception{
    public String toString()
    {
        return "Radius cannot be negative";
    }
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}

public class throws_keyword {
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static double area(int r) throws NegativeRadiusException {
        if(r<0)
            throw new NegativeRadiusException();
        return Math.PI*r*r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter a radius");
        int r=sc.nextInt();
        try{
            System.out.println("division->"+divide(a, b));
            System.out.println("area->"+area(r));
        }
        catch(Exception e){
            System.out.println("Exception!");
        }
    }    
}

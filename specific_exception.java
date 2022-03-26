package diamond;
import java.util.Scanner;
 public class specific_exception{
     public static void main(String[] args)
     {
         int [] marks= new int[3];
         marks[0]=9;
         marks[1]=15;
         marks[2]=60;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter index of array");
         int ind=sc.nextInt();
         System.out.println("enter a number with which you want ot divide the number");
         int d= sc.nextInt();
         try{
             System.out.println("the value of index entered "+ ind);
             System.out.println("the value after dividing ->"+marks[ind]/d);
         }
         catch(ArithmeticException e)
         {
             System.out.println("ArithematicException Occured!");
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println("ArrayIndexOutOfBoundsException Occured!");
         }
         catch(Exception e)
         {
             System.out.println("Some other Exception occured!");
         }
     }
 }
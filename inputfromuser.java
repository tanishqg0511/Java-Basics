package diamond;

import java.util.Scanner;

public class inputfromuser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter  no.");
        int a = s.nextInt();
        System.out.println("enter a no.");
        int b = s.nextInt();
        int sum = a + b;
        System.out.print("sum is :");
        System.out.print(sum);
        s.close();
    }
}

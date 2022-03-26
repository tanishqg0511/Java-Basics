package diamond;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice \n");
        System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
        int c = sc.nextInt();
        // this is advanced representation of switch case in java , we can also use
        // normal c/c++ representation as well
        switch (c) {
            case 1 -> System.out.println("successfully pushed");
            case 2 -> System.out.println("successfully poped");
            case 3 -> System.out.println("successfully peeked");
            case 4 -> System.out.println("successfully displayed");
            default -> System.out.println("thank you");
        }
        sc.close();
    }
}

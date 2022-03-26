package diamond;
import java.util.ArrayDeque;
public class arraydeque {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(31);
        ad1.add(15);
        ad1.addFirst(2);
        ad1.addLast(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
        System.out.println(ad1.pop());
    }
}

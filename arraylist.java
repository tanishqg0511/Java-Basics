package diamond;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(2);
        l1.add(0);
        l1.add(7);
        l1.add(4);
        l1.add(0,6);
        l1.add(5);
        l2.add(23);
        l2.add(84);
        l2.add(51);
        l2.add(95);
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i)+",");
        l1.addAll(l2);
        // l1.clear();//removes all elements from list
        System.out.println("\n"+l1.contains(3));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(6));
        l1.set(0, 420);
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i)+",");
    }
}

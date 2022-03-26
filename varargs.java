package diamond;

public class varargs {
    static int sum(int... arr) {
        int res = 0;
        for (int a : arr)
            res += a;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("sum :" + sum(2, 1, 3));
        System.out.println("sum :" + sum(2, 1, 5, 2));
        System.out.println("sum :" + sum(2, 0, 6));
        System.out.println("sum :" + sum(27, 20, 10, 6));
    }
}

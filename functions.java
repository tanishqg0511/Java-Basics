package diamond;

public class functions {
    static int add(int a, int b) {
        return a + b;
    }

    int diff(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = add(a, b);
        System.out.println(c);
        int x = 4;
        int y = 3;
        functions obj = new functions();
        int z = obj.diff(x, y);
        System.out.println(z);
    }
}

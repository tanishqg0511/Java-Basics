package diamond;

public class interfacess {
    public static void main(String[] args) {
        avon a = new avon();
        a.applybrakes();
        a.speedup();
        System.out.println(a.a);
    }
}

interface Bicycle {
    int a = 25;

    // these values cannot be changed once made
    void applybrakes();

    void speedup();
}

class avon implements Bicycle {
    // all interface methods should be public strictly
    public void applybrakes() {
        System.out.println("applying brakes");
    }

    public void speedup() {
        System.out.println("speeding up");
    }
}


package diamond;

public class abstractclass {
    public static void main(String[] args) {
        child c = new child();
        c.greet();
    }
}

abstract class parent {
    abstract void greet();

    public void saythank() {
        System.out.println("thank you");
    }
}

class child extends parent {
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}


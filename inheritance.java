package diamond;

public class inheritance {
    public static void main(String[] args) {
        subclass s = new subclass(1, 2, 4);
    }
}

class base {
    base() {
        System.out.println("constructor of base class");
    }

    base(int a) {
        System.out.println("parameterized constructor of base class with value of a:" + a);
    }
}

class child1 extends base {
    child1() {
        System.out.println("constructor of child class");
    }

    child1(int a, int b) {
        super(a);
        System.out.println("parameterized constructor of child class with value of b:" + b);
    }
}

class subclass extends child1 {
    subclass() {
        System.out.println("constructor of sub class");
    }

    subclass(int a, int b, int c) {
        super(a, b);
        System.out.println("parameterized constructor of sub child class with value of c :" + c);
    }
}


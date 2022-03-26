package diamond;

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.time();
        obj.on();
    }
}
class phone {
    void time() {
        System.out.println("the time is 10 am");
    }

    void on() {
        System.out.println("turning phone on...");
    }
}

class smartphone extends phone {
    void music() {
        System.out.println("playing music");
    }

    void on() {
        System.out.println("turning smartphone on...");
    }
}



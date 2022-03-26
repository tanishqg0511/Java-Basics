package diamond;

// only one public class can exist in one java program
public class custom_class {
    public static void main(String[] args) {
        employee e = new employee();
        e.get(12, "rohan");
        e.display();
    }
}

class employee {
    int id;
    String name;

    void get(int i, String s) {
        id = i;
        name = s;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}



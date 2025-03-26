class BaseClass {
    int value = 10;

    BaseClass(String msg) {
        System.out.println("Message from BaseClass: " + msg);
    }

    void display() {
        System.out.println("Display function from BaseClass");
    }
}

class ChildClass extends BaseClass {
    ChildClass() {
        super("Calling from ChildClass");
        System.out.println("Value from BaseClass: " + super.value);
        super.display();
    }
}

public class SuperKey {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
    }
}

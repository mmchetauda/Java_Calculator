class ParentClass {
    void display() {
        System.out.println("Calling ParentClass::display()");
    }
}

class BaseClass extends ParentClass {

    void display() {
        System.out.println("Calling BaseClass::display()");
    }
}

public class Overriding {
    public static void main(String[] args) {
        ParentClass p1 = new ParentClass();
        BaseClass b1 = new BaseClass();
        p1.display();
        b1.display();
    }
}

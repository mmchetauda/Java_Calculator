public class Inheritance {

    public static class MMC{
        public void info() {
            System.out.println("Inside MMC");
        }
    }

    public static class Student extends MMC {
        public void detail() {
            System.out.println("Student details");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.info();
        s1.detail();
    }
}

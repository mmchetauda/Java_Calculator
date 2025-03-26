public class Student {
    int sid;
    String sname;

    // default constructor
    public Student(){
        sid = 0;
        sname = "undefined";
    }

    // parameterized constructor
    public Student(int id, String name){
        sid = id;
        sname = name;
    }

    public void getInfo(){
        System.out.printf("%d %s\n", sid, sname);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Bishal Baniya");
        s1.getInfo();
        s1 = null;
        System.gc();
        System.out.println("Object released");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructor is invoked automatically at the time of object creation.
    }
}
class Student {
    String name;
    int rollNo;
    Student() {
        System.out.println("Constructor is Called.....");
    }
}
public class typesOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anubhav");
        Student s3 = new Student(123);
    }
}
class Student {
    String name;
    int rollNo;
    Student() { // NON-PARAMETERIZED CONSTRUCTOR
        System.out.println("Constructor is called....");
    }
    Student(String name) {
        this.name = name;
    }                               // PARAMETERIZED CONSTRUCTOR
    Student(int rollNo) {
        this.rollNo = rollNo;
    }
}
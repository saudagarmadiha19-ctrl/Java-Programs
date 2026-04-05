/*
Mini Project: Simple Student Record System
This program stores and displays student names.
*/

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student Name: " + name);
    }
}
class StudentRecord {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit");
        Student s3 = new Student("Neha");
        // Displaying student details
        s1.display();
        s2.display();
        s3.display();
    }
}

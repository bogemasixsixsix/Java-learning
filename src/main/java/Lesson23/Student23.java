package main.java.Lesson23;

public class Student23 {
    String name;
    int age;
    double grade;
    String university;

    public Student23() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
        this.university = "Empty";
    }

    public Student23(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
        this.university = "Empty";
    }

    public Student23(String name, int age, double grade, String university) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.university = university;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + university + "\n");
    }
}
package main.java.Lesson26;

public class Student26 {
    private String name;
    private int age;
    private double grade;

    public Student26(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override 
    public String toString() {
        return "Student {name = '" + name + "', age = '" + age + "', grade = '" + grade + "'}";
    }
}

package main.java.Lesson27;

public class Student27 implements Cloneable {
    private String name;
    private int age;
    private double grade;

    public Student27(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Student27 clone() {
        try {
            return (Student27) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student name = '" + name + "', age = " + age + ", grade = " + grade + "}";
     }
}

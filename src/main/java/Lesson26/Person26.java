package main.java.Lesson26;

public class Person26 {
    private String name;
    private int age;

    public Person26 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
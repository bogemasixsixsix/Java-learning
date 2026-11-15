package main.java.Lesson22;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void displayinfo() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Profession is: " + profession);
    }

    public void introduce() {
        System.out.println("Hello, my name is: " + name);
    }
}

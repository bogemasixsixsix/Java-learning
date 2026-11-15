package main.java.Lesson23;

public class Task23_2 {
    public static void main(String[] args) {
        Student23 Sanya = new Student23();
        Student23 Tamazik = new Student23("Tamazik", 27);
        Student23 Anya = new Student23("Anya", 26, 4.5, "OGU");

        Sanya.displayInfo();
        Tamazik.displayInfo();
        Anya.displayInfo();
    }
}
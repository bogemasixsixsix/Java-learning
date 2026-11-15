package main.java.Lesson28;

public class Task28_3 {
    public static void main(String[] args) {
        Animal28_3[] animals = {
            new Cat28_3("Spicy", "Dot colour"),
            new Dog28_3("Woofy", "Short tail"),
            new Dog28_3("Sarah", "Loves to shakes her tail"),
            new Cat28_3("Pokito", "Lazy ass")
        };

        for (Animal28_3 animal : animals) {
            animal.makeSound();
            animal.sleep();
        }
    }
}
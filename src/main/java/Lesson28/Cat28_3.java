package main.java.Lesson28;

public class Cat28_3 extends Animal28_3 {
    
    public Cat28_3(String name, String species) {
        super(name, species);
    }

    @Override 
    public void makeSound() {
        System.out.println(name + " makes meow");
    }
}

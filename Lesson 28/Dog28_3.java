public class Dog28_3 extends Animal28_3 {
    
    public Dog28_3(String name, String species) {
        super(name, species);
    }

    @Override 
    public void makeSound() {
        System.out.println(name + " makes woof");
    }
}

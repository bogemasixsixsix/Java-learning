abstract class Animal28_3 {
    protected String name;
    protected String species;

    public Animal28_3(String name, String species) {
        this.name = name;
        this.species = species;
    }

    abstract void makeSound();

    public void sleep() {
        System.out.println(name + " now sleeps \n");
    }
}

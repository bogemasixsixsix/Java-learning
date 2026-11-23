package main.java.Lesson31;

public class App31 {
    public static void main(String[] args) {
        // Создаём объект Person (наша модель данных)
        Person31 bob = new Person31("Bob", 25);

        // Создаём greeter и говорим hello
        Greeter31 greeter = new Greeter31();
        greeter.sayHello(bob);
    }
}
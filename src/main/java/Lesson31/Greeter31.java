package main.java.Lesson31;

// Вспомогательный класс с методом, использующим Person
public class Greeter31 {
    public void sayHello(Person31 p) {
        // String.format более читаемый, но printf тоже работает
        System.out.printf("Привет, %s! Тебе %d лет.%n", p.getName(), p.getAge());
    }
}
package main.java.Lesson31;

public class Person31 {
    private final String name;   // поля: только чтение (final)
    private final int age;

    public Person31(String name, int age) {  // конструктор
        this.name = name;
        this.age  = age;
    }

    // Геттеры – публичные методы доступа к полям
    public String getName() { return name; }
    public int    getAge()  { return age;  }
}
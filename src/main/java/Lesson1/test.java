package main.java.Lesson1;

public class test {                     // 1. Объявляем класс, имя файла должно совпадать с именем класса
    public static void main(String[] args) { // 2. Точка входа программы
        int age = 30;                   // 3. Переменная типа int
        double weight = 70.5;           // 4. Переменная типа double (число с плавающей точкой)
        boolean isAdult = true;        // 5. Логическая переменная
        String name = "Alice";         // 6. Строка

        // Выводим значения переменных в консоль
        System.out.println("Name: " + name);
        System.out.print("Age: ");      // print() без перехода на новую строку
        System.out.println(age);       // println() завершает строку переводом строки
        System.out.println("Weight: " + weight);
        System.out.println("Is adult? " + isAdult);
    }
}
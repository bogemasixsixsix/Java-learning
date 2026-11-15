package main.java.Lesson24;

public class Person24 {
    // Приватные поля (доступны только внутри класса)
    private String name;
    private int age;
    private String email;
    public int penis;
    
    // Публичное поле
    public String nationality;
    
    // Конструктор
    public Person24(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.nationality = "Россия";
    }
    
    // Геттеры (методы для получения значений)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Сеттеры (методы для изменения значений с проверкой)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
    
    // Метод для отображения информации
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Email: " + email);
        System.out.println("Национальность: " + nationality + "\n");
    }
}

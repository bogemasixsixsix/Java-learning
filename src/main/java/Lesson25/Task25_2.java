package main.java.Lesson25;

public class Task25_2 {
    public static void main(String[] args) {
        Person25 Sanya = new Person25("Sanya", 27);
        Sanya.displayInfo();

        Sanya.setAge(28);
        Sanya.setName("Tamazik");
        Sanya.setisStudent("No");
        Sanya.displayInfo();

        Sanya.setAge(33);
        Sanya.setName("Vitaly");
        Sanya.setisStudent("Yes");
        Sanya.displayInfo();

        Sanya.setisStudent("What?"); //Специально допущенная ошибка чтоб вызвать error
        Sanya.setAge(-28); //Специально допущенная ошибка чтоб вызвать error
        Sanya.displayInfo();
    }
}
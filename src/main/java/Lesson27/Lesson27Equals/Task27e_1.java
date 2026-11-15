package main.java.Lesson27.Lesson27Equals;

public class Task27e_1 {
    public static void main(String[] args) {
        Person27e sanya = new Person27e("Sanya", 28);
        Person27e tamazik = sanya.clone();
        System.out.println(sanya.equals(tamazik));

        tamazik.setAge(21);
        System.out.println(sanya.equals(tamazik));

        System.out.println(sanya.equals(null));

        System.out.println(sanya.equals(sanya));
    }
}
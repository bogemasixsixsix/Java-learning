public class Basemain27 {
    public static void main(String[] args) {
        // Создаем объект
        Basestudent27 student1 = new Basestudent27("Алиса", 25, 4.8);

        // Ссылка на тот же объект (НЕ копия!)
        Basestudent27 student2 = student1;

        System.out.println(student1);  // Student{name='Алиса', age=25, grade=4.8}
        System.out.println(student2);  // Student{name='Алиса', age=25, grade=4.8}

        // Изменяем через одну ссылку
        student2.setAge(26);

        System.out.println(student1);  // Student{name='Алиса', age=26, grade=4.8}
        System.out.println(student2);  // Student{name='Алиса', age=26, grade=4.8}

        // Это потому что они ссылаются на один и тот же объект!
    }
}

public class Basestudent27 {
    private String name;
    private int age;
    private double grade;

    public Basestudent27(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Геттеры - методы для получения значений
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGrade() {
        return grade;
    }

    // Сеттеры - методы для изменения значений
    public void setAge(int age) {
        this.age = age;
    }

    @Override 
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}

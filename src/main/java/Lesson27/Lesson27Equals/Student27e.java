package main.java.Lesson27.Lesson27Equals;

public class Student27e implements Cloneable {
    private String name;
    private int grade;

    public Student27e(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public Student27e clone() {
        try {
            return (Student27e) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person {Name = '" + name + "', grade = " + grade + "}";
    }

    public boolean equals(Object obj) {
    // если объект ТОТ объект (obj) равен null - возвращаем false
        if (obj == null) {
            return false;
        }
    // если ЭТОТ объект (this) и ТОТ объект (that) одинаковые - возвращаем true
        if (this == obj) {
            return true;
        }
    // если ТОТ объект (obj) НЕ является экземпляром класса с которым сравниваем - возвращаем false
        if (!(obj instanceof Student27e)) {
            return false;
        }
    // приводим ТОТ объект (obj) к типу объекта с которым сравниваем и называем его that
        Student27e that = (Student27e) obj;
    // если ЭТО поле равно ТОМ полю - возвращаем тру 
        if (this.name.equals(that.name)) {
            if (this.grade == that.grade) {
                return true;
            }
        }
        return false;
    }
}
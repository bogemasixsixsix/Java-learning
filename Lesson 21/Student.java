public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    public void displayInfo() {
        System.out.println("Stud name is: " + name);
        System.out.println("Stud age is: " + age);
        System.out.println("Stud grade is: " + grade);
        System.out.println();
    }
}

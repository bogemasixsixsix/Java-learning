public class Person25 {
    private String name;
    private int age;
    private String isStudent;

    public Person25(String name, int age) {
        this.name = name;
        this.age = age;
        this.isStudent = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getisStudent() {
        return isStudent;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    
    public void setisStudent(String isStudent) {
        if ("Yes".equals(isStudent) || "No".equals(isStudent))
        this.isStudent = isStudent;
        else {
            System.out.println("Student field may accept only Yes or No values");
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("Age field may accept only positive values");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is student: " + isStudent + "\n");
    }
}

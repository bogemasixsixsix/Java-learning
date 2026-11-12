public class Person27e implements Cloneable {
    private String name;
    private int age;

    public Person27e(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person27e clone() {
        try {
            return (Person27e) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person {Name = '" + name + "', age = " + age + "}";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person27e)) {
            return false;
        }
        Person27e that = (Person27e) obj;
        if (this.name.equals(that.name)) {
            if (this.age == that.age) {
                return true;
            }
        }
        return false;
    }
}
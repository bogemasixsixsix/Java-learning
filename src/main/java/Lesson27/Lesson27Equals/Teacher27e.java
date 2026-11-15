package main.java.Lesson27.Lesson27Equals;

public class Teacher27e implements Cloneable {
    private String name;
    private String subject;

    public Teacher27e(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public Teacher27e clone() {
        try {
            return (Teacher27e) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person {Name = '" + name + "', subject = " + subject + "}";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Teacher27e)) {
            return false;
        }
        Teacher27e that = (Teacher27e) obj;
        if (this.name.equals(that.name)) {
            if (this.subject.equals(that.subject)) {
                return true;
            }
        }
        return false;
    }
}
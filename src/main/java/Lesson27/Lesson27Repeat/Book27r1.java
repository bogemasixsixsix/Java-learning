package main.java.Lesson27.Lesson27Repeat;
import java.util.Objects;

public class Book27r1 implements Cloneable{
    private String title;
    private String author;
    private int pages;
    
    public Book27r1(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book27r1 clone() {
        try {
            return (Book27r1) super.clone();
        } catch ( CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override 
    public String toString() {
        return "Book {Title = '" + title + "', author = '" + author + "', pages: " + pages + "}";
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        
        Book27r1 that = (Book27r1) obj;
        return pages == that.pages &&
            Objects.equals(title, that.title) &&
            Objects.equals(author, that.author);
    }
}
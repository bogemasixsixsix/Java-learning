package main.java.Lesson26;

public class Task26_1_improved {
    public static void main(String[] args) {
        Book26[] cyberBooks = {
            new Book26("Cyberpunk-2011", "Ash", 2011),
            new Book26("Cyberpunk-2036", "Tervort", 2036),
            new Book26("Cyberpunk-2067", "Jessie", 2067),
        };

        for (Book26 book : cyberBooks) {
            System.out.println(book);
        }

        int num[] = {12, 122, 233, 5262};
        for (int sperma : num) {
            System.out.println(sperma);
        }
    }
}

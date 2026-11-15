public class Task27r1 {
    public static void main(String[] args) {
        Book27r1 book1 = new Book27r1("Cyberpunk 2077", "Emily", 2077);
        Book27r1 book2 = book1.clone();
        Book27r2 book3 = new Book27r2("Cyberpunk 2061", "Johnny");
        System.out.println("Equalizing after cloning, before changing:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println("Is book 1 and book 2 equals?: " + book1.equals(book2) + "\n");

        System.out.println("Equalizing after changing:");
        book2.setPages(2067);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println("Is book 1 and book 2 equals?: " + book1.equals(book2) + "\n");

        System.out.println("Null and self-equal tests:");
        System.out.println("Is book 1 equals null?: " + book1.equals(null));
        System.out.println("Is book 1 equals book 1?: " + book1.equals(book1) + "\n");
        
        System.out.println("Equalizing with other class-object:");
        System.out.println("Is book 1 equals book 3?: " + book1.equals(book3));
    }
}
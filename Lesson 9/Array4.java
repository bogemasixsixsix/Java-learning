public class Array4 {
    public static void main (String [] arg) {
        String base = "Programming is fun";

        String part1 = base.substring(12, 14);
        System.out.println(part1);

        int part2 = base.indexOf("fun");
        System.out.println("Index of 'fun' is: " + part2);

        String part3 = base.toUpperCase();
        System.out.println(part3);
    }
}

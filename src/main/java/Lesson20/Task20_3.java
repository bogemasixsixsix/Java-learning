package main.java.Lesson20;

public class Task20_3 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Check", "Bob", "Lol", "Chec", "Che", "Chck"};
        String searchName = "Check";

        int[] positions = new int[names.length];
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                positions[count] = i;
                count++;   
            }
        }
        if (count > 0) {
            System.out.println("The '" + searchName + "' found " + count + " times");
        } else {
            System.out.println("The '" + searchName + "' found " + count + " times");
        }
    }
}

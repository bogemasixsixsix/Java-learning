package main.java.Lesson19;

public class Task19_2 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String searchName = "Bob";
        boolean isFound = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                isFound = true;
                System.out.println("The " + searchName + " is found in the array");
                break;
            }
        }
        if (!isFound) {
            System.out.println("The " + searchName + " is not found in the array");
        }
    }
}

package main.java.Lesson17;

public class Task17_4 {
    public static void main(String[] args) {
        String[] words = {"Test", "xd", "lol", "Java"};
        boolean yesornot = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i] == "Java") {
                yesornot = true;
            }
        }
        System.out.println("Does this massive has Java?:" + yesornot);
    }
}
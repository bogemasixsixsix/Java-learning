public class Task17_7 {
    public static void main(String[] args) {
        String[] words = {"Spa", "Test", "Java", "Lol", "Text"};
        int position = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Java")) {
                position += i;
            }
        }
        System.out.println("The Java word position is: " + position);
    }
}
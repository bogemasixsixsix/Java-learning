public class Task13_1 {
    public static void printMessage(String text) {
        System.out.println(text);
    }
    
    public static void printMessage(String text, int count) {
        System.out.println(text.repeat(count));
    }


    public static void main(String[] args) {
        printMessage("Salut");
        printMessage("Sup", 3);
    }
}
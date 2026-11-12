public class Task18_5 {
    public static void main(String[] args) {
        String[] words = {"Xd", "JavaScript", "Testlol", "Lol", "XDLOOL"};
        int fourLettersAndMore = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                fourLettersAndMore++;
            }
        }
        System.out.println("The words in array with more than four symbols is: " + fourLettersAndMore);
    }
}

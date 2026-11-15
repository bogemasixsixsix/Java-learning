public class Task26_1 {
    public static void main(String[] args) {
        Book26 Cyberpunk = new Book26("Cyberpunk", "Ashley", 2077);

        System.out.println(Cyberpunk);

        Book26 Cyberarray[] = new Book26[3];
        Cyberarray[0] = new Book26("Cybperunk 2022", "Trevor", 2022);
        Cyberarray[1] = new Book26("Cybperunk 2044", "William", 2044);
        Cyberarray[2] = new Book26("Cybperunk 2066", "V", 2066);

        for (int i = 0; i < Cyberarray.length; i++) {
            System.out.println(Cyberarray[i]);
        }
    }
}

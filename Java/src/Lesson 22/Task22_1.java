public class Task22_1 {
    public static void main(String[] args) {
        Person Sanya = new Person("Sanya", 28, "MFC");
        Person Tamazik = new Person("Tamazik", 27, "Sosalka");

        Sanya.introduce();
        Sanya.displayinfo();
        System.out.println();
        Tamazik.introduce();
        Tamazik.displayinfo();
    }
}

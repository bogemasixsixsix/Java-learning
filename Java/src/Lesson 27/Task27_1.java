public class Task27_1 {
    public static void main(String[] args) {
        Student27 Sanya = new Student27("Sanya", 27, 3.8);

        Student27 Sanya2 = Sanya;

        System.out.println(Sanya);
        System.out.println(Sanya2);

        Sanya2.setAge(28);

        System.out.println(Sanya);
        System.out.println(Sanya2);
    }
}

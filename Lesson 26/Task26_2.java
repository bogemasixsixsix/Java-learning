public class Task26_2 {
    public static void main(String[] args) {
        Student26[] Students = {
            new Student26("Sanya", 27, 3.8),
            new Student26("Tamazik", 26, 4.1),
            new Student26("Rafik", 25, 3.4),
        };

        for (Student26 stuck : Students) {
            System.out.println(stuck);
        }
    }
}
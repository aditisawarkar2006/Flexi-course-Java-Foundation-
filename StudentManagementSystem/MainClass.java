public class MainClass {

    public static void main(String[] args) {

        GraduateStudent g1 = new GraduateStudent();

        g1.setPerson("Aditi", 19);
        g1.setStudent(103, 89.5);
        g1.setGraduateStudent("Computer Science");

        System.out.println("----- Student Details -----");

        g1.displayPerson();
        g1.displayStudent();
        g1.displayGraduateStudent();
    }
}

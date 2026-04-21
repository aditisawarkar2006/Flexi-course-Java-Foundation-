public class Student extends Person {

    protected int rollNo;
    protected double marks;

    public void setStudent(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

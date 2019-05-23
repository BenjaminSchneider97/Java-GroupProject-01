import java.util.ArrayList;

public class Abstinence {

    Students student;
    String date;

    public Abstinence(Students student, String date) {
        this.student = student;
        this.date = date;
    }

    public void printAbstinence(Students student) {
        System.out.println("The student: " + student.getStudentFirstName() + " " + student.getStudentLastName() + " was missing class on " + this.date);
    }

    public void printTotalAbstinence(ArrayList<Abstinence> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("The student: " + students.get(i).student.getStudentFirstName() + " " + students.get(i).student.getStudentLastName() + " from the class " + students.get(i).student.getClassName1().getClassName() + " was missing class on " + students.get(i).date);
        }
    }
}

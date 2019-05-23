import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    private String studentFirstName;
    private String studentLastName;
    private String parentName;
    private Class className;
    private int points;

    public Students(String studentFirstName, String studentLastName, String parentName, Class className) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.parentName = parentName;
        this.className = className;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Class getClassName() {
        return className;
    }

    public void setClassName(Class className) {
        this.className = className;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String calcGrade(int points){

        String grade = "";

        if (points > 90) {
            grade = "A";
        } else if (points > 80) {
            grade = "B";
        } else if (points > 70) {
            grade = "C";
        } else if (points > 60) {
            grade = "D";
        } else if (points >= 50) {
            grade = "E";
        } else if (points < 50) {
            grade = "F";
        }

        return  grade;
    }

    public String inputPoints(Students student, ArrayList<Subjects> allSubjects){
        String result = "";
        Scanner input = new Scanner(System.in);
        int totalpoints = 0;

        for(Subjects subject : allSubjects){
            System.out.println("Enter the points for the subject \"" + subject.getSubjectName() + "\" for " + student.studentFirstName + " " + student.getStudentLastName().substring(0, 1) + ".:");
            int a = input.nextInt();
            totalpoints += a;
            result += student.getStudentFirstName() + " " + student.getStudentLastName().toUpperCase() + "'s" + " final grade in \"" + subject.getSubjectName() + "\": " + calcGrade(a) + "\n";
        }
        int average = totalpoints/allSubjects.size();
        String averageGrade = calcGrade(average);
        String averageString = "Total Points = " + totalpoints + ", the average points are: " + average + " which is a(n) " + averageGrade ;

        return "SEMESTER REPORT FOR " + student.getStudentFirstName().toUpperCase() + " " + student.getStudentLastName().toUpperCase() + "\n"
                + "==========================================\n"
                + result + "\n" + averageString;
    }

    public String calcAverage(){
        String result = "";

        return  result;
    }
}

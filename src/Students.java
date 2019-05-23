import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    private String studentFirstName;
    private String studentLastName;
    private String parentName;
    private Class className1;
    private int points;

    public Students(String studentFirstName, String studentLastName, String parentName, Class className) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.parentName = parentName;
        this.className1 = className;
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

    public Class getClassName1() {
        return className1;
    }

    public void setClassName1(Class className) {
        this.className1 = className;
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

    public String inputPoints(Students student, ArrayList<Subjects> allSubjects, School school1){
        String result = "";
        String notice = "";
        String negativeSubjects = "";
        Scanner input = new Scanner(System.in);
        int totalpoints = 0;

        for(Subjects subject : allSubjects){
            System.out.println("Enter the points for the subject \"" + subject.getSubjectName() + "\" for " + student.studentFirstName + " " + student.getStudentLastName().substring(0, 1) + ".:");
            int a = input.nextInt();
            if (a < 50){
                negativeSubjects += subject.getSubjectName() + ", ";
                notice =
                        "\nDear " + student.parentName+ ", \n"+
                        "It is your fault, you lazy, miserable people, " + student.getParentName().toUpperCase()+ " why didn’t you spend your afternoons and weekends teaching your kid " + student.getStudentFirstName().toUpperCase() + " " + student.getStudentLastName().toUpperCase() +  " following subjects:\n"+
                        negativeSubjects + "where he has gotten an F? \nThat was YOUR job - we provided you with books and locked your kid for 6 hours a day, so you can earn money to spend it on the afternoon teachers. Why didn’t you do your job on time? \n" +
                        "Shame. Shame. Shame: oh, yeah, btw, here is a contact list of institutions and people that can provide you with extra help - maybe some of our fellow teachers works there, maybe not):\n" +
                        "In the name of your beloved First Elite School “" + school1.getSchoolName() + "”,\n"+
                        "\nSincerely Yours," +
                        "\nDr Dipl.Kfm. Max von und zu Mustermann,\n" +
                        "Director of School\n";
            }
            totalpoints += a;
            result += student.getStudentFirstName() + " " + student.getStudentLastName().toUpperCase() + "'s" + " final grade in \"" + subject.getSubjectName() + "\": " + calcGrade(a) + "\n";
        }
        int average = totalpoints/allSubjects.size();
        String averageGrade = calcGrade(average);
        String averageString = "Total Points = " + totalpoints + ", the average points are: " + average + " which is a(n) " + averageGrade ;
        return "SEMESTER REPORT FOR " + student.getStudentFirstName().toUpperCase() + " " + student.getStudentLastName().toUpperCase() + "\n"
                + "==========================================\n"
                + result + "\n" + averageString +
                "\n" + notice;
    }
}




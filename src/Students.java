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

        if (points >= 90) {
            grade = "A";
        } else if (points >= 80) {
            grade = "B";
        } else if (points >= 70) {
            grade = "C";
        } else if (points >= 60) {
            grade = "D";
        } else if (points >= 40) {
            grade = "E";
        } else if (points < 40) {
            grade = "F";
        }

        return  grade;
    }
}

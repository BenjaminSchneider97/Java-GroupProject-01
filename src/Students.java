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
}

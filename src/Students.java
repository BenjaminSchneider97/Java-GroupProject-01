public class Students {

    private String firstName;
    private String lastName;
    private String parentName;
    private Class className;
    private int points;

    public Students(String firstName, String lastName, String parentName, Class className){
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentName = parentName;
        this.className = className;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getParentName() {
        return this.parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

import java.util.ArrayList;

public class Class {

    private String className;
    private ArrayList<Subjects> subjects;
    private Schedules schedules;

    public Class(String className, ArrayList<Subjects> subjects, Schedules schedules) {
        this.className = className;
        this.subjects = subjects;
        this.schedules = schedules;
    }

    // Getter
    public String getClassName() {
        return className;
    }

    // Setter
    public void setClassName(String className) {
        this.className = className;
    }
}

import java.util.ArrayList;

public class Class {

    private String className;
    private ArrayList<Subjects> subjects;

    public Class(String className, ArrayList<Subjects> subjects) {
        this.className = className;
        this.subjects = subjects;
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

import java.util.ArrayList;

public class Class {

    private String className;
    private Schedules schedules;

    public Class(String className, Schedules schedules) {
        this.className = className;
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

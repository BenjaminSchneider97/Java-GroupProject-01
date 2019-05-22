import java.util.ArrayList;

public class Homework {

    private ArrayList<Subjects> subjects;

    public Homework(ArrayList<Subjects> subjects) {

        this.subjects = subjects;
    }

    // Getter
    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    // Setter
    public void setSubjects(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }
}

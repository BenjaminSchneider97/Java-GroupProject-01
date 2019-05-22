import java.util.ArrayList;

public class Homework {

    private ArrayList<Subjects> subjects;
    private ArrayList<Schedules> schedule;

    public Homework(ArrayList<Subjects> subjects, ArrayList<Schedules> schedule) {

        this.subjects = subjects;
        this.schedule = schedule;
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

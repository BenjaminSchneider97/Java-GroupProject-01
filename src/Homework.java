import java.util.ArrayList;

public class Homework {

    private Subjects subject;
    private Schedules schedule;

    public Homework(Subjects subject, Schedules schedule) {

        this.subject = subject;
        this.schedule = schedule;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Schedules getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedules schedule) {
        this.schedule = schedule;
    }
}

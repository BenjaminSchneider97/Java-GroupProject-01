public class Homework {

    private String homeworkDescription;
    private Subjects subject;
    private Schedules schedule;

    public Homework(String homeworkDescription, Subjects subject, Schedules schedule) {
        this.homeworkDescription = homeworkDescription;
        this.subject = subject;
        this.schedule = schedule;
    }

    public String getHomeworkDescription() {
        return homeworkDescription;
    }

    public void setHomeworkDescription(String homeworkDescription) {
        this.homeworkDescription = homeworkDescription;
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

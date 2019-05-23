public class Homework {

    private String homeworkDescription;
    private Subjects subject;
    private HomeworkSchedule schedule;

    public Homework(String homeworkDescription, Subjects subject, HomeworkSchedule schedule) {
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

    public HomeworkSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(HomeworkSchedule schedule) {
        this.schedule = schedule;
    }

    public void printHomeworkSchedule(Class class1, Subjects subject) {
        System.out.println("The homework for " + subject.getSubjectName() + " on the " + getSchedule().getStart() + " due to " + getSchedule().getEnd() + " is: " + homeworkDescription);
    }
}

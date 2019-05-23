public class Homework {

    private String homeworkDescription;
    private Subjects subject;
    private HomeworkSchedule schedule;
    private Class class1;

    public Homework(String homeworkDescription, Subjects subject, HomeworkSchedule schedule, Class class1) {
        this.homeworkDescription = homeworkDescription;
        this.subject = subject;
        this.schedule = schedule;
        this.class1 = class1;
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
        if(class)
        System.out.println("Class: " + this.getClass() + "\nThe homework for " + subject.getSubjectName() + " on the " + getSchedule().getStart() + " due to " + getSchedule().getEnd() + " is: " + "\n" + homeworkDescription);
    }
}

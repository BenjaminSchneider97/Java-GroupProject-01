import java.util.GregorianCalendar;

public class Schedules {
    private Subjects[][] subjects;

    public Schedules(Subjects[][] subjects) {
        this.subjects = subjects;
    }

    public void printSchedulePlan(Subjects[][] schedule) {
        System.out.println("Monday\t\tTuesday\t\tWednesday\tThursday\tFriday");
        System.out.println("-------------------------------------------------------------");
        for(int i = 0; i < schedule[i].length; i++){
            System.out.println(schedule[0][i].getSubjectName() + "\t\t" + schedule[1][i].getSubjectName() + "\t\t" + schedule[2][i].getSubjectName() + "\t\t" + schedule[3][i].getSubjectName() + "\t\t" + schedule[4][i].getSubjectName());
        }
    }
}

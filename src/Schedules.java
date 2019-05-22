import java.util.GregorianCalendar;

public class Schedules {
    private Subjects[][] subjects;

    public Schedules(Subjects[][] subjects) {
        this.subjects = subjects;
    }

    public void printSchedulePlan(Subjects[][] schedule) {
        System.out.println("Monday\t\tTuesday\t\tWednesday\tThursday\tFriday");
        System.out.println("-------------------------------------------------------------");
        System.out.println(schedule[0][0].getSubjectName() + "\t\t" + schedule[1][0].getSubjectName() + "\t\t" + schedule[2][0].getSubjectName() + "\t\t" + schedule[3][0].getSubjectName() + "\t\t" + schedule[4][0].getSubjectName());
        System.out.println(schedule[0][1].getSubjectName() + "\t\t" + schedule[1][1].getSubjectName() + "\t\t" + schedule[2][1].getSubjectName() + "\t\t" + schedule[3][1].getSubjectName() + "\t\t" + schedule[4][1].getSubjectName());
        System.out.println(schedule[0][2].getSubjectName() + "\t\t" + schedule[1][2].getSubjectName() + "\t\t" + schedule[2][2].getSubjectName() + "\t\t" + schedule[3][2].getSubjectName() + "\t\t" + schedule[4][2].getSubjectName());
        System.out.println(schedule[0][3].getSubjectName() + "\t\t" + schedule[1][3].getSubjectName() + "\t\t" + schedule[2][3].getSubjectName() + "\t\t" + schedule[3][3].getSubjectName() + "\t\t" + schedule[4][3].getSubjectName());
        System.out.println(schedule[0][4].getSubjectName() + "\t\t" + schedule[1][4].getSubjectName() + "\t\t" + schedule[2][4].getSubjectName() + "\t\t" + schedule[3][4].getSubjectName() + "\t\t" + schedule[4][4].getSubjectName());
    }

}

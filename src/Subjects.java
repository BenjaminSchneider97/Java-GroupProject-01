public class Subjects   {

    private String subjectName;

    public Subjects(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public void printSchedulePlan(Subjects[][] schedule) {
        System.out.println("Monday\tTuesday");
        System.out.println(schedule[0][0] + "\t" + schedule[1][0]);
    }
}


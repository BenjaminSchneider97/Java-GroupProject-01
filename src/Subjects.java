public class Subjects   {

    private String subjectName;
    private Schedules schedules;

    public Subjects(String subjectName, Schedules schedules){
        this.subjectName = subjectName;
        this.schedules = schedules;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
}


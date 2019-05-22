import java.util.ArrayList;

public class Teachers {

    private String teacherFirstName;
    private String teacherLastName;
    private ArrayList<Subjects> subjects;

    public Teachers(String teacherFirstName, String teacherLastName, ArrayList<Subjects> subjects){
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.subjects = subjects;
    }

    public String getTeacherFirstName(){
        return this.teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName){
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName(){
        return this.teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName){
        this.teacherLastName = teacherLastName;
    }

    public ArrayList<Subjects> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }

    public void printSubjects(Teachers teacher){
        System.out.println("Teacher: " + teacher.getTeacherFirstName() + " " + teacher.getTeacherLastName().toUpperCase());
        for (int i = 0; i < teacher.getSubjects().size(); i++){
            System.out.println(teacher.getSubjects().get(i).getSubjectName());
        }
    }
}

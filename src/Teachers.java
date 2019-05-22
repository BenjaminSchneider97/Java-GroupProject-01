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

}

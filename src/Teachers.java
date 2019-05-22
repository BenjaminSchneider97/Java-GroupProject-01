import java.util.ArrayList;

public class Teachers {

    private String tfname;
    private String tlname;
    private ArrayList<Subjects> subjects;

    public Teachers(String tfname, String tlname, ArrayList<Subjects> subjects){
        this.tfname = tfname;
        this.tlname = tlname;
        this.subjects = subjects;
    }

    public String getTfname(){
        return this.tfname;
    }

    public void setTfname(String tfname){
        this.tfname = tfname;
    }

    public String getTlname(){
        return this.tlname;
    }

    public void setTlname(String tlname){
        this.tlname = tlname;
    }

}

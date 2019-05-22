public class School {


    private String schoolName;
    private String schoolAddress;

    public School(String schoolName, String schoolAddress){
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolName(){
        return this.schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolAddress(){
        return this.schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress){
        this.schoolAddress = schoolAddress;
    }

}

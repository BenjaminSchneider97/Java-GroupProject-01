import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        // Subject objects
        Subjects math = new Subjects("Math");
        Subjects german = new Subjects("German");
        Subjects english = new Subjects("English");
        Subjects physics = new Subjects("Physics");
        Subjects it = new Subjects("Information Technology");

        // Array for subjects 1A
        ArrayList<Subjects> subjects_1a = new ArrayList<>();
        subjects_1a.add(math);
        subjects_1a.add(german);

        // Array for subjects 2A
        ArrayList<Subjects> subjects_2a = new ArrayList<>();
        subjects_2a.add(english);

        //Array for subjects 3A
        ArrayList<Subjects> subjects_3a = new ArrayList<>();
        subjects_3a.add(physics);
        subjects_3a.add(it);


        // Class objects
        Class a1 = new Class("1A", subjects_1a);
        Class a2 = new Class("2A",subjects_2a);
        Class a3 = new Class("3A", subjects_3a);

        // Student objects
        Students mark = new Students("Mark", "Forster", "Marry", a1);
        Students jenny = new Students("Jenny", "Tang", "Li-Hung", a2);
        Students benjamin = new Students("Benjamin", "Schneider", "Josef", a3);
        Students simon = new Students("Simon", "Blaha", "Fritz", a3);
        Students judith = new Students("Judith", "Lang", "McLove", a1);

        // Hash maps for subjects and points
        HashMap<String, Integer> subject_math = new HashMap<>();

        subject_math.put(mark.getStudentFirstName(), 60);
        subject_math.put(judith.getStudentFirstName(), 30);




        // Hash map for student final grade

        HashMap<String, String> grade_math = new HashMap<>();

        grade_math.put(mark.getStudentFirstName(), mark.c)




    }
}

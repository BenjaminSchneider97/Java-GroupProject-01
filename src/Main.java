import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Subject objects
        Subjects math = new Subjects("Math");
        Subjects german = new Subjects("German");
        Subjects english = new Subjects("English");
        Subjects physics = new Subjects("Physics");
        Subjects it = new Subjects("IT");
        Subjects biology = new Subjects("Biology");

        //Schedules
        Subjects[][] schedule1 = {
                {math, math, math, math, math},
                {english, biology, english, english, english},
                {german, german, biology, german, german},
                {physics, physics, physics, biology, physics},
                {biology, it, it, it, it}
        };

        Subjects[][] schedule2 = {
                {biology, math, it, german, english},
                {math, biology, it, english, german},
                {it, german, english, math, biology},
                {english, math, german, it, biology},
                {english, german, it, math, biology},
        };

        Subjects[][] schedule3 = {
                {math, biology, english, it, german},
                {math, biology, english, it, german},
                {math, biology, english, it, german},
                {math, biology, english, it, german},
                {math, biology, english, it, german},
        };

        Schedules scheduleA1 = new Schedules(schedule1);
        Schedules scheduleA2 = new Schedules(schedule2);
        Schedules scheduleA3 = new Schedules(schedule3);

        // Class objects
        Class a1 = new Class("1A", scheduleA1);
        Class a2 = new Class("2A", scheduleA2);
        Class a3 = new Class("3A", scheduleA3);

        // Student objects
        Students mark = new Students("Mark", "Forster", "Marry", a1);
        Students jenny = new Students("Jenny", "Tang", "Li-Hung", a2);
        Students benjamin = new Students("Benjamin", "Schneider", "Josef", a3);
        Students simon = new Students("Simon", "Blaha", "Fritz", a3);
        Students judith = new Students("Judith", "Lang", "McLove", a1);

        ArrayList<Subjects> teacher_bold_subjects = new ArrayList<>();
        teacher_bold_subjects.add(math);
        teacher_bold_subjects.add(german);

        ArrayList<Subjects> teacher_eichenberg_subjects = new ArrayList<>();
        teacher_eichenberg_subjects.add(biology);
        teacher_eichenberg_subjects.add(english);

        ArrayList<Subjects> teacher_bush_subjects = new ArrayList<>();
        teacher_bush_subjects.add(physics);
        teacher_bush_subjects.add(it);

        ArrayList<Subjects> teacher_trump_subjects = new ArrayList<>();
        teacher_trump_subjects.add(math);
        teacher_trump_subjects.add(it);

        ArrayList<Subjects> teacher_williams_subjects = new ArrayList<>();
        teacher_williams_subjects.add(math);
        teacher_williams_subjects.add(german);

        ArrayList<Subjects> teacher_warmhud_subjects = new ArrayList<>();
        teacher_warmhud_subjects.add(english);
        teacher_warmhud_subjects.add(biology);

        // Teacher objects
        Teachers bold = new Teachers("Garry", "Bold", teacher_bold_subjects );
        Teachers eichenberg = new Teachers("Till", "Eichenberg", teacher_eichenberg_subjects);
        Teachers bush = new Teachers("Mike", "Bush", teacher_bush_subjects);
        Teachers trump = new Teachers("Doofy", "Trump", teacher_trump_subjects);
        Teachers williams = new Teachers("Angela", "Williams", teacher_williams_subjects);
        Teachers warmhud = new Teachers("Gregor", "Warmhud", teacher_warmhud_subjects);

        // Hash map for grades
        HashMap<String, String> subject_math = new HashMap<>();

        subject_math.put(mark.getStudentFirstName(), mark.calcGrade(60));
        subject_math.put(judith.getStudentFirstName(), judith.calcGrade(30));
        subject_math.put(jenny.getStudentFirstName(), jenny.calcGrade(80));

        System.out.println("Subject: " + math.getSubjectName());
        System.out.println("-----------------");
        for(Map.Entry<String, String> entry : subject_math.entrySet()) {
            System.out.println("Student: " + entry.getKey() + "\t\tGrade: " + entry.getValue());
        }

        HashMap<String, Integer> subject_english = new HashMap<>();

        trump.printSubjects(bush);

        scheduleA1.printSchedulePlan(schedule1);
    }
}

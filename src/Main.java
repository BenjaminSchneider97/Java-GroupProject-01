import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        //School
        School school1 = new School("Best School in the World", "Schoolway 01");

        // Subject objects
        Subjects math = new Subjects("Math");
        Subjects german = new Subjects("German");
        Subjects english = new Subjects("English");
        Subjects physics = new Subjects("Physics");
        Subjects it = new Subjects("Info");
        Subjects biology = new Subjects("Biology");

        //Schedules
        Subjects[][] schedule1 = {
                {math, math, math, math, math, biology},
                {english, biology, english, math, english, english},
                {german, german, english, biology, german, german},
                {physics, physics, it, physics, biology, physics},
                {biology, it, it, it, it, physics}
        };

        Subjects[][] schedule2 = {
                {biology, math, it, german, english, physics},
                {math, biology, it, physics, english, german},
                {it, german, physics, english, math, biology},
                {english, math, german, it, biology, physics},
                {physics, english, german, it, math, biology},
        };

        Subjects[][] schedule3 = {
                {math, biology, english, it, german, physics},
                {math, biology, english, it, german, physics},
                {math, biology, english, it, german, physics},
                {math, biology, english, it, german, physics},
                {math, biology, english, it, german, physics},
        };

        Schedules scheduleA1 = new Schedules(schedule1);
        Schedules scheduleA2 = new Schedules(schedule2);
        Schedules scheduleA3 = new Schedules(schedule3);

        // Class objects
        Class a1 = new Class("1A", scheduleA1);
        Class a2 = new Class("2A", scheduleA2);
        Class a3 = new Class("3A", scheduleA3);

        // Homework schedule
        // HomeworkSchedule hschedule1 = new HomeworkSchedule("27.5.2019", "28.5.2019");

        // Homework objects
        Homework hw_1a = new Homework("Find a solution for calculating the area of the triangles", math, new HomeworkSchedule("26.5.2019", "27.5.2019"), a1);
        Homework hw_2a = new Homework("Sort the frogs by type", biology, new HomeworkSchedule("27.5.2019", "28.5.2019"), a2);

        // Save all subject objects into a array list
        ArrayList<Subjects> allSubjects = new ArrayList<>();
        allSubjects.add(math);
        allSubjects.add(german);
        allSubjects.add(english);
        allSubjects.add(physics);
        allSubjects.add(it);
        allSubjects.add(biology);


        // Student objects
        Students mark = new Students("Mark", "Forster", "Marry", a1);
        Students jenny = new Students("Jenny", "Tang", "Li-Hung", a2);
        Students benjamin = new Students("Benjamin", "Schneider", "Josef", a3);
        Students simon = new Students("Simon", "Blaha", "Fritz", a3);
        Students judith = new Students("Judith", "Lang", "McLove", a1);

        // Assign subjects to teachers
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
        
        //System.out.println(mark.inputPoints(mark, allSubjects));

        System.out.println(mark.inputPoints(mark, allSubjects, school1));

        //trump.printSubjects(bush);

        //scheduleA1.printSchedulePlan(schedule1);

        hw_1a.printHomeworkSchedule(a1, biology);
        hw_2a.printHomeworkSchedule(a2, biology);
    }
}

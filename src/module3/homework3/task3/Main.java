package module3.homework3.task3;

//        Create getters and setters for all fields and make fields private as OOP principle follows.
//        Create 5 objects Course class.
//        Create objects of others classes using every constructor.
//        You must have 13 objects in Solution class.

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Course courseProg = new Course(new Date(), "Programming");
        Course courseMath = new Course(150, "Math", "Dr. McFray");
        Course coursePhis = new Course(new Date(), "Physics");
        Course courseChem = new Course(80, "Chemistry", "Dr. Branch");
        Course courseHist = new Course(new Date(), "History");

        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("Edison", new Course[]{courseProg, coursePhis});

        CollegeStudent collStudent1 = new CollegeStudent("Emma", "Harrison", 4);
        CollegeStudent collStudent2 = new CollegeStudent("Jackson", new Course[] {courseMath,coursePhis});
        CollegeStudent collStudent3 = new CollegeStudent("Oxford", 2, 54_97_68_87_01L);

        SpecialStudent specStudent1 = new SpecialStudent("Tony", "Warren", 2);
        SpecialStudent specStudent2 = new SpecialStudent("Portman", new Course[]{courseHist, courseProg, courseChem});
        SpecialStudent specStudent3 = new SpecialStudent(56_17_38_16_35L);

        System.out.println(Arrays.toString(student2.getCoursesTaken()));

        System.out.println(student2.getLastName());

        System.out.println(collStudent2.getLastName());
        System.out.println(collStudent3.getId());

        System.out.println();
        System.out.println(specStudent1.getFirstName());
        specStudent1.setFirstName("BRO");
        System.out.println(specStudent1.getFirstName());

        System.out.println(courseChem.getTeacherName());

    }
}

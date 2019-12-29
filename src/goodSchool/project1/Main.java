package goodSchool.project1;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {


        System.out.println("helloussss world");

        School school1 = new School();
        Student student1 = new Student("Jednotka", "Sagan", (byte) 1, (byte) 1, (byte) 4, 312);
        Student student2 = new Student("trojka", "priezvisko", (byte) 4, (byte) 2, (byte) 2, 90);
        Student student3 = new Student("dvojka", "prezvisko", (byte) 1, (byte) 1, (byte) 1, 133);
        Student student4 = new Student("stvorka", "mrkvicka", (byte) 1, (byte) 2, (byte) 1, 12);
        Student student5 = new Student("petka", "Petrojovic", (byte) 2, (byte) 2, (byte) 1, 5);
        Student student6 = new Student("sestka", "sestakova", (byte) 2, (byte) 2, (byte) 1, 4);
        Student student7 = new Student("sedem", "sestakova", (byte) 2, (byte) 2, (byte) 1, 3);
        Student student8 = new Student("osmicka", "sestakova", (byte) 2, (byte) 2, (byte) 1, 1);

        System.out.println(student1.getG_Eng());
        System.out.println(student1.getAverageGrade());

        school1.addStudent(student2);
        school1.addStudent(student6);
        school1.addStudent(student4);
        school1.addStudent(student5);
        school1.addStudent(student1);
        school1.addStudent(student7);
        school1.addStudent(student8);

        school1.addStudent(student3);
        school1.showlist();
        System.out.println("Average absence all students is " + school1.getAverageAbsence());

        System.out.println("The Lowest Absence is           " +  school1.getTheLowestAbsence());

        System.out.println("Average grade all students is "   + school1.getAverageGrade());

        System.out.println(" Average grade from Math all students is " + school1.getAverageGradeFromMath());

        System.out.println("The best student in this amazing school is "+ school1.getTheBestStudent().getFullName());

        System.out.println(" The worst student in this amazing shchool is " + school1.getTheWorstStudent().getFullName());

        school1.getListSortedByAbsenceDesc();

        System.out.println("===== next line ===");

        System.out.println(Arrays.toString(school1.getListSortedByAbsenceDesc().getItems()));
        System.out.println("------------------------");
        //school1.playground();

      //  school1.showlist();

}
}

package goodSchool.project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    private static School school;

    public static void main(String[] args) {

        Student student;
        School school = new School();
        String data;


        try {
            BufferedReader br = new BufferedReader(new FileReader("students.dat"));
            while((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(" ");
                String firstName = arrOfStr[0];
                String lastName = arrOfStr[1];
                byte gmat = Byte.valueOf(arrOfStr[2]);
                byte geng = Byte.valueOf(arrOfStr[3]);
                byte ginf = Byte.valueOf(arrOfStr[4]);
                int absence = Integer.valueOf(arrOfStr[5]);

                student = new Student(firstName,lastName,gmat,geng,ginf,absence);

                school.addStudent(student);
                System.out.println(student.getFullName()
                        + " "
                        + student.getG_Mat()
                        + " "
                        + student.getG_Eng()
                        + " " + student.getG_Inf()
                        + " " + student.getAbsence());
            }
            br.close();
            System.out.println(School.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }










        System.out.println("Average absence all students is " + school.getAverageAbsence());

        System.out.println("The Lowest Absence is           " +  school.getTheLowestAbsence());


        System.out.println("Average grade all students is   " + school.getAverageGrade());


        System.out.println(" Average grade  from MATH       " + school.getAverageGradeFromMath());


        System.out.println("The best student  is             "+ school.getTheBestStudent().getFullName());


        System.out.println(" The worst student  is          " + school.getTheWorstStudent().getFullName());

        System.out.println("");

        System.out.println("sort by absence desc");
        System.out.println(Arrays.toString(school.getListSortedByAbsenceDesc().getItems()));
        System.out.println("");

        System.out.println("sort by the LastName");
        System.out.println(Arrays.toString(school.getListSortedByLastNameAsc().getItems()));

}
}

package goodSchool.project1;

public class Main {



    public static void main(String[] args) {


        System.out.println("helloussss world");

        School school1 = new School();
        Student student1 = new Student("Peter", "Sagan", (byte) 1, (byte) 1, (byte) 1, 312);
        Student student2 = new Student("Jakub", "prezvisko", (byte) 1, (byte) 2, (byte) 3, 33);
        Student student3 = new Student("jozef", "priezvisko", (byte) 4, (byte) 2, (byte) 2, 9);
        Student student4 = new Student("Peter", "second name", (byte) 1, (byte) 2, (byte) 1, 12);
        Student student5 = new Student("Peter", "second name", (byte) 2, (byte) 2, (byte) 1, 12);

        System.out.println(student1.getG_Eng());
        System.out.println(student1.getAverageGrade());

        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student4);
        school1.addStudent(student5);

        school1.showlist();
        System.out.println("Average absence all students is " + school1.getAverageAbsence());

        System.out.println("The Lowest Absence is           " +  school1.getTheLowestAbsence());

        System.out.println("Average grade all students is "   + school1.getAverageGrade());

        System.out.println(" Average grade from Math all students is " + school1.getAverageGradeFromMath());

        school1.getTheBestStudent();
}
}

package goodSchool.project1;

import java.awt.*;
import java.util.ArrayList;

public class School implements SchoolStat {

    private ArrayList<Student> list = new ArrayList<Student>();

    private static int count = 0;

    public School() { } // constructor

    public void addStudent(Student student) {
        this.list.add(student);
        count++; // if I add new student  count has to increase ,,because i know how many student i Have ??
    }

    public void showlist() {  // notes this function delete
        for (int i = 0; i < list.size(); i++) {
            System.out.println("hellou");
            System.out.println(list.get(i).getAbsence());
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double getAverageAbsence() {
        double countAbsence = 0;
        double averageAbsence = 0;

        for (int i = 0; i < list.size(); i++) {
            countAbsence += list.get(i).getAbsence();
        }

        averageAbsence = countAbsence / (double) list.size();


        return averageAbsence;
    }

    @Override
    public int getTheLowestAbsence() {
        int n = list.size();
        int temp = 0;
        int[] helpArray = new int[n];

        for (int i = 0; i < n; i++) {
            helpArray[i] = list.get(i).getAbsence();  // add to array all  values absence from arraylist
        }

        // Bubble sort
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(helpArray[j-1] > helpArray[j]){

                    temp = helpArray[j-1];
                    helpArray[j-1] = helpArray[j];
                    helpArray[j] = temp;
                }

            }
        }

        // return the first value because first value is The Lowest value (Absence)
        return helpArray[0];
    }

    @Override
    public double getAverageGrade() {
        int n = list.size() ;
        double[] helpArray = new double[n];
        double countvalues = 0.0;
        double averageGrade ;

        //System.out.println("number of values in list " +n);

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getAverageGrade();  // add to array all  values average grade from arraylist (average grade from every student)
        }

        for (int i = 0; i < n ; i++) {
            countvalues += helpArray[i];  // count all average grade to one value
           // System.out.print(" " +helpArray[i]);
        }

    averageGrade = countvalues /(double)list.size(); // calculation average grade all students
                                            // from average value one student

        return averageGrade;
    }

    @Override
    public double getAverageGradeFromMath() {
        int n = list.size() ;
        double[] helpArray = new double[n];
        double countvalues = 0.0;
        double averagegradeMath = 0.0;

        //System.out.println("number of values in list " +n);

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getG_Mat();  // add to array all  values Math grade from arraylist (Math grad from every student)

        }

        for (int i = 0; i < n ; i++) {
            countvalues += helpArray[i];  // count all average grade to one value

        }

        averagegradeMath = countvalues /(double)list.size(); // calculation average Math grade all students

        return averagegradeMath;
    }

    @Override
    public Student getTheBestStudent() {

        int n = list.size();
        double[] helpArray = new double[n];
        double countvalues = 0;
        double temp =0;


        // add to array and use bobble sort and take the first value

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getAverageGrade();  // add to array all  values Math grade from arraylist (Math grad from every student)
            System.out.println("avg " + list.get(i).getAverageGrade());
        }


        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(helpArray[j-1] > helpArray[j]){

                    temp = helpArray[j-1];
                    helpArray[j-1] = helpArray[j];
                    helpArray[j] = temp;
                }

            }
        }

        Student theBestStudent;
        for (int i = 0; i < n; i++) {
            if (helpArray[0] == list.get(i).getAverageGrade()) {
                System.out.println(list.get(i).getFullName());
                theBestStudent = list.get(i);
            }
        }
        System.out.println(helpArray[0]);

        return null;
    }

    @Override
    public Student getTheWorstStudent() {
        return null;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }



}

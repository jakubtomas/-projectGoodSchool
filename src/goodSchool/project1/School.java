package goodSchool.project1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class School implements SchoolStat {

    //private ArrayList<Student> list = new ArrayList<Student>();
    //private List list2 = new List();
    private java.util.List<Student> list;

    private static int count = 0;


    public School() { // constructor
                this.list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.list.add(student);
        //this.list.add(String.valueOf(student));
        count++; // if I add new student  count has to increase ,,because i know how many student i Have ??
    }

    public void showlist() {  // notes this function delete
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println("hellou");
            System.out.println(list.get(i).getAbsence());
        }*/
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
        Student theBestStudent = null;


        // add to array and use bobble sort and take the first value

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getAverageGrade();  // add to array all  values Math grade from arraylist (Math grad from every student)

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

        for (int i = 0; i < n; i++) {   //
            if (helpArray[0] == list.get(i).getAverageGrade()) {
                theBestStudent = list.get(i);
            }
        }
       // System.out.println(helpArray[0]);

        return theBestStudent;
    }

    @Override
    public Student getTheWorstStudent() {

        int n = list.size();
        double[] helpArray = new double[n];
        double countvalues = 0;
        double temp =0;
        Student theWorstStudent = null;


        // add to array and use bobble sort and take the first value

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getAverageGrade();  // add to array all  values Math grade from arraylist (Math grad from every student)

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

        for (int i = 0; i < n; i++) {   //
            if (helpArray[(list.size()-1)] == list.get(i).getAverageGrade()) {//       System.out.println(list.get(i).getFullName());
                theWorstStudent = list.get(i);
            }
        }

        return theWorstStudent;
    }


    @Override
    public List getListSortedByLastNameAsc() {



        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        int n = list.size();
        int[] helpArray = new int[n];
        int temp = 0 ;
       // java.util.List<Student> mainlyList = null;
        java.util.List<Student> mainlyList = new  ArrayList<>();;

        List myList = new List();
        //List myListe = new List();



        ArrayList<Student> helpList = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            helpArray[i] =  list.get(i).getAbsence();  // add to array all  values Math grade from arraylist (Math grad from every student)

        }


        // bubble sort
       /* for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(helpArray[j-1] > helpArray[j]){
                    temp = helpArray[j-1];
                    helpArray[j-1] = helpArray[j];
                    helpArray[j] = temp;
                }
            }
        }*/

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(helpArray[j-1] < helpArray[j]){
                    temp = helpArray[j-1];
                    helpArray[j-1] = helpArray[j];
                    helpArray[j] = temp;
                }

            }
        }


        int[] numberWasUsed = new int[n] ;

        for (int i = 0; i < numberWasUsed.length; i++) {
            numberWasUsed[i] = -1;
        }

        for (int i =0; i < n; i++) {
            for (int j = 0; j < n  ; j++) {

                if ((helpArray[i] == list.get(j).getAbsence()) && checkvalue(numberWasUsed, j)) {
                    numberWasUsed[j] = j;
                  // helpList.add(list.get(j));
                    //  mainlyList.add(list.get(j));
                   // System.out.println(" " + list.get(j).getFullName());
                    myList.add(list.get(j).getFullName());
                    break;


                }
            }
        }

        return  myList;
    }

    private boolean checkvalue(int[] array, int valueToCompare) {
        boolean permission = false;

        for (int i = 0; i <array.length; i++) {
            if (array[i] == valueToCompare) {
                permission = false;
                break;
            } else {
                permission=  true;
            }
        }

        return permission;

    }




}

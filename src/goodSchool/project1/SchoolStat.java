package goodSchool.project1;

import java.awt.*;

public interface SchoolStat {
    public int getAverageAbsence();

    public int getTheLowestAbsence();

    public double getAverageGrade();

    public double getAverageGradeFromMath();

    public Student getTheBestStudent();

    public Student getTheWorstStudent();

    public List getListSortedByLastNameAsc();

    public List getListSortedByAbsenceDesc();
}

package goodSchool.project1;

public class Student extends Person {
    protected byte g_Mat;
    protected byte g_Eng;
    protected byte g_Inf;
    protected int absence;


    public Student(String firstName, String lastName, byte g_Mat, byte g_Eng, byte g_Inf, int absence) {
        super(firstName, lastName);
        this.g_Mat = g_Mat;
        this.g_Eng = g_Eng;
        this.g_Inf = g_Inf;
        this.absence = absence;
    }

    public byte getG_Mat() {
        return g_Mat;
    }

    public byte getG_Eng() {
        return g_Eng;
    }

    public byte getG_Inf() {
        return g_Inf;
    }


    public int getAbsence() {
        return absence;
    }

    public double getAverageGrade() {
        return 4.2;  // you have to  change this
    }
}

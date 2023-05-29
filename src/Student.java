import java.util.ArrayList;

public class Student extends Person {

    private String email;
    private String matricNumber;
    private ArrayList<Course> cList;
    private int totalCredit;
    final int MAXCRED = 18;

    public Student() {
        cList = new ArrayList<>();
        totalCredit = 0;
    }

    public void StudRegCourse(Course c) {
        if ((totalCredit + c.getCredits()) <= MAXCRED) {
            cList.add(c);
            totalCredit += c.getCredits();
        }

    }

    public Student(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public Student(String name, int age, String address, String email, String matricNumber) {
        super(name, age, address);
        this.email = email;
        this.matricNumber = matricNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    @Override

    public String toString() {
        return "Course{" + ", MatricNumber =" + matricNumber + "}";
    }

}

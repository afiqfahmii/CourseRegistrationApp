public class Student extends Person {

    private String email;
    private String matricNumber;
    // private Course cList[] = new Course[30];
    // private int courseNum;

    // public Student() {
    //     cList = new Course[30];
    // }

    // public void StudRegCourse(Course c) {
    //     cList[courseNum] = c;
    //     courseNum++;
    // }

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

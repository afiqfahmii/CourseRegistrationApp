public class AcademicStaff extends Person {

    private String staffNum;
    private String department;

    public String getDepartment() {
        return department;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    public AcademicStaff(String staffNum, String department) {
        super();
        this.staffNum = staffNum;
        this.department = department;
    }

    public AcademicStaff(String name, int age, String address, String staffNum, String department) {
        super(name, age, address);
        this.staffNum = staffNum;
        this.department = department;
    }

    public void createCourse(Course c){
        
    }

}

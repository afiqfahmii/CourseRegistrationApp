public class Lecturer extends Person {

    private String department;
    private String LecturerId;

    public Lecturer() {

    }

    public Lecturer(String department, String LecturerId) {

        this.department = department;
        this.LecturerId = LecturerId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStaffId() {
        return LecturerId;
    }

    public void setStaffId(String staffId) {
        this.LecturerId = staffId;
    }

    @Override

    public String toString() {
        return "Course{" + ", department=" + department + ", staffId=" + LecturerId + "}";
    }
}

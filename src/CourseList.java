import java.util.ArrayList;

public class CourseList {

    ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course c) {
        this.courseList.add(c);

    }

    public void removeCourse(Course c) {
        this.courseList.remove(c);
    }

    @Override
    public String toString() {
        return "CourseList [courseList=" + courseList + "\n]";
    }

}

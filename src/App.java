
public class App {
    public static void main(String[] args) throws Exception {

        CourseList compCourse = new CourseList();
        Course c1 = new Course("OOP", "SECJ2012", 2);
        Course c2 = new Course("NetCom", "SECJ2002", 3);
        Course c3 = new Course("HCI", "SECJ2000", 4);

        compCourse.addCourse(c1);
        compCourse.addCourse(c2);
        compCourse.addCourse(c3);


        System.out.println(compCourse.toString());

        // Student student1 = new Student();

    }
}

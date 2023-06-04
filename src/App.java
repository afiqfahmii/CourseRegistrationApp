import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


        


        // Student student1 = new Student();
        Scanner s = new Scanner(System.in);
        Course c1 = new Course("OOP","SECJ2020",3);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = s.nextLine();

        System.out.print("Age: ");
        int age = s.nextInt();
        s.nextLine();
        
        System.out.print("Email: ");
        String email = s.nextLine();
        
        System.out.print("Address: ");
        String address = s.nextLine();

        System.out.print("MatricNumber: ");
        String matricNumber = s.nextLine();


        Student student = new Student(name, age, address, email ,matricNumber);
        c1.addStudent(student);

    }
}

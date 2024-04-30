import java.util.Scanner;

public class Student extends Encap
{

    public static void main(String[] args)
    {
        Integer rollNo, studAge;
        String studName, course, address;

        Encap enc = new Encap();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student roll number: ");
        rollNo = scan.nextInt();
        enc.setRollNo(rollNo);

        System.out.println("Enter student name: ");
        studName = scan.next();
        enc.setStudName(studName);

        System.out.println("Enter student age: ");
        studAge = scan.nextInt();
        enc.setStudAge(studAge);

        System.out.println("Enter course name: ");
        course = scan.next();
        enc.setCourse(course);

        System.out.println("Enter student address: ");
        address = scan.next();
        enc.setAddress(address);

        System.out.println("___________STUDENT INFO____________");
        System.out.println("Student name: " + enc.getStudName());
        System.out.println("Student roll number: " + enc.getRollNo());
        System.out.println("Student age: " + enc.getStudAge());
        System.out.println("Course taken: " + enc.getCourse());
        System.out.println("Address: " + enc.getAddress());


    }

}

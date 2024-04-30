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
        if (rollNo> 0)
        {
            enc.setRollNo(rollNo);
        }
        else
        {
            System.out.println("!! Roll number cannot be 0 !!");
        }

        System.out.println("Enter student name: ");
        studName = scan.next();
        enc.setStudName(studName);

        System.out.println("Enter student age: ");
        studAge = scan.nextInt();
        if(studAge < 100 )
        {
            enc.setStudAge(studAge);
        }
        else {
            System.out.println("!! Age cannot be more than 100 !!");
        }

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

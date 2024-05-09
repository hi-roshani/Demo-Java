import day12.ListExample;
import day12.MapExample;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args){
        System.out.println("Choose from following"
                + "\n............................"
                + "\n1. Show student data"
                + "\n2. Show teacher data"
                + "\n3. Show student result"
                + "\n4. Show teacher salary"
                + "\n............................");

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();

        MapExample map = new MapExample();
        ListExample lists = new ListExample();

        switch (choice){
            case 1:
                lists.fillStudentData();
                break;
            case 2:
                lists.fillTeacherData();
                break;
            case 3:
                map.getMap();
                break;
            case 4:
                map.getTeacherMap();
                break;
            default:
                System.out.println("Enter a valid choice ");
        }

    }
}

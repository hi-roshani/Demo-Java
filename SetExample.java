import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void hashSet(){
        Set<String> countries = new HashSet<>();
        //String tempVal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cities you want to add ");
        Integer noOfCities = scan.nextInt();
        System.out.println("Enter country names ");
        for(Integer i = 0; i< noOfCities; i++){
            //tempVal = scan.next();
            countries.add(scan.next());
        }

    }
    public static void main(String[] args){
        hashSet();

}
}

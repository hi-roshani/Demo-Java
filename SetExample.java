import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.NavigableSet;

public class SetExample {
    public static void hashSet(){
        Set<String> cities = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cities you want to add ");

        Integer noOfCities = scan.nextInt();

        System.out.println("Enter city names ");
        for(Integer i = 0; i< noOfCities; i++){
            cities.add(scan.next());
        }

        System.out.println("These are entered cities: ");
        for(String itr : cities)
        {
            System.out.print(itr + " ");
        }
    }

    public static void treeSet(){
        TreeSet<Double> numbers=new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of values ");
        Integer numberOfValues = scan.nextInt();

        System.out.println("Enter values");
        for (Integer i=0; i <numberOfValues; i++){
            numbers.add(scan.nextDouble());
        }

        System.out.println("These are values you entered: " + numbers );

        System.out.println("Lowest Value: "+ numbers.pollFirst());
        System.out.println("Highest Value: "+ numbers.pollLast());

        System.out.println("Set of numbers after first and last values are polled: " + numbers);
    }


    public static void navigableSet(){
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of values: ");
        Integer numOfValues = scan.nextInt();

        System.out.println("Enter values: ");
        for(Integer i = 0; i< numOfValues; i++){
            navigableSet.add(scan.nextInt());
        }

        System.out.println("Pick a number from set " + navigableSet);
        Integer chosenNumber = scan.nextInt();

        System.out.println("Choose from following options to perform on the navigable set" + "\n______________________");
        System.out.println("1. Greatest element which is less than " + chosenNumber
                + "\n2. Greatest element which is less than or equal to " + chosenNumber
                + "\n3. Lowest element which is greater than " + chosenNumber
                + "\n4. Lowest element which is greater than or equal to " + chosenNumber
                + "\n5. Show all elements greater than " + chosenNumber
                + "\n6. View and remove lowest element "
                + "\n7. View and remove highest element"
                + "\n______________________");
        Integer choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("lower(3): " + navigableSet.lower(3));
            case 2:
                System.out.println("floor(3): " + navigableSet.floor(3));
            case 3:
                System.out.println("higher(3): " + navigableSet.higher(3));
            case 4:
                System.out.println("ceiling(3): " + navigableSet.ceiling(3));
            case 5:
                System.out.println(navigableSet.tailSet(chosenNumber));
            case 6:
                System.out.println("pollFirst(): " + navigableSet.pollFirst());
                System.out.println("Navigable Set:  " + navigableSet);
            case 7:
                System.out.println("pollLast(): " + navigableSet.pollLast());
                System.out.println("Navigable Set:  " + navigableSet);
            default:
                System.out.println("__________________"
                        + "\nEND"
                        + "\n__________________");

        }


    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose from below operations: "
                + "\n____________________"
                + "1. Cities with hash set"
                + "2. Tree set operations (Retrieve and remove values)"
                + "3. Navigable set operations"
                + "\n____________________");
        Integer choice = scan.nextInt();

        switch (choice){
            case 1:
                hashSet();
            case 2:
                treeSet();
            case 3:
                navigableSet();
            default:
                System.out.println("END");
        }
    }
}
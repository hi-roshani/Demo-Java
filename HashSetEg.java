import java.util.HashSet;
import java.util.Set;

public class HashSetEg {
    public static void main(String[] args)
    {

        Set<String> hash = new HashSet<>();

        hash.add("Oranges");
        hash.add("Are");
        hash.add("Fruits");
        hash.add("Tomatoes");
        hash.add("Are");
        hash.add("Vegetables");

        System.out.println(hash);
    }
}

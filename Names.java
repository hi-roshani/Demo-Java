import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {
   public static void main(String[] args) {
       List<String> name = new LinkedList<>();
       name.add("Amit");
       name.add("Bhavya");
       name.add("Chetan");
       name.add("Deepak");
       name.add("Ekta");
       name.add("Farhan");
       name.add("Gita");
       name.add("Harsh");
       name.add("Isha");
       name.add("Jyoti");

       List<String> a = name.stream()
               .filter(n -> n.length() >= 5)
               .toList();
       System.out.println(a);

       List<String> b= name.stream().filter(n-> n.length()==5).findAny().stream().toList();
       System.out.println(b);

       Map<Character, List<String>> c= name.stream().collect(Collectors.groupingBy(k -> k.charAt(0)));
       System.out.println(c);

       List<String> d = name.stream().sorted().toList();
       System.out.println(d);

   }
}

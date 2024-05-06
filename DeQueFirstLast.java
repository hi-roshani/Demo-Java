import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueFirstLast {
    public static void main(String[] args) {

        Deque<String> flowers = new ArrayDeque<String>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Dandelion");

        flowers.offerFirst("Hibiscus");
        flowers.offerLast("Marigold");

        Iterator<String> i = flowers.iterator();

        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("");
        System.out.println(flowers.pollFirst());
        System.out.println(flowers.pollLast());

        System.out.println("");

        while (i.hasNext())
            System.out.print(i.next()+"  ");
    }
}

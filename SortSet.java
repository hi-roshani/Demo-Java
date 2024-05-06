import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {
    public static void main(String[] args)
    {
        SortedSet<String> tree = new TreeSet<String>();

        tree.add("Mango");
        tree.add("Strawberry");
        tree.add("Apple");

        tree.add("Mango");

        System.out.println(tree);

        tree.remove("Strawberry");
        System.out.println("Strawberry removed" +"\n"+ tree);

        System.out.println("New set: ");
        Iterator<String> i = tree.iterator();
        while (i.hasNext())
            System.out.print(i.next()+"  ");
    }
}

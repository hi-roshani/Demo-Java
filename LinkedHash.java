import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {
    public static void main(String args[]){
        Set<String> lnkHash = new LinkedHashSet<>();

        lnkHash.add("Rasgulla");
        lnkHash.add("Jalebi");
        lnkHash.add("Laddoo");
        lnkHash.add("Jalebi");
        lnkHash.add("Rabdi");
        lnkHash.add(null);

        Iterator<String> itr = lnkHash.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

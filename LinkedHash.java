import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String args[]){
        LinkedHashSet<String> lnkHash = new LinkedHashSet<String>();

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

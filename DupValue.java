import java.util.Arrays;
import java.util.Scanner;

public class DupValue {
    public static void main(String []args)
    {
        takeVals();
    }
    static void takeVals()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your string: ");
            String word = scan.next();

            char vals[] = word.toCharArray();
            Integer strLen = vals.length;

            removeDupVal(vals,strLen);

        }

    static void removeDupVal(char vals[], Integer strLen)
    {
        Integer itr = 0;

        for(Integer i= 0; i < strLen; i++)
        {
            Integer j;
            for(j=0; j<i; j++)
            {
                if(vals[i] == vals[j])
                {
                    break;
                }
            }
            if(j==i)
            {
                vals[itr++] = vals[i];
            }
        }
        String noDups = String.valueOf(Arrays.copyOf(vals, itr));
        
        System.out.println(noDups);

    }
}

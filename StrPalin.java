import java.util.Scanner;

public class StrPalin {
    public static boolean yesPalindrome(String str)
    {
        Integer lhs = 0;
        Integer rhs = str.length()-1;

        while(lhs < rhs)
        {
            if(str.charAt(lhs++) != str.charAt(rhs--))
            {
                return false;
            }
        }
        return true;
    }

    public static String getPalin(String[] palWord)
    {
        for(String word : palWord)
        {
            if (yesPalindrome(word))
                return word;
        }

        return null;
    }

    public static String[] removBrac(String setOfWords)
    {
        //setOfWords = setOfWords.substring(setOfWords.indexOf('['), setOfWords.lastIndexOf(']'+1));
        setOfWords = setOfWords.replace("[", "");
        setOfWords = setOfWords.replace("]", "");
        return setOfWords.split(",\\s*");
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter words  ");
        String setOfWords = scan.nextLine();
        String[] palWord = removBrac(setOfWords);

        String palindrome = getPalin(palWord);

        if(palindrome == null)
            System.out.println("\"\"");
        else
            System.out.println(palindrome);
    }
}

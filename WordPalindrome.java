import java.util.Scanner;

public class WordPalindrome {
    public void getWord() {
        System.out.println("Enter a word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        Integer flag= 2;
        Integer lhs = 0;
        Integer rhs = word.length()-1;

        while (lhs < rhs) {
            if(word.charAt(lhs++) == word.charAt(rhs--)){
                flag=3;
            }
        }
        if (flag== 2){
            System.out.println("String is not palindrome");
        }
        else {
            System.out.println("String is palindrome");
        }
    }
    public static void main(String[] args){
        WordPalindrome w = new WordPalindrome();
        w.getWord();
    }
}

public class New {
    //Find last repeated character
    public static void main(String[] args) {
        String str = "Test string for java problem";
        char c[] = str.toLowerCase().toCharArray();
        Integer len = c.length;

            for (int i = len-1; i >=0; i--) {
                for (int j= i-1; j>= 0; j--) {
                    if (c[i] == c[j]) {
                        System.out.println(c[i]);
                        return;
                    }
                }
            }
    }
}

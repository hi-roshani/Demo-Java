public class NumPat {
    public static void main(String []args)
    {
        int i, j;
        for( i=3 ; i<8 ; i++ ) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}

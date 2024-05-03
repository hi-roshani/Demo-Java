import java.util.Scanner;

public class SingSub extends SingBase
{
    public static Integer take()
    {
        SingBase sb = new SingBase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        sb.setA(sc.nextInt());
        System.out.println("Enter second value: ");
        sb.setB(sc.nextInt());

        Integer a= sb.getA();
        Integer b = sb.getB();

        return a + b;

    }


    public static void main(String[] args)
    {

        String c = String.valueOf(take());
        System.out.println("Addition is: " + c );

    }

}

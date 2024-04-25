public class Variable {

    public String i= "I am instance variable";

    static String s = "I am static variable";

    public static void main(String []args)
    {
        String l  = "I am local variable";

        Variable iv = new Variable();
        System.out.println(iv.i);

        System.out.println(l);
        System.out.println(s);
    }

}

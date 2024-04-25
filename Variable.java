public class Variable {

    public String i= "I am instance variable";

    public String iAlso;

    {
        iAlso= "I also am an Instance variable but I am initialized using init block";
    }

    static String s = "I am static variable";

    public static void main(String []args)
    {
        String l  = "I am local variable";

        Variable iv = new Variable();
        System.out.println(iv.i);

        System.out.println(l);
        System.out.println(s);
        System.out.println(iv.iAlso);
    }

}

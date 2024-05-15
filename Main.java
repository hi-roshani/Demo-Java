import day15.MultiThreadEx;
import day15.MultiThreadEx2;

public class Main {
    public static void main(String []args){
        MultiThreadEx m1 = new MultiThreadEx();
        MultiThreadEx2 m2 = new MultiThreadEx2();
        m2.start();

        m1.start();
    }
}

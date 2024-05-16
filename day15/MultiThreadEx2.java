package day15;

public class MultiThreadEx2 extends Thread{
    @Override
    public void run() {
        try {
            for (Integer i = 15; i > 0; i--) {
                System.out.print("  " + i);
                sleep(200);
            }
        }
        catch (InterruptedException ie){
            System.out.println("Interrupt ");
        }
    }

    /*public void show() {
        try {
            for (Integer i = 15; i > 0; i--) {
                System.out.print("  " + i);
                sleep(200);
            }
        }
        catch (InterruptedException ie){
            System.out.println("Interrupt ");
        }
    }*/
}

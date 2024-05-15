package day15;

public class MultiThreadEx extends Thread{
    @Override
    public void run() {
        try {
            for (Integer i = 1; i < 10; i++) {
                System.out.print("  " + i);
                sleep(300);
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupt");
        }
    }

   /* public void show(){
        try {
            for (Integer i = 1; i < 10; i++) {
                System.out.print("  " + i);
                sleep(300);
            }
        }
        catch (InterruptedException e){
            System.out.println("Interrupt");
        }
    }*/
}

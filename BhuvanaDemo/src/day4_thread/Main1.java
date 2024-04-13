package day4_thread;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1 ; i<=10 ; i++){
            System.out.println("A"+i);
            Thread.sleep(500);//program sleep for a second
        }

        for(int i=1 ; i<=10 ; i++){
            System.out.println("B"+i);
            Thread.sleep(500);
        }

    }
}

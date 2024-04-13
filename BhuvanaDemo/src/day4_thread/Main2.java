package day4_thread;

public class Main2 {
    public static void main(String[] args) {
        //1.create thread object,override the run() method
        Thread t1 = new Thread(){
            @Override   //write the thing you want to maintain by this thread
            public void run() {
               for (int i=1 ; i<=10 ; i++){
                   System.out.println("A"+i);
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i=1 ; i<=10 ; i++){
                    System.out.println("B"+i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        //start thread
        t1.start();
        t2.start();
    }
}











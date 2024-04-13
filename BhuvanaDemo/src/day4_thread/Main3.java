package day4_thread;
//when many thread objects do similar operations, then we should define our own Thread class

public class Main3 {
    public static void main(String[] args) {
        //3.create your own Thread object
        MyThread mt1 = new MyThread("A",1000);//A,1000
        //4.start it
        mt1.start();

        MyThread mt2 = new MyThread("B",500);//B,500
        mt2.start();

        MyThread mt3 = new MyThread("C",200);//C,200
        mt3.start();
    }
}


//1.define a class, extends Thread
//2.inside of class, override run method to define what this Thread does
class MyThread extends Thread{
    private String name;
    private int duration;
    public MyThread(String name,int duration){
//        System.out.println("constructor of MyThread");
        this.name = name;
        this.duration = duration;
    }

    @Override
    public void run() {
        for(int i=1 ; i<=10 ; i++){
            System.out.println(name+i);
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
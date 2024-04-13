package day4_thread;

import javax.swing.*;

public class Main4 extends JFrame {     //Main4 is a normal class, by extends JFrame , then it becomes something with UI (/window)
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        main4.setVisible(true);
    }

    public Main4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,900,500);//set location and size

        //content Area
        JPanel contentPanel = new JPanel();
        setContentPane(contentPanel);
        contentPanel.setLayout(null);//no layout, which allows the components decide postion and location by themselves

        JButton btn1 = new JButton("first button");
        btn1.setBounds(100,300,200,50);//unit:  pixel
        contentPanel.add(btn1);

        JButton btn2 = new JButton("second button");
        btn2.setBounds(200,400,200,50);
        contentPanel.add(btn2);

        ButtonThread t1 = new ButtonThread(btn1);
        t1.start();

//        ButtonThread t2 = new ButtonThread(btn2);
//        t2.start();
    }
}

class ButtonThread extends Thread{
    private JButton btn;
    public ButtonThread(JButton btn){
        this.btn = btn;
    }
    @Override
    public void run() {
        //control btn moves around in this method
        int step = 10;
        while(true){
            int x = btn.getX();
            x+=step;
            btn.setLocation(x,300);
            if(x>=700 || x<=0){
                step*=-1;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}















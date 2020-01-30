package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//实现implements接口
public class GUI_2 implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        GUI_2 gui_2 = new GUI_2();
        gui_2.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me !");
        //向button注册，告诉他要监听的事件
        button.addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    //重写ActionListener接口上的方法，这是真正处理事件的方法
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been touched !");
    }
}

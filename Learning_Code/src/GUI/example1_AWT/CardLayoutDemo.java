package GUI.example1_AWT;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        //创建窗口对象并设置属性
        Frame f = new Frame("更改背景色案例");
        f.setBounds(500,100,600,600);

        //设置布局方式（卡片布局）
        f.setLayout(new FlowLayout());

        //创建四个按钮
        Button b1 = new Button("red");
        Button b2 = new Button("yellow");
        Button b3 = new Button("green");
        Button b4 = new Button("reset");

        //将按钮添加进窗口
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        //b1按钮设置事件
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setBackground(Color.red);
//            }
//        });

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                f.setBackground(Color.red);
            }
        });

        //b2按钮设置事件
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.yellow);
            }
        });

        //b3按钮设置事件
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.green);
            }
        });

        //b4按钮设置事件
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.white);
            }
        });

        //设置窗体可关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置窗口可见
        f.setVisible(true);
    }
}

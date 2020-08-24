package Exam_16_17.B3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rectangle extends JFrame {

    public Rectangle() {
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel width = new JLabel("width");
        JLabel length = new JLabel("length");
        JTextField w = new JTextField(10);
        JTextField l = new JTextField(10);
        JButton cal = new JButton("Calculate");
        JLabel area = new JLabel();

        this.add(width);
        this.add(w);
        this.add(length);
        this.add(l);
        this.add(cal);
        this.add(area);

        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double width = Double.parseDouble(w.getText());
                double length = Double.parseDouble(l.getText());
                String result = String.valueOf((width*length));
                area.setText("Area: " + result);
            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new Rectangle();
    }
}

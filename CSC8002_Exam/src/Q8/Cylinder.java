package Q8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cylinder implements ActionListener//complete the header
{
    private JFrame frame;
    private JLabel radiusL, heightL, volumeL;
    private JTextField radiusTF, heightTF;
    private JButton calculateB;

    public Cylinder() {
        //complete the constructor
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        radiusL = new JLabel("radius:");
        heightL = new JLabel("height:");
        volumeL = new JLabel();
        radiusTF = new JTextField(10);
        heightTF = new JTextField(10);
        calculateB = new JButton("calculate");
        calculateB.addActionListener(this);

        //==================
        frame.add(radiusL);
        frame.add(radiusTF);
        frame.add(heightL);
        frame.add(heightTF);
        frame.add(calculateB);
        frame.add(volumeL);

        frame.setSize(320, 240);
        frame.setVisible(true);
        int option = JFrame.EXIT_ON_CLOSE;
        frame.setDefaultCloseOperation(option);
    }

    public void actionPerformed(ActionEvent e) {
        //complete this method
        String radius = radiusTF.getText();
        String height = heightTF.getText();
        Double volume =  (3.14 * Double.parseDouble(radius) * Double.parseDouble(radius) * Double.parseDouble(height));
        volumeL.setText("volume: " + volume);
    }

    public static void main(String[] args) {
        //complete this method
        Cylinder cylinder = new Cylinder();
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.BLACK;
import static java.awt.Color.getColor;

public class myFrame extends JFrame implements ActionListener {


    myFrame()
    {

       JLabel []labels= new JLabel[9];
        for(int i=0;i<9;i++) {
            labels[i] = new JLabel();

            this.add(labels[i]);
        }
        JPanel panel = new JPanel();

        this.setTitle("TIC TAC TOE");
        this.getContentPane().setBackground(BLACK);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        this.setSize((int) (3*Pool.get_image_Cross_length()),(int)(3*Pool.get_image_Cross_width()));
        this.setVisible(true);
    }
    void set_label(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        //mouse click method
    }
}

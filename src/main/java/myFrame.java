import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.BLACK;
import static java.awt.Color.getColor;

public class myFrame extends JFrame{
    JLabel pool=new JLabel();
    private Button []buttons= new Button[9];
    ClickListener []click = new ClickListener[9];
    myFrame()
    {
        for(int i=0;i<9;i++)
        {
            click[i]=new ClickListener();
        }

        for(int i=0;i<9;i++) {
            buttons[i] = new Button(true);
            buttons[i].setBackground(Color.black);
            buttons[i].addActionListener(click[i]);
            this.add(buttons[i]);
        }




        this.setTitle("TIC TAC TOE");
        this.getContentPane().setBackground(BLACK);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        this.setSize((int) 3*300,(int)(3*300));
        this.setVisible(true);
    }

    /*
    x yyy
    x 147
    x 258
    x 369
     */


    private class ClickListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==buttons[0])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[1])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[2])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[3])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[3])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[4])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[5])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[6])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[7])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[8])
            {
                System.out.println("1");
            }
            else if(e.getSource()==buttons[9])
            {
                System.out.println("1");
            }




        }
    }
}

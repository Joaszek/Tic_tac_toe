import org.w3c.dom.ls.LSOutput;

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
    private boolean which_one = true;
    JLabel pool = new JLabel();
    private Button[] buttons = new Button[9];
    ClickListener[] click = new ClickListener[9];
    myFrame()
    {
        Button.load_images();
        for(int i=0;i<9;i++)
        {
            click[i]=new ClickListener();
        }

        for(int i=0;i<9;i++) {
            buttons[i] = new Button();
            buttons[i].setBackground(Color.black);
            buttons[i].addActionListener(click[i]);
            this.add(buttons[i]);
        }

        this.setLayout(new GridLayout(3,3));
        this.setLocationRelativeTo(null);
        this.setSize((int) 3*300,(int)(3*300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setDefaultCloseOperation(MENU menu) {

    }

    





    /*
    x yyy
    x 012
    x 345
    x 678
     */


    private class ClickListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {


            if(e.getSource()==buttons[0])
            {
                buttons[0].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[0].setEnabled(false);
                            }

            else if(e.getSource()==buttons[1])
            {
                buttons[1].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[1].setEnabled(false);
            }

            else if(e.getSource()==buttons[2])
            {
                buttons[2].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[2].setEnabled(false);
            }

            else if(e.getSource()==buttons[3])
            {
                buttons[3].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[3].setEnabled(false);

            }
            else if(e.getSource()==buttons[4])
            {
                buttons[4].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[4].setEnabled(false);

            }
            else if(e.getSource()==buttons[5])
            {
                buttons[5].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[5].setEnabled(false);

            }
            else if(e.getSource()==buttons[6])
            {
                buttons[6].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[6].setEnabled(false);

            }
            else if(e.getSource()==buttons[7])
            {
                buttons[7].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[7].setEnabled(false);

            }
            else if(e.getSource()==buttons[8])
            {
                buttons[8].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[8].setEnabled(false);

            }

        }
    }
}

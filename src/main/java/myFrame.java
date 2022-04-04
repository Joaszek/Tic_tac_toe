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

public class myFrame extends JFrame implements MouseListener{
    JLabel pool;
    private JPanel []panels= new JPanel[9];
    myFrame()
    {
        Pool.loading_pictures();
       JPanel []panels= new JPanel[9];
        for(int i=0;i<9;i++) {
            panels[i] = new JPanel();
            panels[i].setBackground(Color.black);
            this.add(panels[i]);
        }


        addMouseListener((MouseListener) this);

        this.setTitle("TIC TAC TOE");
        this.getContentPane().setBackground(BLACK);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        this.setSize((int) (3*Pool.get_image_Cross_length()),(int)(3*Pool.get_image_Cross_width()));
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()<600)
        {
            if(e.getX()<300)
            {
                if(e.getY()<300)
                {
                    //0
                    pool.setIcon(Pool.load_image(true));
                    panels[0].add(pool);
                }
                else if(e.getY()<600)
                {
                    //1
                    pool.setIcon(Pool.load_image(true));
                    panels[1].add(pool);
                }
                else
                {
                    //2
                    pool.setIcon(Pool.load_image(true));
                    panels[2].add(pool);
                }
            }
            else if(e.getX()<600)
            {
                if(e.getY()<300)
                {
                    //3
                    pool.setIcon(Pool.load_image(true));
                    panels[3].add(pool);
                }
                else if(e.getY()<600)
                {
                    //4
                    pool.setIcon(Pool.load_image(true));
                    panels[4].add(pool);
                }
                else
                {
                    //5
                    pool.setIcon(Pool.load_image(true));
                    panels[5].add(pool);
                }
            }
        }
        else if(e.getY()>600&&e.getY()<300)
        {
            //6
            pool.setIcon(Pool.load_image(true));
            panels[6].add(pool);
        }
        else if(e.getY()>600&&e.getY()<600)
        {
            //7
            pool.setIcon(Pool.load_image(true));
            panels[7].add(pool);
        }
        else if(e.getY()>600&&e.getY()>600)
        {
            //8
            pool.setIcon(Pool.load_image(true));
            panels[8].add(pool);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

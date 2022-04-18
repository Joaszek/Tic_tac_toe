import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button extends JButton {
    //to load pictures
    private static ImageIcon circle;
    private static ImageIcon cross;
    //labels to edit size
    private static  JLabel label1;
    private static JLabel label2;
    //final size of pictures
    private static ImageIcon imageCircle;
    private static ImageIcon imageCross;
    //checking score
    private int horizontal=0;
    private int vertical=0;
    private int left_diagonal=0;
    private int right_diagonal=0;


    public static void load_images()
    {
        circle = new ImageIcon("circle.png");
        cross = new ImageIcon("cross.png");

        label1= new JLabel();
        label1.setIcon(circle);
        label1.setSize(300,300);

        label2=new JLabel();
        label2.setIcon(cross);
        label2.setSize(300,300);

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("circle.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(label1.getWidth(), label1.getHeight(),Image.SCALE_SMOOTH);

       BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("cross.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg2 = img2.getScaledInstance(label2.getWidth(), label2.getHeight(),Image.SCALE_SMOOTH);

        imageCircle = new ImageIcon(dimg);
        imageCross = new ImageIcon(dimg2);
    }

    Button()
    {
        this.setVisible(true);
    }

    public static ImageIcon set_Image(boolean which_one)
    {
        if(which_one)return imageCross;

        return imageCircle;
    }
    public void change_horizontal(boolean which_one)
    {
        if(which_one)horizontal+=1;
        else horizontal-=1;
    }
    public void change_vertical(boolean which_one)
    {
        if(which_one) vertical+=1;
        else vertical-=1;
    }
    public void change_left_diagonal(boolean which_one)
    {
        if(which_one) left_diagonal+=1;
        else left_diagonal-=1;
    }
    public void change_right_diagonal(boolean which_one)
    {
        if(which_one) right_diagonal+=1;
        else right_diagonal-=1;
    }
    public int getHorizontal()
    {
        return horizontal;
    }
    public int getVertical()
    {
        return vertical;
    }
    public int getLeft_diagonal()
    {
        return left_diagonal;
    }
    public int getRight_diagonal()
    {
        return right_diagonal;
    }



























}

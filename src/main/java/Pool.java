import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pool {

    //to load pictures
    private static ImageIcon circle;
    private static ImageIcon cross;
    //labels to put into panels so you can edit them
    private static  JLabel label1;
    private static JLabel label2;
    //final size of pictures
    private static ImageIcon imageCircle;
    private static ImageIcon imageCross;
    Pool()
    {
        JLabel circle_label = new JLabel();
        JPanel panel = new JPanel();
        panel.add(circle_label);
    }
    public static void loading_pictures()
    {
        cross = new ImageIcon("cross.png");
        circle = new ImageIcon("circle.png");

        label1 = new JLabel();
        label1.setIcon(circle);
        label1.setSize(300,300);

        label2 = new JLabel();
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
    public static ImageIcon load_image(boolean which_one)
    {
        if(which_one)
        {
            return imageCross;
        }
        return imageCircle;
    }
    public static double get_image_Cross_width()
    {
        return imageCross.getIconWidth();
    }
    public static double get_image_Cross_length()
    {
        return imageCross.getIconHeight();
    }
}

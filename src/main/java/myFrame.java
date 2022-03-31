import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class myFrame extends JFrame {
    private final ImageIcon cros;
    private final ImageIcon circle;
    private final JLabel label1;
    private final JLabel label2;
    myFrame()
    {
        cros = new ImageIcon("cross.png");
        circle = new ImageIcon("circle.png");

        label1 = new JLabel();
        label1.setIcon(circle);
        label1.setSize(300,300);

        label2 = new JLabel();
        label2.setIcon(cros);
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
            img = ImageIO.read(new File("cross.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg2 = img.getScaledInstance(label2.getWidth(), label2.getHeight(),Image.SCALE_SMOOTH);


        ImageIcon imageCircle = new ImageIcon(dimg);
        ImageIcon imageCross = new ImageIcon(dimg2);
        JLabel []labels= new JLabel[9];
        for(int i=0;i<9;i++) {
            labels[i] = new JLabel();
            labels[i].setOpaque(true);
            labels[i].setBackground(Color.black);
            this.add(labels[i]);
        }




        this.setBackground(Color.black);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        this.setSize(3*imageCross.getIconWidth(),3*imageCross.getIconHeight());
        this.setVisible(true);
    }
}

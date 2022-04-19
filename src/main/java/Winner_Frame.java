import javax.swing.*;
import java.awt.*;

public class Winner_Frame extends JFrame {
    JLabel label_1;
    JLabel label_2;
    String word;
    ImageIcon finish;
    JLabel picture;
    JPanel draw_background;
    Winner_Frame(boolean winner)
    {

        label_1 = new JLabel();
        label_1.setFont(new Font("Nirmala UI", Font.BOLD,30));
        label_1.setBounds(70,50,300,100);
        label_1.setText("THE WINNER IS:");
        if(winner)
        {
            word = "Circle";
        }
        else
        {
            word = "Cross";
        }

        label_2 = new JLabel();
        label_2.setText(word);
        label_2.setBounds(150,100,200,200);
        label_2.setFont(new Font("Nirmala UI", Font.BOLD,40));



        this.add(label_1);
        this.add(label_2);
        this.setSize(400,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    Winner_Frame()
    {
        //background
        draw_background = new JPanel();
        draw_background.setSize(400,400);
        //draw_background.setBackground(Color.WHITE);
        //strings
        label_1 = new JLabel();
        label_1.setFont(new Font("Nirmala UI", Font.BOLD,30));
        label_1.setBounds(90,50,250,50);
        label_1.setText("IT'S A DRAW :O");
        //picture
        finish = new ImageIcon("draw.png");
        picture = new JLabel();
        picture.setBounds(50,150,300,200);
        picture.setIcon(finish);
        //button


        //adding everything to background
        draw_background.add(picture);
        draw_background.add(label_1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
}

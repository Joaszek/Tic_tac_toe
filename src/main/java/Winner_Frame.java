import javax.swing.*;
import java.awt.*;

public class Winner_Frame extends JFrame {
    JLabel label;
    Winner_Frame(boolean winner)
    {
        label = new JLabel();


        label.setFont(new Font("Nirmala UI", Font.BOLD,30));
        label.setBounds(00,100,300,300);




        this.add(label);
        this.setSize(400,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    Winner_Frame()
    {

    }
}

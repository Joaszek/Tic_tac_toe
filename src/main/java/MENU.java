import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU extends JFrame {
    JButton player_vs_bot;
    JButton player_vs_payer;
    MENU()
    {
        this.setSize(900,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public class button_listener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

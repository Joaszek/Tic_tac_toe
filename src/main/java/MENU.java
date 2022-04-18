import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU extends JFrame {

    //MENU
    JButton player_vs_bot;
    JButton player_vs_player;
    Button_Listener button_listener_1;
    JPanel panel_menu;
    JPanel panel_player_vs_player;
    JPanel panel_player_vs_bot;
    ImageIcon image;
    JLabel label;
    private int number_of_moves=0;
    //player vs player
    private boolean which_one = true;

    private Button[] buttons = new Button[9];
    MENU.ClickListener[] click = new MENU.ClickListener[9];
    MENU()
    {
        //PANEL
        panel_menu= new JPanel();
        panel_menu.setBounds(0,0,900,900);
        panel_menu.setBackground(Color.BLACK);
        panel_menu.setLayout(null);

        //Player vs Player
        player_vs_player = new JButton();
        player_vs_player.setText("Player vs Player");
        player_vs_player.setBounds(325,400,250,50);
        player_vs_player.setFont(new Font("Bahnschrift",Font.ITALIC,25));
        player_vs_player.setBackground(Color.WHITE);
        player_vs_player.setBorderPainted(false);
        player_vs_player.setForeground(Color.BLACK);


        button_listener_1 = new Button_Listener();
        player_vs_player.addActionListener(button_listener_1);

        panel_menu.add(player_vs_player);



        //icon
        image = new ImageIcon("xo.png");
        label = new JLabel();
        label.setIcon(image);
        label.setBounds(194,100,512,300);
        panel_menu.add(label);


        //player vs bot

        player_vs_bot = new JButton();
        player_vs_bot.setBounds(325,500,250,50);
        player_vs_bot.setText("Player vs Bot");
        player_vs_bot.setFont(new Font("Bahnschrift",Font.ITALIC,25));
        player_vs_bot.setBackground(Color.WHITE);
        player_vs_bot.setBorderPainted(false);
        player_vs_bot.setForeground(Color.BLACK);

        panel_menu.add(player_vs_bot);



        this.setSize(900,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel_menu);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public class Button_Listener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==player_vs_player)
            {
                setPanel_player_vs_player();
                System.out.println("Hello");
            }
        }
    }
    public void setPanel_player_vs_player()
    {
        panel_menu.setVisible(false);
        panel_player_vs_player = new JPanel();
        panel_player_vs_player.setBounds(0,0,900,900);

        Button.load_images();
        for(int i=0;i<9;i++)
        {
            click[i]=new MENU.ClickListener();
        }

        for(int i=0;i<9;i++) {
            buttons[i] = new Button();
            buttons[i].setBackground(Color.black);
            buttons[i].addActionListener(click[i]);
            panel_player_vs_player.add(buttons[i]);
        }

        panel_player_vs_player.setLayout(new GridLayout(3,3));
        this.add(panel_player_vs_player);
    }
    private class ClickListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

            //first horizontal
            //left diagonal
            //left vertical
            if(e.getSource()==buttons[0])
            {
                buttons[0].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[0].setEnabled(false);
                buttons[0].change_horizontal(which_one);
                buttons[0].change_left_diagonal(which_one);
                buttons[0].change_vertical(which_one);
                number_of_moves++;
            }
            //second vertical
            else if(e.getSource()==buttons[1])
            {
                buttons[1].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[1].setEnabled(false);
                buttons[0].change_horizontal(which_one);
                buttons[1].change_vertical(which_one);
                number_of_moves++;
            }
            //right diagonal
            //third vertical
            else if(e.getSource()==buttons[2])
            {
                buttons[2].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[2].setEnabled(false);
                buttons[2].change_right_diagonal(which_one);
                buttons[2].change_vertical(which_one);
                buttons[0].change_horizontal(which_one);
                number_of_moves++;
            }
            //second horizontal
            else if(e.getSource()==buttons[3])
            {
                buttons[3].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[3].setEnabled(false);
                buttons[0].change_vertical(which_one);
                buttons[3].change_horizontal(which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[4])
            {
                buttons[4].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[4].setEnabled(false);
                buttons[0].change_left_diagonal(which_one);
                buttons[1].change_vertical(which_one);
                buttons[2].change_right_diagonal(which_one);
                buttons[3].change_horizontal(which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[5])
            {
                buttons[5].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[5].setEnabled(false);
                buttons[3].change_horizontal(which_one);
                buttons[2].change_vertical(which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[6])
            {
                buttons[6].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[6].setEnabled(false);
                buttons[2].change_right_diagonal(which_one);
                buttons[0].change_vertical(which_one);
                buttons[6].change_horizontal(which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[7])
            {
                buttons[7].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[7].setEnabled(false);
                buttons[6].change_horizontal(which_one);
                buttons[1].change_vertical(which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[8])
            {
                buttons[8].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[8].setEnabled(false);
                buttons[6].change_horizontal(which_one);
                buttons[2].change_vertical(which_one);
                buttons[0].change_left_diagonal(which_one);
                number_of_moves++;
            }
            //left diagonal
            if(buttons[0].getLeft_diagonal()==3||buttons[0].getLeft_diagonal()==-3)
            {
                new Winner_Frame(which_one);
            }
            //first horizontal
            else if(buttons[0].getHorizontal()==3||buttons[0].getHorizontal()==-3)
            {
                //new frame winner
            }
            else if(buttons[0].getVertical()==3||buttons[0].getVertical()==-3)
            {

            }
            else if(buttons[1].getVertical()==3||buttons[1].getVertical()==-3)
            {

            }
            else if(buttons[2].getVertical()==3||buttons[2].getVertical()==-3)
            {
                //new frame
            }
            else if(buttons[2].getRight_diagonal()==3||buttons[2].getRight_diagonal()==-3)
            {

            }
            else if(buttons[3].getHorizontal()==3||buttons[3].getHorizontal()==-3)
            {

            }
            else if(buttons[6].getHorizontal()==3||buttons[6].getHorizontal()==-3)
            {

            }
            else if(number_of_moves==9)
            {
                new Winner_Frame();
            }
        }
    }


}

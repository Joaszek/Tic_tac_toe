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
    int []table;
    private int number_of_moves=0;
    Button_Listener button_listener_2;
    //player vs player
    private boolean which_one = true;

    private Button[] buttons = new Button[9];
    MENU.ClickListener[] click = new MENU.ClickListener[9];
    MENU.ClickListener_bot []click_bot= new ClickListener_bot[9];
    MENU()
    {
        //table
        table = new int[9];
        for(int i=0;i<9;i++)table[i]=0;
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

        button_listener_2 = new Button_Listener();
        player_vs_bot.addActionListener(button_listener_2);

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

            }
            else if(e.getSource()==player_vs_bot)
            {
                setPanel_player_vs_bot();

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
    public void setPanel_player_vs_bot()
    {
        panel_menu.setVisible(false);
        panel_player_vs_bot = new JPanel();
        panel_player_vs_bot.setBounds(0,0,900,900);
        Button.load_images();
        for(int i=0;i<9;i++)
        {
            click_bot[i]=new MENU.ClickListener_bot();
        }

        for(int i=0;i<9;i++) {
            buttons[i] = new Button();
            buttons[i].setBackground(Color.black);
            buttons[i].addActionListener(click_bot[i]);
            panel_player_vs_bot.add(buttons[i]);
        }
        //buttons[0].setAction();
        panel_player_vs_bot.setLayout(new GridLayout(3,3));
        this.add(panel_player_vs_bot);
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
                set_table(0, which_one);
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
                set_table(1, which_one);
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
                set_table(2, which_one);
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
                set_table(3, which_one);
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
                set_table(4, which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[5])
            {
                buttons[5].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[5].setEnabled(false);
                buttons[3].change_horizontal(which_one);
                buttons[2].change_vertical(which_one);
                set_table(5, which_one);
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
                set_table(6, which_one);
                number_of_moves++;
            }
            else if(e.getSource()==buttons[7])
            {
                buttons[7].setIcon(Button.set_Image(which_one));
                which_one = !which_one;
                buttons[7].setEnabled(false);
                buttons[6].change_horizontal(which_one);
                buttons[1].change_vertical(which_one);
                set_table(7, which_one);
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
                set_table(8 , which_one);
                number_of_moves++;
            }
            //left diagonal
            if(buttons[0].getLeft_diagonal()==3||buttons[0].getLeft_diagonal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            //first horizontal
            else if(buttons[0].getHorizontal()==3||buttons[0].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[0].getVertical()==3||buttons[0].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[1].getVertical()==3||buttons[1].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[2].getVertical()==3||buttons[2].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[2].getRight_diagonal()==3||buttons[2].getRight_diagonal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[3].getHorizontal()==3||buttons[3].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[6].getHorizontal()==3||buttons[6].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(number_of_moves==9)
            {
                menu_dispose();
                new Winner_Frame();
            }
        }
    }
    private void menu_dispose()
    {
        this.dispose();
    }
    private void set_table(int position, boolean which_one)
    {
        if(which_one)
        {
            table[position]=1;
        }
        else
        {
            table[position]=-1;
        }
    }
    private class ClickListener_bot implements ActionListener
    {
        int random;
        @Override
        public void actionPerformed(ActionEvent e)
        {

            //first horizontal
            //left diagonal
            //left vertical
            if(e.getSource()==buttons[0])
            {
                buttons[0].setIcon(Button.set_Image(true));
                buttons[0].setEnabled(false);
                buttons[0].change_horizontal(true);
                buttons[0].change_left_diagonal(true);
                buttons[0].change_vertical(true);
                set_table(0, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            //second vertical
            else if(e.getSource()==buttons[1])
            {
                buttons[1].setIcon(Button.set_Image(true));
                buttons[1].setEnabled(false);
                buttons[0].change_horizontal(true);
                buttons[1].change_vertical(true);
                set_table(1, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            //right diagonal
            //third vertical
            else if(e.getSource()==buttons[2])
            {
                buttons[2].setIcon(Button.set_Image(true));
                buttons[2].setEnabled(false);
                buttons[2].change_right_diagonal(true);
                buttons[2].change_vertical(true);
                buttons[0].change_horizontal(true);
                set_table(2, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            //second horizontal
            else if(e.getSource()==buttons[3])
            {
                buttons[3].setIcon(Button.set_Image(true));
                buttons[3].setEnabled(false);
                buttons[0].change_vertical(true);
                buttons[3].change_horizontal(true);
                set_table(3, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            else if(e.getSource()==buttons[4])
            {
                buttons[4].setIcon(Button.set_Image(true));
                buttons[4].setEnabled(false);
                buttons[0].change_left_diagonal(true);
                buttons[1].change_vertical(true);
                buttons[2].change_right_diagonal(true);
                buttons[3].change_horizontal(true);
                set_table(4, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            else if(e.getSource()==buttons[5])
            {
                buttons[5].setIcon(Button.set_Image(true));
                buttons[5].setEnabled(false);
                buttons[3].change_horizontal(true);
                buttons[2].change_vertical(true);
                set_table(5, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            else if(e.getSource()==buttons[6])
            {
                buttons[6].setIcon(Button.set_Image(true));
                buttons[6].setEnabled(false);
                buttons[2].change_right_diagonal(true);
                buttons[0].change_vertical(true);
                buttons[6].change_horizontal(true);
                set_table(6, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            else if(e.getSource()==buttons[7])
            {
                buttons[7].setIcon(Button.set_Image(true));
                buttons[7].setEnabled(false);
                buttons[6].change_horizontal(true);
                buttons[1].change_vertical(true);
                set_table(7, true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }
            else if(e.getSource()==buttons[8])
            {
                buttons[8].setIcon(Button.set_Image(true));
                buttons[8].setEnabled(false);
                buttons[6].change_horizontal(true);
                buttons[2].change_vertical(true);
                buttons[0].change_left_diagonal(true);
                set_table(8 , true);
                number_of_moves++;
                Node_2 move= new Node_2(false,table);
                System.out.println(move.getValue());
            }

            //checking win
            //left diagonal
            if(buttons[0].getLeft_diagonal()==3||buttons[0].getLeft_diagonal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            //first horizontal
            else if(buttons[0].getHorizontal()==3||buttons[0].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[0].getVertical()==3||buttons[0].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[1].getVertical()==3||buttons[1].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[2].getVertical()==3||buttons[2].getVertical()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[2].getRight_diagonal()==3||buttons[2].getRight_diagonal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[3].getHorizontal()==3||buttons[3].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(buttons[6].getHorizontal()==3||buttons[6].getHorizontal()==-3)
            {
                menu_dispose();
                new Winner_Frame(which_one);
            }
            else if(number_of_moves==9)
            {
                menu_dispose();
                new Winner_Frame();
            }
        }
    }


}

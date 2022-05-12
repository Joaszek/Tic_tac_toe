import java.util.Random;

public class Bot {
    int []table;
    boolean which_one;
    boolean win=true;


    private boolean isWin()
    {
        if(table[0]==table[1]&&table[0]==table[2])return true;
        else if(table[3]==table[4]&&table[3]==table[5])return true;
        else if(table[6]==table[7]&&table[6]==table[8])return true;
        else if(table[0]==table[3]&&table[0]==table[6])return true;
        else if(table[1]==table[4]&&table[1]==table[7])return true;
        else if(table[2]==table[5]&&table[2]==table[8])return true;
        else if(table[0]==table[4]&&table[0]==table[8])return true;
        else if(table[2]==table[4]&&table[2]==table[6])return true;
        else
        {
            return false;
        }
    }
}

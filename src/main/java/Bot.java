public class Bot {
    int []table;
    boolean which_one;
    boolean win=true;
    Bot(int []table, boolean which_one)
    {
        this.table = table;
        this.which_one= which_one;
    }
    //true -x
    //false - o
    private int return_position()
    {
        while(win)
        {
            for(int i=0;i<9;i++)
            {
                if(table[i]==0)
                {
                    if(which_one)
                    {
                        table[i]=1;
                        which_one=!which_one;
                        win=!isWin();
                        return_position();
                    }
                    else if(!which_one)
                    {
                        table[i]=-1;
                        which_one=!which_one;
                        win=!isWin();
                        return_position();
                    }
                }
            }
        }
        return 0;
    }

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

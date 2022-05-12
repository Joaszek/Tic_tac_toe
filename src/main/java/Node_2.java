public class Node_2 {

    Node_2[] children;
    boolean which_one;
    int[] table;
    int value;
    int[] child_field;
    Node_2(boolean which_one, int []table)
    {
        this.which_one=which_one;
        this.table=table;
    }
    //check is somebody is winning
    private static boolean is_win(int [] table)
    {
        if(table[0]== table[1]&& table[0]== table[2])return true;
        else if(table[3]== table[4]&& table[3]== table[5])return true;
        else if(table[6]== table[7]&& table[6]== table[8])return true;
        else if(table[0]== table[3]&& table[0]== table[6])return true;
        else if(table[1]== table[4]&& table[1]== table[7])return true;
        else if(table[2]== table[5]&& table[2]== table[8])return true;
        else if(table[0]== table[4]&& table[0]== table[8])return true;
        else if(table[2]== table[4]&& table[2]== table[6])return true;
        else
        {
            return false;
        }
    }
    //check if there is a draw
    private static  boolean is_draw(int []table)
    {
        for(int i=0;i<9;i++)
        {
            if(table[i]==0)
            {
                return false;
            }
        }
        return true;
    }
    private int[] copy_field()
    {
        int[] tab_2 = new int[9];
        for(int i=0;i<9;i++)
        {
            tab_2[i]=table[i];
        }
        return tab_2;
    }
    public int bot()
    {
        if(Node_2.is_win(table))
        {
            value = which_one?1:-1;
            return value;
        }
        else if(Node_2.is_draw(table))
        {
            value=0;
            return value;
        }
        value = which_one?1:-1;
        for(int i=0;i<9;i++)
        {
            if(table[i]==0)
            {
                child_field=copy_field();
                child_field[i]=which_one?1:-1;
                children[i]=new Node_2(!which_one, child_field);
                value = which_one? Math.min(value,children[i].bot()):Math.max(value,children[i].bot());
            }
        }
        return value;
    }
    public Node_2 getValue()
    {
        for(int i=0;i<9;i++)
        {
            if(children[i]!=null&&children[i].value==value)
            {
                return children[i];
            }
        }
        return null;
    }
}

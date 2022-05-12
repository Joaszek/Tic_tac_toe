public class Node {
/*
    //table to keep the field
    int[][] field = new int[3][3];

    Node[][] children = new Node[3][3];

    int value;
    boolean isMin;

    public Node(int[] table, boolean isMin, int[][] field)
    {
        this.isMin = isMin;
        this.field=field;
        setField(table);
    }

    private void setField(int[] table)
    {
        int a=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                field[i][j]=table[a];
                a++;
            }
        }
    }
    int[][] copyField() {
        int[][] copied = new int[3][3];
        for (int i = 0; i < copied.length; i++) {
            for (int j = 0; j < copied[i].length; j++) {
                copied[i][j] = field[i][j];
            }
        }
        return copied;
    }

    public int learn() {
        if (Node.hasWon(field)) {
            value = isMin ? 1 : -1;
            return  value;
       } else if (TicTacToe.fieldFull(field)) {
            value = 0;
            return value;
        }

      value = isMin ? 1 : -1;

        for (int i = 0; i < children.length; i++) {
            for (int j = 0; j < children[i].length; j++) {

                if (field[i][j] == 0) {
                    int[][] childField = copyField();
                    childField[i][j] = isMin ? 1 : 2;

                    children[i][j] = new Node(childField, !isMin);

                    value = isMin ? Math.min(value, children[i][j].learn()) : Math.max(value, children[i][j].learn());

                }
            }
        }

        return value;
    }

    public Node getChildWithValue() {

        for (int i = 0; i < children.length; i++) {
            for (int j = 0; j < children[i].length; j++) {
                if (children[i][j] != null && children[i][j].value == value) {
                    return children[i][j];
                }
            }
        }
        return null;
    }
    //przerobic sprawdzanie algorytmu
    private boolean isWin()
    {
        if(field[0]==field[1]&&field[0]==field[2])return true;
        else if(field[3]==field[4]&&field[3]==field[5])return true;
        else if(field[6]==field[7]&&field[6]==field[8])return true;
        else if(field[0]==field[3]&&field[0]==field[6])return true;
        else if(field[1]==field[4]&&field[1]==field[7])return true;
        else if(field[2]==field[5]&&field[2]==field[8])return true;
        else if(field[0]==field[4]&&field[0]==field[8])return true;
        else if(field[2]==field[4]&&field[2]==field[6])return true;
        else
        {
            return false;
        }
    }*/
}

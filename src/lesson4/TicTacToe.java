package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static int size = 3;
    //static String[][] gameField = {{"o", "x", "o","o"}, {"o", "x", "x","o"}, {"-", "x", "x","o"},{"o","-","o","x"}};
    static String[][] gameField = new String[size][size];
    static String currentStep;
    static String currentPlayerSign="x";
    static int currentPlayer = 1;
    static int winLine = 3;
    static String gameStatus;
    static String winner;
    static int lastX;
    static int lastY;
//static String[][]= {{"-","-","-"},{"-","-","-"},{"-","-","-"}};


    public static void main(String[] args) {
        initGameField();
        startGame();
        renderGameField();
//aiBlock();
    }


    public static void initGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = "-";
            }
        }
    }

    public static void renderGameField() {
        for (int i = 0; i < gameField.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j]);

            }

        }
    }

    public static void startGame() {

        renderGameField();
        humanTurn();
        //aiTurn();
        renderGameField();
        if(checkWin(lastY,lastX,currentPlayerSign)){
            System.out.println();
            System.out.println("Победил игрок "+currentPlayerSign);
            return;
        }
        changePlayer();
        System.out.println();
        renderGameField();
        aiTurn();
        renderGameField();
        if(checkWin(lastY,lastX,currentPlayerSign)){
            System.out.println("Победил игрок "+currentPlayerSign);
            return;}
       // renderGameField();
        changePlayer();
        startGame();
    }

    public static void aiTurn()
    {
        String b=aiBlock();
        if(b=="none"){
            currentStep=aiRandomTurn();
            if (currentStep=="Нет свободных клеток") {
                System.out.println();
                System.out.println("Ничья!");
                lastX=-1;
                lastY=-1;
            }
            int x, y;
            String[] steps = new String[2];
            steps = currentStep.split("");
            x = Integer.parseInt(steps[0]);
            y = Integer.parseInt(steps[1]);
            gameField[x][y] = currentPlayerSign;
            lastX=x;
            lastY=y;

    }
        else {
            currentStep = aiBlock();
            String[] steps = new String[2];
            steps = currentStep.split("");
            int x = Integer.parseInt(steps[0]);
            int y = Integer.parseInt(steps[1]);
            gameField[x][y] = currentPlayerSign;
            lastX=x;
            lastY=y;
        }
    }

public static void humanTurn() {
    System.out.println("Введите координаты хода через пробел x y");
    Scanner stepQuery = new Scanner(System.in);
    currentStep = stepQuery.nextLine();
    int x, y;
    String[] steps = new String[2];
    steps = currentStep.split("");
    x = Integer.parseInt(steps[0]);
    y = Integer.parseInt(steps[1]);
    if (isBusyCell(x, y)) {
        System.out.println("Клетка занята");
        humanTurn();
    }
    else {
        gameField[x][y] = currentPlayerSign;
        lastX=x;
        lastY=y;
    }


}



    public static boolean isBusyCell(int x, int y) {
        return gameField[x][y] != "-";
    }

    public static void changePlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
        currentPlayerSign=(currentPlayer==1)?"x":"o";
    }

    public static boolean checkWin(int _y, int _x,String player ) {
        if(_y==-1) System.out.println("ничья!");
        if(checkVertical(_y,_x,player)) return true;
        if(checkDiagonal1(_y,_x,player)) return true;
        if(checkDiagonal2(_y,_x,player)) return true;
        if(checkHorizontal(_y,_x,player)) return true;
        else return false;


    }

    public static boolean checkHorizontal(int _y, int _x, String player) {

        System.out.println();
        int count = 1;
        int x = _y;
        int y = _x;
        int z = 1;
        int q = 1;
        for (int i = 0; i < gameField.length; i++) {

            if((x + z) < gameField.length)
            {
                if (gameField[y][x + z] == player)
                {
                //System.out.println("field[y][x+z]" + gameField[x + z][0]);
                count++;
                z++;
                }
            }
            if((x - q) >= 0)
            {
             if (gameField[y][x - q] == player)
                {
               // System.out.println("field[y][x - q]" + gameField[x + z][0]);
                count++;
                q++;
                }
            }

        }
        //System.out.println(count+ " по горизонтали ");
        if (count == winLine) return true;
        else
            return false;
    }

    public static boolean checkVertical(int _y, int _x,String player) {
        //String[][] field = {{"o", "o", "o"}, {"x", "o", "x"}, {"o", "o", "x",}};
        int count = 1;
        int x = _y;
        int y = _x;
        int z = 1;
        int q = 1;
        for (int i = 0; i < gameField.length; i++) {
            if((y + z) < gameField.length)
            {
                if (gameField[y + z][x] == player)
                {

                count++;
                z++;
                }
            }
            if((y - q) >= 0 )
            {
             if ( gameField[y - q][x] == player)
                {
                    count++;
                    q++;
                }
            }
        }
        //System.out.println(count);
        if (count == winLine) return true;
        else
            return false;
    }

    public static boolean checkDiagonal1(int _y, int _x,String player) {


        int count = 1;
        int x = _y;
        int y = _x;
        int z = 1;
        int q = 1;
        for (int i = 0; i < gameField.length; i++) {

            if(y-z>=0&&x+z< gameField.length){
            if(gameField[y-z][x+z]==player)
            {
                count++;
                z++;
            }
        }
            if(y+q<gameField.length&&x-q>=0)
            {
                if(gameField[y+q][x-q]==player)
                {
                count++;
                q++;
                }
            }

        }
        if (count == winLine) return true;
        else
            return false;
    }
    public static boolean checkDiagonal2(int _y, int _x, String player) {

        //System.out.println("проверка диагонали2");
        //String[][] gameField = {{"-", "o", "o","o"}, {"o", "x", "o","o"}, {"o", "o", "x","o"},{"o","o","o","x"}};




        int count = 1;
        int x = _y;
        int y = _x;
        int z = 1;
        int q = 1;
        for (int i = 0; i < gameField.length; i++) {
            //step= 1 1
            if(y-z>=0&&x-z>=0) {

                if ( gameField[y - z][x - z] == player) {
                    count++;
                    z++;
                    //System.out.println(gameField[y - z][x - z]);
                }
            }
             if(y+q<gameField.length&&x+q< gameField.length)
             {
                if (gameField[y + q][x + q] == player)
                {
                    count++;
                    q++;
                }
            }
        }
        //System.out.println(count);
        if (count == winLine) return true;
        else
            return false;
    }

    public static String aiBlock(){
        String enemy=(currentPlayerSign=="x")?"o":"x";
        for(int i=0; i<gameField.length;i++ ){
            for (int j = 0; j < gameField.length; j++)
                {
                    if(!isBusyCell(i,j)) {
                        if (checkWin(j, i, enemy)) {
                            System.out.println(i + "" + j);
                            System.out.println(currentPlayerSign + " сходил " + i + "" + j);
                            return i + "" + j;
                        }

                    }else continue;
            }
        }
        //System.out.println("");
        return "none";
    }
    public static String aiRandomTurn() {
        int j=0;
        int i=0;
        int t=0;
        Random rand = new Random();
        for (int k = 0; k < gameField.length; k++) {
            for (int l = 0; l < gameField.length; l++) {

                if (gameField[k][l] == "-")
                    t++;

            }}
            if (t == 0) {
                return "Нет свободных клеток";
            } else return getRandom();

        }
    public static String getRandom()
    {
        Random rand = new Random();
        int j=0;
        int i=0;
        do {
            System.out.println("while");
            j = rand.nextInt(size );
            i = rand.nextInt(size );
        }
        while(isBusyCell(i, j));
        //if(!isBusyCell(i, j))
            return i+""+j ;
        //else return ;
    }

}
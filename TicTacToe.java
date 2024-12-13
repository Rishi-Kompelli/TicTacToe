import java.util.Scanner;
public class TicTacToe {
    Scanner scanner = new Scanner(System.in);

    final int dimension = 3;
    String board[][] = new String[dimension][dimension];

    Player player1;
    Player player2;
    Player activePlayer;

    public static void main(String[] args) {
        TicTacToe Game = new TicTacToe();
        Game.StartGame();
        Boolean done = false;
        while (!done){
            Game.Turn();
            Game.PrintBoard();
            done = Game.gameOver();
        }
        
    }
    public void StartGame(){
        System.out.println("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.println("Enter Player 1 Symbol: ");
        String player1Symbol = scanner.nextLine();
        player1 = new Player(player1Name, player1Symbol);
        System.out.println(player1.toString());

        System.out.println("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        System.out.println("Enter Player 2 Symbol: ");
        String player2Symbol = scanner.nextLine();
        player2 = new Player(player2Name, player2Symbol);
        System.out.println(player2.toString());
    }
    public void Turn(){
        if (activePlayer != player1){
            activePlayer = player1;
        }
        else{
            activePlayer = player2;
        }
        Boolean validmove = false;
        while (!validmove){
            System.out.println("Enter the x-coordinate");
            int movex = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the y-coordinate"); 
            int movey = Integer.parseInt(scanner.nextLine());
            String movespace = board[movex][movey];
            validmove = (movespace != player1.getSymbol())&&(movespace != player2.getSymbol());
            if (validmove){
                board[movex][movey] = activePlayer.getSymbol();
           }
        }
    }
    public void PrintBoard() {
        for (int i = 0; i<dimension; i++){
            System.out.println();
            for (int j = 0; j<3; j++) {
                System.out.print(board[i][j]+" ");
            }
        }
    }
    public boolean gameOver() {
        for (int i = 0; i < dimension; i++) {
            if (checkLine(board[i][0], board[i][1], board[i][2]) || 
                checkLine(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        if (checkLine(board[0][0], board[1][1], board[2][2]) || 
            checkLine(board[0][2], board[1][1], board[2][0])) {
            return true;
        }
        boolean draw = true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (board[i][j].equals("-")) {
                    draw = false;
                    break;
                }
            }
        }
        if (draw) {
            System.out.println("It's a draw!");
            System.exit(0);
        }

        return false;
    }

    private boolean checkLine(String a, String b, String c) {
        return !a.equals("-") && a.equals(b) && b.equals(c);
    }
}
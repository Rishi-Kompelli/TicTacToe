import java.util.Scanner;
public class TicTacToe {
    Scanner scanner = new Scanner(System.in);

    final int dimension = 2;
    String board[][] = new String[dimension][dimension];

    Player player1;
    Player player2;
    Player activePlayer;

    public static void main(String[] args) {
        TicTacToe Game = new TicTacToe();
        Game.StartGame();
        // checks win
        Boolean done = false;
        while (!done){
            Game.Turn();
            Game.PrintBoard();
            done = Game.GameOver();
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
    public Boolean GameOver(){
        return false;
    }
}
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.println("Enter Player 1 Symbol: ");
        String player1Symbol = scanner.nextLine();
        Player player1 = new Player(player1Name, player1Symbol);
        System.out.println(player1.toString());

        System.out.println("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        System.out.println("Enter Player 2 Symbol: ");
        String player2Symbol = scanner.nextLine();
        Player player2 = new Player(player2Name, player2Symbol);
        System.out.println(player2.toString());

        Player activePlayer = player1;

        String board[][] = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };

        /* 
        create a turn system
        be able to write on the board on your turn
        */
        printBoard(board);

        scanner.close();
    }
    public static void printBoard(String[][] board) {
        for (int i = 0; i<3; i++){
            System.out.println();
            for (int j = 0; j<3; j++) {
                System.out.print(board[i][j]+" ");
            }
        }
    }
}
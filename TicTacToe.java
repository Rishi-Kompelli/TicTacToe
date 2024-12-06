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

        String board[][] = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };

        

        scanner.close();
    }
}
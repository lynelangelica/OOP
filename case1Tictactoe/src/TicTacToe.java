import java.util.*;

public class TicTacToe {
    public Board board;
    public Player player1, player2;
    public Player currentPlayer;
    public Scanner scan;

    public TicTacToe() {
        board = new Board();
        player1 = new Player('O');
        player2 = new Player('X');
        currentPlayer = player1;
        scan = new Scanner(System.in);
    }

    public void startGame() {
        do{
            board.printBoard();
            int x, y;
            do {
                System.out.print("Player " + currentPlayer.getSymbol() + " move (x y): ");
                x = scan.nextInt();
                y = scan.nextInt();
            } while (!board.makeMove(x, y, currentPlayer.getSymbol()));

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }

            else if (board.isFull()) {
                board.printBoard();
                System.out.println("Draw!");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }while(true);
    }
}
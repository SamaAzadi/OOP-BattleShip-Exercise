import java.util.Scanner;
public class Game {
    Player player1 = new Player();
    Player player2 = new Player();

    public void gameStart(){
        boolean player1Turn = true;

        while (!(Player.isGameOver(player1.getPlayerGrid().getGrid(),player2.getPlayerGrid().getGrid()))) {
            if (player1Turn) {
                System.out.println("Player 1's turn:");
                Board.printGrid(player1.getPlayerTrackingGrid().getGrid());
                Player.playerTurn(player2.getPlayerGrid().getGrid(), player1.getPlayerTrackingGrid().getGrid());
            } else {
                System.out.println("Player 2's turn:");
                Board.printGrid(player2.getPlayerTrackingGrid().getGrid());
                Player.playerTurn(player1.getPlayerGrid().getGrid(), player2.getPlayerTrackingGrid().getGrid());
            }
            player1Turn = !player1Turn;
        }

        System.out.println("Game Over!");
    }
}

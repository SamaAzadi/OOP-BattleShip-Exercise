import java.util.Scanner;
public class Player {
    private Board playerTrackingGrid;
    private Board playerGrid = new Board();

    public Player(){
    playerTrackingGrid = new Board();
    Ship.placeShips(playerGrid.getGrid());
    }

    public Board getPlayerTrackingGrid() {
        return playerTrackingGrid;
    }

    public Board getPlayerGrid() {
        return playerGrid;
    }
    static boolean isGameOver(char[][] player1Grid,char[][] player2Grid) {
        if(Ship.allShipsSunk(player1Grid)){
            System.out.print("Player1 ");
            return true;
        } else if (Ship.allShipsSunk(player2Grid)) {
            System.out.print("Player2 ");
            return true;
        }else return false;
    }
    public static void playerTurn(char[][] opponentGrid, char[][] trackingGrid) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target:");
        String target = scanner.nextLine();
        if(Utils.isValidInput(target)){
            int col = target.charAt(0) - 'A';
            int row = target.charAt(1) - '0';
            if(opponentGrid[row][col] == '~'){
                trackingGrid[row][col] = '0';
                System.out.println("Miss!");
            }else{
                trackingGrid[row][col] = 'X';
                opponentGrid[row][col] = 'H';
                System.out.println("Hit!");
            }

        }else{
            System.out.println("Invalid input,try again.");
        }
    }
}
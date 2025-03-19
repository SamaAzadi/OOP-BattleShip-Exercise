import java.util.Random;
public class Ship {

    public static char[][] placeShips(char[][] grid) {
        Random rand = new Random();

        for(int size = 2 ; size <= 5 ; size++){
            boolean horizontal = false;
            int end = 0;
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            if(rand.nextBoolean())
            {
                horizontal = true;
            }
            while(true){
                if(Utils.canPlaceShip( grid , row , col , size , horizontal))
                {
                    for (int i = 1; i <= size ; i++) {
                        if(horizontal)
                        {
                            grid[row][col] = '*';
                            row++;
                        }else{
                            grid[row][col] = '*';
                            col++;
                        }
                    }
                    end = 1;
                }else{
                    row = rand.nextInt(10);
                    col = rand.nextInt(10);
                    end = -1;
                }
                if(end == 1) break;
            }
        }
        return grid;
    }
    static boolean allShipsSunk(char[][] grid) {
        boolean allShipsSunk = true;
        for(int i=0;i< grid.length;i++)
            for(int j=0;j< grid.length;j++)
            {
                if(grid[i][j] == '*')
                {
                    allShipsSunk = false;
                }

            }
        return allShipsSunk;
    }
}

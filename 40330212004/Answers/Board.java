public class Board {
    private final int GRID_SIZE = 10;
    private char[][] grid = new char[GRID_SIZE][GRID_SIZE];

    Board(){
        initializeGrid(grid);
    }

    private char[][] initializeGrid(char[][] grid){
        for(int i=0;i< grid.length;i++)
            for(int j=0;j< grid.length;j++)
            {
                grid[i][j] = '~';
            }
        return grid;
    }

    public char[][] getGrid() {
        return grid;
    }
    public static void printGrid(char[][] grid) {
        System.out.println("  A B C D E F G H I J");
        for(int i=0;i< grid.length;i++){
            System.out.print(i);
            for(int j=0;j< grid.length;j++)
            {
                System.out.print(" ");
                System.out.print(grid[i][j]);
            }
            System.out.println();}

    }

}
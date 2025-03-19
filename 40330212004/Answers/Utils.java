public class Utils {
    public static boolean canPlaceShip(char[][] grid, int row, int col, int size, boolean horizontal) {
        int counter = 0;

        if(horizontal)
        {
            if(row + size <= 9) {
                for (int i = 0; i < size; i++) {
                    if (grid[row + i][col] == '~') {
                        counter++;
                    }
                }
            }
        }else{
            if(col + size <= 9) {
                for (int i = 0; i < size; i++) {
                    if (grid[row][col + i] == '~') {
                        counter++;
                    }
                }
            }
        }
        if(counter == size){
            return true;
        }else return false;
    }
    static boolean isValidInput(String input) {
        if (input.length() == 2 && input.charAt(0) >= 'A' && input.charAt(0) <= 'J'
                && input.charAt(1) >= '0' && input.charAt(1) <= '9') {
            return true;
        }else return false;
    }
}

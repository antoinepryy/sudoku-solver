import java.util.Arrays;

public class Grid {
    private Square[] grid ;
    private int size;

    public Grid(int size){
        this.size = size;
        this.grid = new Square[size];
        for (int i =0; i<size; i++){
            this.grid[i] = new Square(size);
        }


    }

    public Square[] getGrid() {
        return grid;
    }

    public Square getSquare(int i){
        return this.grid[i];
    }

    public int[] getHLine(int i){
        int len = (int) Math.sqrt(this.size);
        int squareLine = i % len;
        int[] line = new int[this.size];
        for (int j = 0; j<len; j++){
            int[] partOfLine = this.getSquare(squareLine * len + j).getHLine(squareLine);
            System.arraycopy(partOfLine, 0, line, j*len, len);
        }
        return line;
    }

    public int[] getVLine(int i){
        int len = (int) Math.sqrt(this.size);
        int squareLine = i % len;
        int[] line = new int[this.size];
        for (int j = 0; j<len; j++){
            int[] partOfLine = this.getSquare(squareLine + j*len).getVLine(squareLine);
            System.arraycopy(partOfLine, 0, line, j*len, len);
        }
        return line;
    }

    public void populateFromFile(String path){

    }

    public void displayGrid(){
        for (int i = 0; i<this.size; i++){
            System.out.println(Arrays.toString(this.getHLine(i)));
        }
    }

}

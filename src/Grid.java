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
        return new int[]{0};
    }

    public int[] getVline(int i){
        return new int[]{0};
    }

    public void populateFromFile(String path){

    }

    public void displayGrid(){
        for (int i = 0; i<this.size; i++){
            System.out.println(Arrays.toString(this.getHLine(i)));
        }
    }

}

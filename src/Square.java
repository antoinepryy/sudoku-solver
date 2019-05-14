import java.util.Arrays;

public class Square {
    private int[] square;
    private int size;

    Square(int size) {
        this.size = size;
        this.square = new int[size];
    }

    public int getCell(int i){
        if (i<this.size) return this.square[i];
        else throw new ArrayIndexOutOfBoundsException();
    }

    public void setCell(int index, int nbr){
        if (index<this.size) this.square[index] = nbr;
        else throw new ArrayIndexOutOfBoundsException();
    }

    public int[] getHLine(int i){
        int len = (int) Math.sqrt(this.size);
        int[] line = new int[len];
        for (int j = 0; j<len; j++){
            line[j] = this.square[i*len + j];
        }
        return line;

    }

    public int[] getVLine(int i){
        int len = (int) Math.sqrt(this.size);
        int[] line = new int[len];
        for (int j = 0; j<len; j++){
            line[j] = this.square[j*len + i];
        }
        return line;
    }

    public String displaySquare(){
        return Arrays.toString(this.square);
    }


}

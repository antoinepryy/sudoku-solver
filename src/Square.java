import java.util.Arrays;

public class Square {
    private int[] square;
    private int size;

    Square(int size, int n) {
        this.size = size;
        this.square = new int[size];
        for(int i = 0; i<size; i++) this.square[i] = n;
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

    public void setHLine(int i, int[] line){
        int len = (int) Math.sqrt(this.size);
        if(line.length == len){
            for (int j = 0; j<len; j++){
                this.square[i*len + j] = line[j];
            }
        }
        else throw new ArrayIndexOutOfBoundsException("Invalid line size");
    }

    public int[] getVLine(int i){
        int len = (int) Math.sqrt(this.size);
        int[] line = new int[len];
        for (int j = 0; j<len; j++){
            line[j] = this.square[j*len + i];
        }
        return line;
    }

    public void setVLine(int i, int[] line){
        int len = (int) Math.sqrt(this.size);
        if (line.length == len){
            for (int j = 0; j<len; j++){
                this.square[j*len + i] = line[j];
            }
        }
        else throw new ArrayIndexOutOfBoundsException("Invalid line size");

    }

    public String displaySquare(){
        return Arrays.toString(this.square);
    }


}

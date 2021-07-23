package hw2_02;

public class MyArrayDataException extends NumberFormatException {
    int i;
    int j;

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
    // Fields:
    char[][] m;  // this is the grid (always in a single code '')  ...m[r][c]='x';

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill  character
     */
    public CharMatrix(int rows, int cols, char fill) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, fill);
    }

    /*
     * Returns the number of rows in grid (m)
     */
    public int numRows() {
        return m.length; //
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols() {
        return m[0].length; //
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public char charAt(int row, int col){
        return m[row][col];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int row, int col, char ch) {
        m[row][col]=ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE ' ',
     * false otherwise
     */
    public boolean isEmpty(int row, int col) {
        if(m[row][col]==' ') return true;
        else return false;
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     * inclusive
     */
    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for(int r = row0; r<=row1; r++){

            for(int c = col0; c<=col1;c++){
                m[r][c]=fill;

            }

        }

    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
    inclusive! */
    public void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0,col0,row1,col1,' ');
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row) {
        int countx = 0; 
        for(int c = 0; c<m[0].length; c++){
            if(m[row][c]!=' '){
                countx++;
            }

        }
        return countx;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col) {
        int county = 0; 
        for(int r = 0; r<m.length; r++){
            if(m[r][col]!=' '){
                county++;
            }

        }
        return county;
    }

    /*
     * Displays the contents of the matrix m
     */
    public void display () {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');
        //Row~
        System.out.println("Number of rows : " + matrix.numRows());
        //Column~
        System.out.println("Number of columns : " + matrix.numCols());
        //charAt~
        System.out.println("Char at (2,3) is : " + matrix.charAt(2,3));
        //setCharAt~
        System.out.println("Testing setCharAt(2,3) ...");
        System.out.println("m before method call:");
        matrix.display();
        matrix.setCharAt(2,3,' ');
        System.out.println("m after method call:");
        matrix.display();
        //isEmpty~
        System.out.println("Testing isEmpty at (2,3) : " + matrix.isEmpty(2,3));
        System.out.println("Testing isEmpty at (1,2) : " + matrix.isEmpty(1,2));
        //FillRect~
        System.out.println("Testing fillRect(0,0,1,1)...");
        System.out.println("m before method call:");
        matrix.display();
        matrix.fillRect(0,0,1,1,'k');
        System.out.println("m after method call:");
        matrix.display();
        //ClearRect~
        System.out.println("Testing clearRect(0,3,2,3)...");
        System.out.println("m before method call:");
        matrix.display();
        matrix.clearRect(0,3,2,3);
        System.out.println("m after method call:");
        matrix.display();
        //countInRow~
        System.out.println("Testing countInRow(0)...");
        System.out.println("Row contains no space: " + matrix.countInRow(0));
        //countInColumn~
        System.out.println("Testing countInColumn(0)...");
        System.out.println("Column contains no space: " + matrix.countInCol(0));
    }

}



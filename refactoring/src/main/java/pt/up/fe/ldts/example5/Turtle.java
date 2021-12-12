package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void execute(char command) {


        switch (command) {
            case 'L':
                rotateLeft();
                break;
            case 'R':
                rotateRight();
                break;
            case 'F':
                moveForward();
                break;
        }
    }

    private void rotateLeft() {

        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'E':
                direction = 'N';
                break;
        }
    }

    private void rotateRight() {

        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'E':
                direction = 'S';
                break;
        }
    }

    private void moveForward() {

        switch (direction) {
            case 'N':
                row--;
                break;
            case 'S':
                row++;
                break;
            case 'W':
                column--;
                break;
            case 'E':
                column++;
                break;
        }
    }
}

//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address


package Problem2;

public class MyPoint {

    private int x;
    private int y;

    // default constructor here

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // parameterized constructor

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;


    }

//getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // this was tricky I forgot entering the parameter area "int x"
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // now to string here

    public double distance(MyPoint source) {
        return Math.sqrt(Math.pow(source.x - this.x, 2) + Math.pow(source.y - this.y, 2));
    }

    // did not have correct and have to add this last second
    // handler to  check if points are equal
    // was returning false every time
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyPoint) {
            MyPoint other = (MyPoint) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }
}


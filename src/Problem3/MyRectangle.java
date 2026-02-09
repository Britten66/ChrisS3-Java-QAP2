
//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address

package Problem3;

//importing
import Problem2.MyPoint;



public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructor here

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = new MyPoint(topLeft.getX(), topLeft.getY());
        this.bottomRight = new MyPoint(bottomRight.getX(), bottomRight.getY());
    }



    //getters


    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    //calculating here

    public int getWidth(){
        return bottomRight.getX() - topLeft.getX();
    }

    public int getHeight(){
        return topLeft.getY() - bottomRight.getY();
    }

    public int getArea(){
        return getWidth() * getHeight();
    }

    public int getPerm(){
        return 2 * (getWidth() + getHeight());

    }
    //printing out here

    public String toString(){
        return "Rectangle From Point: " + topLeft + " to " + bottomRight;
    }
}

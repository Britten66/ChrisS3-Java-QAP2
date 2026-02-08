package Problem2;

public class MyPoint {

    private int x;
    private int y;

    // default constructor here

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    // parameterized constructor

    public MyPoint(int x, int y ) {
        this.x = x;
        this.y = y;


    }

//getters

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // this was tricky I forgot entering the parameter area "int x"
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    // now to string here

    public double distance(MyPoint source){
        return Math.sqrt(Math.pow(source.x - this.x, 2 ) + Math.pow(source.y - this.y, 2 ));
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}



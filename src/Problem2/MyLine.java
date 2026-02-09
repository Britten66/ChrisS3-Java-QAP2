
package Problem2;

public class MyLine {


    private MyPoint begin;
    private MyPoint end;


    // constructor here

    // ended up missing closing smooth bracket and it took a while without realizing

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = new MyPoint(begin.getX(), begin.getY());
        this.end = new MyPoint(end.getX(), end.getY());

    }

    // getters

    public MyPoint getBegin(){
        return begin;
    }

    public MyPoint getEnd(){
        return end;
    }

    public void setBegin(MyPoint begin){
        this.begin = begin;
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }


    public double getLength(){

        return begin.distance(end);
    }

    // to string hre

    public String toString(){
        return "Line from " + begin + " to " + end;
    }
}



//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address


package Problem4;


import Problem2.MyPoint;

public class MyCircle {

    private MyPoint center;

    private int radius;

    //parameterized constructor with a copy constructor inside
    public MyCircle(MyPoint center, int radius){

        this.center = new MyPoint(center.getX(), center.getY());
        this.radius = radius;

    }

    public MyPoint getCenter(){
        return center;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Fountain is at:  " + center + " with radius: " + radius;
    }

}


//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address

package Problem3;
//importing
import Problem2.MyPoint;


public class MyRectangleTest {

    public static void main(String[] args) {
        MyPoint s1 = new MyPoint(0, 10);
        MyPoint s2 = new MyPoint(5, 0);

        MyRectangle rec = new MyRectangle(s1,s2);

        System.out.println(rec);
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerm());
    }


}

package Problem2;


public class MyLineTest {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);


        MyLine line = new MyLine(p1, p2);

        // printing out here

        System.out.println("Length: " + line.getLength());
        System.out.println("Begins with: " + line.getBegin());
        System.out.println("Ends With: " + line.getEnd());
    }


}

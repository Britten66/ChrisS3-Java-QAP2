
//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address


package Problem4;

import Problem2.MyPoint;
import Problem2.MyLine;
import Problem3.MyRectangle;
import java.util.ArrayList;
public class CampusMap {


    private ArrayList<MyRectangle> building;
    private ArrayList<MyLine> walkway;
    private ArrayList<MyCircle> fountains;

    public CampusMap() {
        building = new ArrayList<>();
        walkway = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    public void addBuilding(MyRectangle newBuilding) {
        building.add(newBuilding);

    }

    public void addFountain(MyCircle newFountain) {
        fountains.add(newFountain);
    }

    //this is going to be using a parameterized constructor
    public void addWalkway(MyRectangle from, MyRectangle to) {

        //both buuilding need to exist for walkway to be present

        //handler here for connecting walkway to buildings

        if (!building.contains(from) || !building.contains(to)) {
            System.out.println("Err - Building has no connecting walkway ");
            return;

        }

        // finding the center of each building

        MyPoint fromCenter = getCenter(from);
        MyPoint toCenter = getCenter(to);

        // here we create the walkway

        MyLine newWalkway = new MyLine(fromCenter, toCenter);
        walkway.add(newWalkway);
    }

    // method for the center of rectangle class - this will in theory get the center of buildings on campus

    private MyPoint getCenter(MyRectangle rec) {
        int centerX = (rec.getTopLeft().getX() + rec.getBottomRight().getX()) / 2;
        int centerY = (rec.getTopLeft().getY() + rec.getBottomRight().getY())/ 2;

        return new MyPoint(centerX, centerY);


    }


    public double fountainArea() {
        double total = 0;
        for (MyCircle fountain : fountains) {
            total += fountain.getArea();
        }
        return total;
    }


    public boolean isWalkway(MyRectangle from, MyRectangle to) {
        MyPoint fromCenter = getCenter(from);
        MyPoint toCenter = getCenter(to);

        //for loop handler with if statnment

        for (MyLine w : walkway) {
            if (w.getBegin().equals(fromCenter) && w.getEnd().equals(toCenter)) {
                return true;
            }
        }
        return false;
    }


    public double walkwayLength(){
        double total = 0;
        for(MyLine w : walkway) {
            total += w.getLength();
        }
        return total;
    }

}



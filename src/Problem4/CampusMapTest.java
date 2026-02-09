
//QAP2 Java SD 15 Keyin
// by Christopher Britten
// 02/05/2026
//desc: this is a Java program that will define the full adress along with postal address


package Problem4;

import Problem2.MyPoint;
import Problem2.MyLine;
import Problem3.MyRectangle;
import java.util.ArrayList;



public class CampusMapTest {


    public static void main(String[] args) {

        //creating campus here
        CampusMap campus = new CampusMap();

        // new building data creation

        MyPoint b1 = new MyPoint(0, 100);
        MyPoint b2 = new MyPoint(50, 50);
        MyRectangle Library = new MyRectangle(b1, b2);

        MyPoint b3 = new MyPoint(200, 100);
        MyPoint b4 = new MyPoint(300, 0);
        MyRectangle Lobby = new MyRectangle(b3, b4);

        // adding building to campus

        campus.addBuilding(Library);
        campus.addBuilding(Lobby);

        // adding a fountain to campus
        MyPoint center = new MyPoint(150, 50);
        MyCircle fountain = new MyCircle(center, 20);
        campus.addFountain(fountain);


        // adding walkway between buildings

        campus.addWalkway(Library, Lobby);

        //output here

        System.out.println("Total walkway length: " + campus.walkwayLength());
        System.out.println("Total fountain area: " + campus.fountainArea());
        System.out.println("Library to Lobby Path Open: " + campus.isWalkway(Library, Lobby));
        System.out.println("Walkway from Lobby to Library Open: " + campus.isWalkway( Lobby, Library));

    }


}
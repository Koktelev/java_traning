package ru.stqa.pft.sandbox;

public class DistanceCalculator {
    public static void main (String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 10;
        p2.x = 20;
        p1.y = 10;
        p2.y = 20;

        System.out.println( "Расстояние между точками = " + Point.distance(p1,p2));
    }
}

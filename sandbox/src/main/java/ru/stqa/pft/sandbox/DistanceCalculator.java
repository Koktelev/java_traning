package ru.stqa.pft.sandbox;

public class DistanceCalculator {
    public static void main (String[] args){
        Point p1 = new Point(10,20);
        Point p2 = new Point(10,20);


        System.out.println( "Расстояние между точками = " + p1.distance(p2));
    }
}

package ru.stqa.pft.sandbox;

public class DistanceCalculator {
    public static void main (String[] args){
        Point p1 = new Point(10,6);
        Point p2 = new Point(28,78);


        System.out.println( "Расстояние между точками = " + p1.distance(p2));
    }
}

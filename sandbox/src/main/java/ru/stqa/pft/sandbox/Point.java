package ru.stqa.pft.sandbox;

public class Point { double x , y;
    public static void main (String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 10;
        p2.x = 20;
        p1.y = 10;
        p2.y = 20;



        System.out.println( "Расстояние между точками = " + Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y)   ));

    }
    public static double distance(Point p1,Point p2) {

        return 0;
    }
}

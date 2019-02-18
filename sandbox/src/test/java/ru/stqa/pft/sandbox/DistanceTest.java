package ru.stqa.pft.sandbox;

import org.junit.jupiter.api.Test;

public class DistanceTest {
    @Test

    public void testDistance() {
        Point p1 = new Point ( 10,6);
        Point p2 = new Point ( 28,78);
        assert p1.distance(p2) == 74.21590126111789;
    }

}

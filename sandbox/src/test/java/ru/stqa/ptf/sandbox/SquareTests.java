package ru.stqa.ptf.sandbox;

import org.junit.Assert;
import org.junit.Test;
import ru.stqa.pft.sandbox.Square;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25, 0.00);

    }

}

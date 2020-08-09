package zor.edu;

import org.junit.Assert;

import static org.junit.Assert.*;

public class RhombusTest
{
    Rhombus rhombus = new Rhombus(10, 40);

    @org.junit.Test
    public void whenSide10Angle40AndShortDiagonal18()
    {
        Assert.assertEquals(18.25, rhombus.getShortDiagonal(), 0.1);
    }

    @org.junit.Test
    public void whenSide10Angle40AndLongDiagonal8()
    {
        Assert.assertEquals(8.16, rhombus.getLongDiagonal(), 0.1);
    }

    @org.junit.Test
    public void whenSide10Angle40AndArea74()
    {
        Assert.assertEquals(74.51, rhombus.getArea(), 0.1);
    }

    @org.junit.Test
    public void whenSide10Angle40AndPerimeter40()
    {
        Assert.assertEquals(40, rhombus.getPerimeter(), 0.1);
    }

    @org.junit.Test
    public void whenSide10Angle40AndCircleRadius3()
    {
        Assert.assertEquals(3.72, rhombus.getCircleRadius(), 0.1);
    }
}
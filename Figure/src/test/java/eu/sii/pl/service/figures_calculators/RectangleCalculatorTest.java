package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Rectangle;
import eu.sii.pl.model.Square;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RectangleCalculatorTest {

    @Test
    public void shouldCalculateRectangleArea() {
        // given
        Rectangle rectangle = new Rectangle (30,20);
        // when
        double area = rectangle.getAreaCalculator().calculateArea(rectangle);
        // then
        Assert.assertEquals(600, area, 0.1);
    }

    @Test
    public void shouldCalculateRectanglePerimeter() {
        // given
        Rectangle rectangle = new Rectangle (30,20);
        // when
        double area = rectangle.getPerimeterCalculator().calculatePerimeter(rectangle);
        // then
        Assert.assertEquals(100, area, 0.1);
    }
}

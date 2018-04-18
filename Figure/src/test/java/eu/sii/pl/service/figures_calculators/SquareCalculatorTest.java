package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Square;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SquareCalculatorTest {

    @Test
    public void shouldCalculateSquareArea() {
        // given
        Square square = new Square (30);
        // when
        double area = square.getAreaCalculator().calculateArea(square);
        // then
        Assert.assertEquals(900, area, 0.1);
    }

    @Test
    public void shouldCalculateSquarePerimeter() {
        // given
        Square square = new Square (30);
        // when
        double area = square.getPerimeterCalculator().calculatePerimeter(square);
        // then
        Assert.assertEquals(120, area, 0.1);
    }
}

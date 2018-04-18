package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TriangleCalculatorTest {

    @Test
    public void shouldCalculateTrianglePerimeter() {
        // given
        Triangle triangle = new Triangle(30,40,50);
        // when
        double area = triangle.getPerimeterCalculator().calculatePerimeter(triangle);
        // then
        Assert.assertEquals(120, area, 0.1);
    }
}

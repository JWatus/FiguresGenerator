package eu.sii.pl.service.default_calculators;


import eu.sii.pl.model.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultPerimeterCalculatorTest {

    @Test
    public void shouldCalculateSquarePerimeter() {
        // given
        Circle circle = new Circle (30);
        // when
        double area = circle.getPerimeterCalculator().calculatePerimeter(circle);
        // then
        Assert.assertEquals(-1, area, 0.1);
    }
}

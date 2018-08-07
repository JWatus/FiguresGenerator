package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CircleCalculatorTest {

    @Test
    public void shouldCalculateCircleArea() {
        // given
        Circle circle = new Circle(10);
        // when
        double area = circle.getAreaCalculator().calculateArea(circle);
        // then
        Assert.assertEquals(314.16, area, 0.1);
    }
}

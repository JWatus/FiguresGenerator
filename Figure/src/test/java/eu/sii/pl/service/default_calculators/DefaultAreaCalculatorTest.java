package eu.sii.pl.service.default_calculators;

import eu.sii.pl.model.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultAreaCalculatorTest {

    @Test
    public void shouldCalculateDefaultArea() {
        // given
        Triangle triangle = new Triangle(10,20,10);
        // when
        double area = triangle.getAreaCalculator().calculateArea(triangle);
        // then
        Assert.assertEquals(-1, area, 0.1);
    }
}

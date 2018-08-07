package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Ellipse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EllipseCalculatorTest {

    @Test
    public void shouldCalculateEllipseArea() {
        // given
        Ellipse ellipse = new Ellipse(10,20);
        // when
        double area = ellipse.getAreaCalculator().calculateArea(ellipse);
        // then
        Assert.assertEquals(628.32, area, 0.1);
    }
}

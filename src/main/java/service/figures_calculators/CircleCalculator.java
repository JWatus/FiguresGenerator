package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Circle;
import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CircleCalculator implements AreaCalculator, PerimeterCalculator {

    @Override
    public double calculatePerimeter(Figure figure) {
        double radius = ((Circle) figure).getRadius();
        return Math.round(2 * radius * Math.PI * 100) / 100D;
    }

    @Override
    public double calculateArea(Figure figure) {
        double radius = ((Circle) figure).getRadius();
        return Math.round(radius * radius * Math.PI * 100) / 100D;
    }
}

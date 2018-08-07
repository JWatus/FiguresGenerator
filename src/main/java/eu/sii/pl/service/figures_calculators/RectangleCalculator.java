package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Figure;
import eu.sii.pl.model.Rectangle;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import org.springframework.stereotype.Service;

@Service
public class RectangleCalculator implements AreaCalculator, PerimeterCalculator {

    @Override
    public double calculateArea(Figure figure) {
        double side1 = ((Rectangle) figure).getSide1();
        double side2 = ((Rectangle) figure).getSide2();
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter(Figure figure) {
        double side1 = ((Rectangle) figure).getSide1();
        double side2 = ((Rectangle) figure).getSide2();
        return 2 * (side1 + side2);
    }
}

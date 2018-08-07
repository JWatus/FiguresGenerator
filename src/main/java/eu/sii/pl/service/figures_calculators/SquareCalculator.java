package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Figure;
import eu.sii.pl.model.Square;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import org.springframework.stereotype.Service;

@Service
public class SquareCalculator implements AreaCalculator, PerimeterCalculator {

    @Override
    public double calculateArea(Figure figure) {
        double side = ((Square) figure).getSide();
        return side * side;
    }

    @Override
    public double calculatePerimeter(Figure figure) {
        double side = ((Square) figure).getSide();
        return side * 4;
    }
}

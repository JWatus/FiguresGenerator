package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Figure;
import eu.sii.pl.model.Triangle;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import org.springframework.stereotype.Service;

@Service
public class TriangleCalculator implements AreaCalculator, PerimeterCalculator {

    @Override
    public double calculateArea(Figure figure) {
        double side1 = ((Triangle) figure).getSide1();
        double side2 = ((Triangle) figure).getSide2();
        double side3 = ((Triangle) figure).getSide3();
        double halfPerim = (side1 + side2 + side3) / 2;
        return Math.round(Math.sqrt(halfPerim * (halfPerim - side1) * (halfPerim - side2) * (halfPerim - side3)) * 100) / 100D;
    }

    @Override
    public double calculatePerimeter(Figure figure) {
        double side1 = ((Triangle) figure).getSide1();
        double side2 = ((Triangle) figure).getSide2();
        double side3 = ((Triangle) figure).getSide3();
        return side1 + side2 + side3;
    }
}

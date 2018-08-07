package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Ellipse;
import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
public class EllipseCalculator implements AreaCalculator, PerimeterCalculator {

    @Override
    public double calculatePerimeter(Figure figure) {
        double radiusX = ((Ellipse) figure).getRadiusX();
        double radiusY = ((Ellipse) figure).getRadiusY();
        return Math.round((1.5 * (radiusX + radiusY - sqrt(radiusX * radiusY))) * Math.PI * 100) / 100D;
    }

    @Override
    public double calculateArea(Figure figure) {
        double radiusX = ((Ellipse) figure).getRadiusX();
        double radiusY = ((Ellipse) figure).getRadiusY();
        return Math.round(radiusX * radiusY * Math.PI * 100) / 100D;
    }

}


package eu.sii.pl.service.figures_calculators;

import eu.sii.pl.model.Ellipse;
import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.AreaCalculator;
import org.springframework.stereotype.Service;

@Service
public class EllipseCalculator implements AreaCalculator {

    @Override
    public double calculateArea(Figure figure) {
        double radiusX = ((Ellipse) figure).getRadiusX();
        double radiusY = ((Ellipse) figure).getRadiusY();
        return Math.round(radiusX * radiusY * Math.PI * 100) / 100D;
    }

}


package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.EllipsePainter;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.figures_calculators.EllipseCalculator;
import eu.sii.pl.service.interfaces.Painter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Ellipse extends Figure {

    @Column(name = "RADIUS_X")
    private double radiusX;
    @Column(name = "RADIUS_Y")
    private double radiusY;

    @Override
    public AreaCalculator getAreaCalculator() {
        return new EllipseCalculator();
    }

    @Override
    public Painter getPainter() {
        return new EllipsePainter();
    }

    public Ellipse() {
    }

    public Ellipse(double radiusX, double radiusY) {
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public double getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(double radiusX) {
        this.radiusX = radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(double radiusY) {
        this.radiusY = radiusY;
    }

}

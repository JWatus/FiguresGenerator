package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.CirclePainter;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.figures_calculators.CircleCalculator;
import eu.sii.pl.service.interfaces.Painter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Circle extends Figure {

    @Column(name="RADIUS")
    private double radius;

    @Override
    public AreaCalculator getAreaCalculator() {
        return new CircleCalculator();
    }

    @Override
    public Painter getPainter() {
        return new CirclePainter();
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

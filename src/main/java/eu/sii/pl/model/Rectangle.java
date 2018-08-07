package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.RectanglePainter;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.Painter;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import eu.sii.pl.service.figures_calculators.RectangleCalculator;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Rectangle extends Figure {

    @Column(name="SIDE1")
    private double side1;
    @Column(name="SIDE2")
    private double side2;

    @Override
    public AreaCalculator getAreaCalculator() {
        return new RectangleCalculator();
    }

    @Override
    public PerimeterCalculator getPerimeterCalculator() {
        return new RectangleCalculator();
    }

    @Override
    public Painter getPainter() {
        return new RectanglePainter();
    }


    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}

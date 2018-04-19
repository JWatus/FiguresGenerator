package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.TrianglePainter;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.Painter;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import eu.sii.pl.service.figures_calculators.TriangleCalculator;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Triangle extends Figure {

    @Column(name="SIDE1")
    private double side1;
    @Column(name="SIDE2")
    private double side2;
    @Column(name="SIDE3")
    private double side3;

    @Override
    public AreaCalculator getAreaCalculator() {
        return new TriangleCalculator();
    }

    @Override
    public PerimeterCalculator getPerimeterCalculator() {
        return new TriangleCalculator();
    }

    @Override
    public Painter getPainter() {
        return new TrianglePainter();
    }

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}

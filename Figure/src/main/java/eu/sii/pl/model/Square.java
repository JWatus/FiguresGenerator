package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.SquarePainter;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.interfaces.Painter;
import eu.sii.pl.service.interfaces.PerimeterCalculator;
import eu.sii.pl.service.figures_calculators.SquareCalculator;

import javax.persistence.*;

@Entity
public class Square extends Figure {

    @Column(name="SIDE")
    private double side;

    @Override
    public AreaCalculator getAreaCalculator() {
        return new SquareCalculator();
    }

    @Override
    public PerimeterCalculator getPerimeterCalculator() {
        return new SquareCalculator();
    }

    @Override
    public Painter getPainter() {
        return new SquarePainter();
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}

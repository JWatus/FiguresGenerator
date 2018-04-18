package eu.sii.pl.results;

import eu.sii.pl.model.Figure;

public class Results {

    private double area;
    private double perimeter;
    private final Figure figure;
    private String type;
    private String cssToPaint;

    public Results(Figure figure, double area, double perimeter, String cssToPaint) {
        this.figure = figure;
        this.area = area;
        this.perimeter = perimeter;
        this.type = figure.getClass().getSimpleName();
        this.cssToPaint = cssToPaint;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getType() {
        return type;
    }

    public String getCssToPaint() {
        return cssToPaint;
    }
}
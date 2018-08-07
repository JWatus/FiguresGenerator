package eu.sii.pl.model;

import eu.sii.pl.service.figures_painters.NoPainterForFigure;
import eu.sii.pl.service.interfaces.AreaCalculator;
import eu.sii.pl.service.default_calculators.DefaultAreaCalculator;
import eu.sii.pl.service.default_calculators.DefaultPerimeterCalculator;
import eu.sii.pl.service.interfaces.Painter;
import eu.sii.pl.service.interfaces.PerimeterCalculator;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Figure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @Transient
    private AreaCalculator areaCalculator;
    @Transient
    private PerimeterCalculator perimeterCalculator;
    @Transient
    private Painter painter;

    public Painter getPainter() {
        return new NoPainterForFigure();
    }

    public AreaCalculator getAreaCalculator() {
        return new DefaultAreaCalculator();
    }

    public PerimeterCalculator getPerimeterCalculator() {
        return new DefaultPerimeterCalculator();
    }

    public Long getId() {
        return id;
    }

}

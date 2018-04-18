package eu.sii.pl.service.figures_painters;

import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.Painter;

public class NoPainterForFigure implements Painter {
    @Override
    public String paint(Figure figure) {
        return "No image.";
    }
}

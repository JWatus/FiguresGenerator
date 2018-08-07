package eu.sii.pl.service.figures_painters;

import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.Painter;
import org.springframework.stereotype.Service;

@Service
public class TrianglePainter implements Painter {

    @Override
    public String paint(Figure figure) {
        return "<div style=\"border-left: 10px solid transparent; " +
                "border-right: 10px solid transparent; " +
                "border-bottom: 20px solid darkgreen; width: 0; height: 0;\"></div>";
    }
}


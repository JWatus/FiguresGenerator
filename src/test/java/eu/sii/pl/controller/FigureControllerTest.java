package eu.sii.pl.controller;

import eu.sii.pl.model.*;
import eu.sii.pl.repository.FigureRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FigureControllerTest {

    @Autowired
    FigureRepository figureRepository;

    @Test
    public void shouldReturnAllFigures() {
        List<Figure> figures = figureRepository.findAll();
        assertEquals(5, figures.size());
    }

    @Test
    public void shouldReturnChosenFigure() {
        Optional<Figure> figure = figureRepository.findById(2L);
        assertEquals("Rectangle", figure.get().getClass().getSimpleName());
    }
}
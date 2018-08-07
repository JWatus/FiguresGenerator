package eu.sii.pl.controller;

import eu.sii.pl.model.*;
import eu.sii.pl.repository.FigureRepository;
import eu.sii.pl.results.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

@Controller
@RequestMapping("/application")
public class FigureController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FigureController.class.getName());

    @Autowired
    private FigureRepository figureRepository;

    @GetMapping("/showChosen/{name}")
    public ModelAndView getChosenFigureResults(@PathVariable(name = "name") Long id) {

        ModelAndView result;

        try {
            Figure figure = figureRepository.findById(id).orElseThrow(
                    () -> new NoSuchElementException()
            );

            Results chosen = new Results(figure,
                    figure.getAreaCalculator().calculateArea(figure),
                    figure.getPerimeterCalculator().calculatePerimeter(figure),
                    figure.getPainter().paint(figure));
            result = new ModelAndView("chosen");
            result.addObject("result", chosen);
        } catch (Exception e) {
            LOGGER.warn("Wrong argument", e);
            result = new ModelAndView("index");
        }
        return result;
    }

    @GetMapping("/showResults")
    public ModelAndView getAllFiguresResults() {
        List<Results> resultsList = new ArrayList<>();

        for (Figure figure : figureRepository.findAll()) {
            resultsList.add(new Results(figure,
                    figure.getAreaCalculator().calculateArea(figure),
                    figure.getPerimeterCalculator().calculatePerimeter(figure),
                    figure.getPainter().paint(figure)));

            LOGGER.info("Area of {} is {}", figure.getClass().getSimpleName(), figure.getAreaCalculator().calculateArea(figure));
            LOGGER.info("Perimeter of {} is {} ", figure.getClass().getSimpleName(), figure.getPerimeterCalculator().calculatePerimeter(figure));
        }
        ModelAndView results = new ModelAndView("asc");
        results.addObject("results", resultsList);
        return results;
    }

    @GetMapping("/showResultsByIdDesc")
    public ModelAndView getAllFiguresResultsDescending() {
        List<Results> resultsList = new ArrayList<>();

        for (Figure figure : figureRepository.findAllByOrderByIdDesc()) {
            resultsList.add(new Results(figure,
                    figure.getAreaCalculator().calculateArea(figure),
                    figure.getPerimeterCalculator().calculatePerimeter(figure),
                    figure.getPainter().paint(figure)));

            LOGGER.info("Area of {} is {}", figure.getClass().getSimpleName(), figure.getAreaCalculator().calculateArea(figure));
            LOGGER.info("Perimeter of {} is {} ", figure.getClass().getSimpleName(), figure.getPerimeterCalculator().calculatePerimeter(figure));
        }
        ModelAndView results = new ModelAndView("desc");
        results.addObject("results", resultsList);
        return results;
    }

    @GetMapping("/random")
    public String goToRandomPage() {
        return "random";
    }

    @GetMapping("/deleteChosenByIdDesc/{name}")
    public RedirectView deleteChosenByIdDescFigureResults(@PathVariable(name = "name") Long id) {
        try {
            figureRepository.deleteById(id);
        } catch (Exception e) {
            LOGGER.warn("Wrong argument", e);
        }
        return new RedirectView("/application/showResultsByIdDesc");
    }

    @GetMapping("/deleteChosen/{name}")
    public RedirectView deleteChosenFigureResults(@PathVariable(name = "name") Long id) {
        try {
            figureRepository.deleteById(id);
        } catch (Exception e) {
            LOGGER.warn("Wrong argument", e);
        }
        return new RedirectView("/application/showResults");
    }

    @GetMapping("/addRandomSquare")
    public RedirectView generateSquare() {
        figureRepository.save(new Square(new Random().nextInt(100) + 1));
        return new RedirectView("/application/showResults");
    }

    @GetMapping("/addRandomRectangle")
    public RedirectView generateRectangle() {
        figureRepository.save(new Rectangle(new Random().nextInt(100) + 1, new Random().nextInt(100) + 1));
        return new RedirectView("/application/showResults");
    }

    @GetMapping("/addRandomTriangle")
    public RedirectView generateTriangle() {
        figureRepository.save(new Triangle(new Random().nextInt(100) + 1, new Random().nextInt(100) + 1, new Random().nextInt(100) + 1));
        return new RedirectView("/application/showResults");
    }

    @GetMapping("/addRandomCircle")
    public RedirectView generateCircle() {
        figureRepository.save(new Circle(new Random().nextInt(100) + 1));
        return new RedirectView("/application/showResults");
    }

    @GetMapping("/addRandomEllipse")
    public RedirectView generateEllipse() {
        figureRepository.save(new Ellipse(new Random().nextInt(100) + 1, new Random().nextInt(100) + 1));
        return new RedirectView("/application/showResults");
    }
}

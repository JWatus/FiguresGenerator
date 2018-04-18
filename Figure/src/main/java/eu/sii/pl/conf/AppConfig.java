package eu.sii.pl.conf;

import eu.sii.pl.model.*;
import eu.sii.pl.repository.FigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("eu.sii.pl")
public class AppConfig {

    @Autowired
    private FigureRepository figureRepository;

    @PostConstruct
    public void init() {

        figureRepository.save(new Square(10));
        figureRepository.save(new Rectangle(10, 20));
        figureRepository.save(new Triangle(10, 10, 10));
        figureRepository.save(new Circle(10));
        figureRepository.save(new Ellipse(10,20));
    }
}



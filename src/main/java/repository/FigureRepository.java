package eu.sii.pl.repository;

import eu.sii.pl.model.Figure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FigureRepository extends JpaRepository<Figure, Long> {

    List<Figure> findAllByOrderByIdDesc();

}

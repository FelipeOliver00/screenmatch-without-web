package br.com.felipinho.screenmatch.repository;

import br.com.felipinho.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}

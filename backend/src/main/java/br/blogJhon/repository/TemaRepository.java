package br.blogJhon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.blogJhon.model.Tema;

/**
 * @author jhonmed
 *
 */
@Repository
public interface TemaRepository
  extends JpaRepository<Tema, Long> {

  public List<Tema> findAllByTipoContainingIgnoreCase(String tipo);
}

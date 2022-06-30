package br.blogJhon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.blogJhon.model.Postagem;

/**
 * @author jhonmed
 *
 */
@Repository
public interface PostagemRepository
  extends JpaRepository<Postagem, Long> {

  /**
   * Buscar postagem pelo titulo
   * 
   * @param titulo
   * @return
   */
  public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}

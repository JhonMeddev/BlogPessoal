package br.blogJhon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.blogJhon.model.Usuario;

/**
 * @author jhonmed
 *
 */
public interface UsuarioRepository
  extends JpaRepository<Usuario, Long> {

  public Optional<Usuario> findByUsuario(String usuario);
}

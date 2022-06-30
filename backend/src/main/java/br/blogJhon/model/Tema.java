package br.blogJhon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jhonmed
 *
 */
@Entity
@Table(name = "tb_tema")
public class Tema {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String tipo;

  @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
  @JsonIgnoreProperties("tema")
  private List<Postagem> postagem;

  /**
   * @return {@link #id}
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id atualiza {@link #id}.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return {@link #tipo}
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * @param tipo atualiza {@link #tipo}.
   */
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  /**
   * @return {@link #postagem}
   */
  public List<Postagem> getPostagem() {
    return postagem;
  }

  /**
   * @param postagem atualiza {@link #postagem}.
   */
  public void setPostagem(List<Postagem> postagem) {
    this.postagem = postagem;
  }

}

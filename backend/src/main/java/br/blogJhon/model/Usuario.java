package br.blogJhon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

/**
 * @author jhonmed
 *
 */

@Entity
@Table(name = "tb_usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NonNull
  private String nome;

  @NonNull
  private String usuario;

  @NonNull
  private String senha;

  /**
   * @return {@link #id}
   */
  public long getId() {
    return id;
  }

  /**
   * @param id atualiza {@link #id}.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return {@link #nome}
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome atualiza {@link #nome}.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return {@link #usuario}
   */
  public String getUsuario() {
    return usuario;
  }

  /**
   * @param usuario atualiza {@link #usuario}.
   */
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  /**
   * @return {@link #senha}
   */
  public String getSenha() {
    return senha;
  }

  /**
   * @param senha atualiza {@link #senha}.
   */
  public void setSenha(String senha) {
    this.senha = senha;
  }

}

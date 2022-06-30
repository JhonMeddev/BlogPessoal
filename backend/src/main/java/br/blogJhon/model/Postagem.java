package br.blogJhon.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jhonmed
 *
 */

@Entity
@Table(name = "tb_postagens")
public class Postagem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NonNull
  private String titulo;

  @NonNull
  private String texto;

  @Temporal(TemporalType.TIMESTAMP)
  private Date data;

  @ManyToOne
  @JsonIgnoreProperties("postagem")
  private Tema tema;


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
   * @return {@link #titulo}
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   * @param titulo atualiza {@link #titulo}.
   */
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  /**
   * @return {@link #texto}
   */
  public String getTexto() {
    return texto;
  }

  /**
   * @param texto atualiza {@link #texto}.
   */
  public void setTexto(String texto) {
    this.texto = texto;
  }

  /**
   * @return {@link #data}
   */
  public Date getData() {
    return data;
  }

  /**
   * @param data atualiza {@link #data}.
   */
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * @return {@link #tema}
   */
  public Tema getTema() {
    return tema;
  }

  /**
   * @param tema atualiza {@link #tema}.
   */
  public void setTema(Tema tema) {
    this.tema = tema;
  }

}

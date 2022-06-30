package br.blogJhon.model;


/**
 * @author jhonmed
 *
 */
public class UserLogin {

  private String nome;

  private String usuario;

  private String senha;

  private String token;

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

  /**
   * @return {@link #token}
   */
  public String getToken() {
    return token;
  }

  /**
   * @param token atualiza {@link #token}.
   */
  public void setToken(String token) {
    this.token = token;
  }

}

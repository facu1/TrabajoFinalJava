package com.apiRest.finalWork.dto;

import com.apiRest.finalWork.entity.Post;

public class PostDTO {
  private Long usuario;
  private Post post;

  public Long getUsuario() {
    return usuario;
  }

  public void setUsuario(Long usuario) {
    this.usuario = usuario;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }
}

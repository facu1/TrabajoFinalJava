package com.apiRest.finalWork.repository;

import java.util.List;

import com.apiRest.finalWork.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

  List<Post> findByTituloContaining(String palabra);

  List<Post> findByPublicadoLike(Boolean bool);
}

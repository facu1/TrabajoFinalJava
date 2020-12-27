package com.apiRest.finalWork.repository;

import com.apiRest.finalWork.entity.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{
  
}

package com.videovlog.artivlog.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.videovlog.artivlog.models.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long>{
}

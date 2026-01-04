package com.videovlog.artivlog.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.videovlog.artivlog.models.Articulo;

public interface ArticuloRepository  extends JpaRepository<Articulo,UUID>{

    Optional<Articulo> findBySlug(String slug);
    boolean existsBySlug(String slug);



}

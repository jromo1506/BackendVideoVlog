package com.videovlog.artivlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videovlog.artivlog.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{}
package com.videovlog.artivlog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_video", nullable = false)
    private Video video;

    @ManyToOne
    @JoinColumn(name = "id_usuario" , nullable = false)
    private Usuario usuario;

    @Column(name = "comentario",nullable = false, columnDefinition = "TEXT")
    private String comentario;

    @ManyToOne
    @JoinColumn(name="id_comentario_padre")
    private Comentario comentarioPadre;

}

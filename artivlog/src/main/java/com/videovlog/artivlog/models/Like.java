package com.videovlog.artivlog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Like")
public class Like {
    private int id;
    private int idUsuario;
    private int idVideo;
    private int idComentario;


    

}

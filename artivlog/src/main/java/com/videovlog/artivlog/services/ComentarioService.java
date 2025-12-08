package com.videovlog.artivlog.services;

import com.videovlog.artivlog.models.Comentario;

public interface ComentarioService {
    public Comentario publicarComentario(Comentario comentario);
    public void eliminarComentario(Long id);
    public Comentario editarComentario(Long idComentario,String nuevoTexto);

}
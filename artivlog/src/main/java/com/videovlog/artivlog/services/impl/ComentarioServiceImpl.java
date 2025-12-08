package com.videovlog.artivlog.services.impl;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Comentario;
import com.videovlog.artivlog.repository.ComentarioRepository;
import com.videovlog.artivlog.services.ComentarioService;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    public ComentarioRepository comentarioRepository;

    @Override
    public Comentario publicarComentario(Comentario comentario) {
      Comentario com = comentarioRepository.save(comentario);
      return com;
    }

    @Override
    public void eliminarComentario(Long id) {
          if (!comentarioRepository.existsById(id)) {
            throw new RuntimeException("Comentario no encontrado");
        }
        comentarioRepository.deleteById(id); 
        // Si tiene respuestas, se eliminan automáticamente por la cascada
    }

    @Override
    public Comentario editarComentario(Long idComentario,String nuevoTexto) {
          Comentario comentario = comentarioRepository.findById(idComentario)
                .orElseThrow(() -> new RuntimeException("Comentario no encontrado"));

        comentario.setComentario(nuevoTexto);

        return comentarioRepository.save(comentario);
    }
    
}

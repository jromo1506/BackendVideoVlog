package com.videovlog.artivlog.services;

import org.springframework.stereotype.Service;
import com.videovlog.artivlog.models.Like;



@Service
public interface LikeService {
        public Like darLike(Like like);
        public void quitarLike(Long idVideo,Long idUsuario);
        public Like cambiarLikeDislike(Long idVideo, Long idUsuario);
}

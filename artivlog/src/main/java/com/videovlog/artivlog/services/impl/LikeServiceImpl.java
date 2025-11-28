package com.videovlog.artivlog.services.impl;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Like;
import com.videovlog.artivlog.repository.LikeRepository;
import com.videovlog.artivlog.repository.UsuarioRepository;
import com.videovlog.artivlog.repository.VideoRepository;
import com.videovlog.artivlog.services.LikeService;

@Service
public class LikeServiceImpl implements LikeService {

    public LikeRepository likeRepository;
    public UsuarioRepository usuarioRepository;
    public VideoRepository videoRepository;

    public LikeServiceImpl(LikeRepository likeRepository){
        this.likeRepository = likeRepository;
    }

    @Override
    public Like darLike(Like like){
        Like likeado = likeRepository.save(like);
        return likeado;

    }


    @Override 
    public void quitarLike(Long idUser, Long idVideo){
        likeRepository.deleteByUserIdAndVideoId(idUser, idVideo);
    }

    @Override
    public Like cambiarLikeDislike(Long idVideo,Long idUsuario,boolean positive){
        Optional <Like> existe =  likeRepository.findByUserIdAndVideoId(idUsuario, idVideo);
        
        //Si existe el like o dislike en el video
        if(existe.isPresent()){
            Like like = existe.get();

            //Si es el mismo se elimina el like
            if(like.getPositive() == positive){
                likeRepository.delete(like);
                return null;
            }

            //Si es diferente se cambia 
            like.setPositive(positive);
            return likeRepository.save(like);
        }

        //En caso de que no exista el like, crearlo
        Like newLike = new Like();
        newLike.setUser(usuarioRepository.getReferenceById(idUsuario));
        newLike.setVideo(videoRepository.getReferenceById(idVideo));
        newLike.setPositive(positive);

        return likeRepository.save(newLike);

    }
    
}

package com.videovlog.artivlog.services.impl;


import com.videovlog.artivlog.models.Like;
import com.videovlog.artivlog.repository.LikeRepository;
import com.videovlog.artivlog.services.LikeService;

public class LikeServiceImpl implements LikeService {

    public LikeRepository likeRepository;

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
    
}

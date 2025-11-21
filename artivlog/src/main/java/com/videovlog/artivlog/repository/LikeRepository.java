package com.videovlog.artivlog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.videovlog.artivlog.models.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long>{
    

    Optional<Like> findByUserIdAndVideoId(Long idUser,Long idVideo);

    void deleteByUserIdAndVideoId(Long idUser,Long idVideo);

}
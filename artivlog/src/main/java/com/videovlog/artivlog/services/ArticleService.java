package com.videovlog.artivlog.services;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.dto.Articulo.ArticuloDTORequest;
import com.videovlog.artivlog.models.Articulo;
import com.videovlog.artivlog.repository.ArticuloRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {
    
    public final ArticuloRepository repository;

    public Articulo create(ArticuloDTORequest request){
        Articulo articulo = new Articulo();

        articulo.setTitle(request.getTitle());
        articulo.setSlug(request.getSlug());
        articulo.setContent(request.getContent());
        articulo.setVersion(1);
        articulo.setCreatedAt(Instant.now());
        articulo.setUpdatedAt(Instant.now());

        return repository.save(articulo);
    }

    public Articulo update(UUID id, ArticuloDTORequest request){
        Articulo articulo =repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Articulo no encontrado"));

        articulo.setTitle(request.getTitle());
        articulo.setContent(request.getContent());
        articulo.setVersion(articulo.getVersion() + 1);
        articulo.setUpdatedAt(Instant.now());

        return repository.save(articulo);
    }

    public Articulo getById(UUID id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Articulo no encontrado"));
    }

    public Articulo getBySlug(String slug){
        return repository.findBySlug(slug).orElseThrow(
            ()-> new RuntimeException("Articulo no encontrado")
        );
    }

    public List<Articulo> getAll(){
        return repository.findAll();
    }


    public void delete(UUID id){
        repository.deleteById(id);
    }



    
}

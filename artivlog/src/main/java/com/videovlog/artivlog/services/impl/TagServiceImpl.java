package com.videovlog.artivlog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Tag;
import com.videovlog.artivlog.models.Video;
import com.videovlog.artivlog.repository.TagRepository;
import com.videovlog.artivlog.repository.VideoRepository;
import com.videovlog.artivlog.services.TagService;

@Service
public class TagServiceImpl implements TagService {

    private TagRepository tagRepository;
    private VideoRepository videoRepository;

    @Override
    public Tag crearTag(String name) {
        if(tagRepository.findByName(name).isPresent()){
            throw new RuntimeException("Tag en existencia");
        }
        Tag tag = new Tag();
        tag.setName(name);
        return tagRepository.save(tag);
    }

    @Override
    public void eliminarTag(Long id) {
        if(!tagRepository.findById(id).isPresent()){
            throw new RuntimeException("Tag no encontrada");
        }
        tagRepository.deleteById(id);
    }

    @Override
    public List<Tag> obtenerTags() {
        List<Tag> tags = tagRepository.findAll();
        return tags;
    }

    @Override
    public List<Tag> obtenerTagsVideo(Long idVideo) {
        List<Tag> tags = tagRepository.findByVideosId(idVideo);
        return tags;    
    }
        

    @Override
    public Tag obtenerTag(Long id) {
        if(tagRepository.findById(id).isPresent()){
            throw new RuntimeException("Tag no encontrada");
        }

        Tag tag =  tagRepository.getReferenceById(id);
        return tag;
    }


    @Override
    public Tag anadirTagVideo(Long idVideo, Long idTag) {
        Tag tag = tagRepository.findById(idTag).orElseThrow(() -> new RuntimeException());

        Video video =  videoRepository.findById(idVideo).orElseThrow(() -> new RuntimeException());
        
        video.getTags().add(tag);
        videoRepository.save(video);
        return tag;
    }
    
    
}

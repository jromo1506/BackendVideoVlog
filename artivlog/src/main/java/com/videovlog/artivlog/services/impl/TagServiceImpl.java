package com.videovlog.artivlog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.models.Tag;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTag'");
    }

    @Override
    public List<Tag> obtenerTags() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTags'");
    }

    @Override
    public List<Tag> obtenerTagsVideo(Long idVideo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTagsVideo'");
    }

    @Override
    public Tag obtenerTag(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTag'");
    }

    @Override
    public Tag anadirTagVideo(Long idVideo, Long idTag) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'anadirTagVideo'");
    }
    
    
}

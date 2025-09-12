package com.videovlog.artivlog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.videovlog.artivlog.dto.UsuarioDTO;
import com.videovlog.artivlog.mapper.UsuarioMapper;
import com.videovlog.artivlog.models.Usuario;
import com.videovlog.artivlog.repository.UsuarioRepository;
import com.videovlog.artivlog.services.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {
    

    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;
    public UsuarioServiceImp(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public UsuarioDTO crearUsuario(Usuario usuario){
        Usuario saved = usuarioRepository.save(usuario);
        return this.usuarioMapper.UsuarioToDTO(saved);
    }

    @Override
    public UsuarioDTO getUsuario(Long id){
        Usuario found  =  usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        
        return this.usuarioMapper.UsuarioToDTO(found);
    }

    @Override
    public List<UsuarioDTO> getUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuarioMapper::UsuarioToDTO).toList(); 
    }

    @Override
    public UsuarioDTO putUsaurio(Long id, Usuario usuario){
        Usuario found = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No se encontro el usuario"));
        
        found.setUsername(usuario.getUsername());
        found.setPassword(usuario.getPassword());
        found.setBio(usuario.getBio());
        found.setEmail(usuario.getEmail());
        found.setPfpUrl(usuario.getPfpUrl());
        Usuario updated = usuarioRepository.save(found);
        return this.usuarioMapper.UsuarioToDTO(updated);

    }

  

    @Override
    public void deleteUsuario(Long id){
      usuarioRepository.deleteById(null);
    }

}

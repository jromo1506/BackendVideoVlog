package com.videovlog.artivlog.mapper;
import com.videovlog.artivlog.dto.*;
import com.videovlog.artivlog.models.Usuario;

public class UsuarioMapper {
    

    public static UsuarioDTO UsuarioToDTO(Usuario usuario){
        return  new UsuarioDTO(
            usuario.getId(),
            usuario.getUsername(),
            usuario.getEmail(),
            usuario.getPfpUrl(),
            usuario.getBio(),
            usuario.getCreatedAt()
        );
        
        
    }
}

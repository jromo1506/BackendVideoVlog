package com.videovlog.artivlog.services;


import java.util.List;

import com.videovlog.artivlog.dto.*;
import com.videovlog.artivlog.models.*;


public interface UsuarioService {

    public UsuarioDTO crearUsuario(Usuario usuario);
    public UsuarioDTO getUsuario(String id);
    public List<UsuarioDTO> getUsuarios();
    public UsuarioDTO putUsaurio(String id, Usuario usuario);
    public UsuarioDTO postUsuario(Usuario usuario);    
}
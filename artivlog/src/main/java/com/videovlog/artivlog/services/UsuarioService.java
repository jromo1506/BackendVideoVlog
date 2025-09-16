package com.videovlog.artivlog.services;


import java.util.List;

import com.videovlog.artivlog.dto.*;
import com.videovlog.artivlog.models.*;


public interface UsuarioService {

    public UsuarioDTO crearUsuario(Usuario usuario);
    public UsuarioDTO getUsuario(Long id);
    public List<UsuarioDTO> getUsuarios();
    public UsuarioDTO putUsaurio(Long id, Usuario usuario);
    public void deleteUsuario(Long id);
}
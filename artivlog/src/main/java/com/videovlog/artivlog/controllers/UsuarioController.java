package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.services.UsuarioService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.videovlog.artivlog.models.Usuario;



@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    public final UsuarioService service;
    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @GetMapping("")
    public List<Usuario> getUsuarios() {
        List<Usuario> Lista = new ArrayList<Usuario>();
        return Lista;
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@RequestParam String id) {
        Usuario usuario = new Usuario();
        return usuario;
    }
    

    @PostMapping("")
    public Usuario postUsuario(@RequestBody Usuario entity) {
        Usuario usuario =  new Usuario();
        return usuario;
    }

    @PutMapping("/{id}")
    public Usuario putUsuarios(@PathVariable String id, @RequestBody Usuario entity) {
        
        Usuario usuario = new Usuario();
        return entity;
    }

    @DeleteMapping()
    public Usuario deleteUsuario(){
        Usuario usuario =  new Usuario();
        return usuario;
    }
    
    
}

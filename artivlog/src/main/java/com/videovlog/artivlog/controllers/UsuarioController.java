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




@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    public final UsuarioService service;
    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @GetMapping("")
    public List<Usuarios> getUsuarios() {
        List<Usuarios> Lista = new ArrayList<Usuarios>();
        return Lista;
    }

    @GetMapping("/{id}")
    public Usuarios getUsuarioById(@RequestParam String id) {
        Usuarios usuario = new Usuarios();
        return usuario;
    }
    

    @PostMapping("")
    public Usuarios postUsuario(@RequestBody Usuarios entity) {
        Usuarios usuario =  new Usuarios();
        return usuario;
    }

    @PutMapping("/{id}")
    public Usuarios putUsuarios(@PathVariable String id, @RequestBody Usuarios entity) {
        
        Usuarios usuario = new Usuarios();
        return entity;
    }

    @DeleteMapping()
    public Usuarios deleteUsuario(){
        Usuarios usuario =  new Usuarios();
        return usuario;
    }
    
    
}

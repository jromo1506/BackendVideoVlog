package com.videovlog.artivlog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovlog.artivlog.services.UsuarioService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.videovlog.artivlog.dto.UsuarioDTO;
import com.videovlog.artivlog.models.Usuario;



@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    public final UsuarioService service;
    public UsuarioController(UsuarioService service){

        this.service = service;
    }


    @GetMapping("")
    public ResponseEntity<List<UsuarioDTO>> getUsuarios() {
        List<UsuarioDTO> Lista =   this.service.getUsuarios();
        return ResponseEntity.ok(Lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@RequestParam Long id) {
        UsuarioDTO usuario = this.service.getUsuario(id);
        return ResponseEntity.ok(usuario);
    }
    

    @PostMapping("")
    public ResponseEntity<UsuarioDTO> postUsuario(@RequestBody Usuario entity) {
        UsuarioDTO usuario =  this.service.crearUsuario(entity)
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> putUsuarios(@PathVariable Long id, @RequestBody Usuario entity) {
        
        UsuarioDTO usuario = this.service.putUsaurio(id, entity);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
       this.service.deleteUsuario(id);
       return ResponseEntity.noContent().build();
    }
    
    
}

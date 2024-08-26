package com.trainibit.usuarios.controller;

import com.trainibit.usuarios.excepttiom.ResourceNotFoundException;
import com.trainibit.usuarios.model.Usuario;
import com.trainibit.usuarios.request.UsuarioRequest;
import com.trainibit.usuarios.response.UsuarioResponse;
import com.trainibit.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<UsuarioResponse> getUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping("/usuarios/{uuid}")
    public ResponseEntity<UsuarioResponse> getUsuarioById(
            @PathVariable(value = "uuid") UUID uuid)
            throws ResourceNotFoundException {
        UsuarioResponse usuario = usuarioService.findByUuid(uuid);
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping(value = "/usuarios/autentication")
    @ResponseStatus(HttpStatus.OK)
    public void autenticar(
            @RequestParam(value = "nombreUsuario") String userName,
            @RequestParam(value = "password") String password)
            throws ResourceNotFoundException {
        Boolean autenticado = usuarioService.autenticar(userName,password);
        if(!autenticado){
            throw new ResourceNotFoundException("Usuario no autenticado");
        }
    }

    @PostMapping("/usuarios")
    public ResponseEntity<UsuarioResponse> createUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse newUsuario = usuarioService.createUsuario(usuarioRequest);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }

}
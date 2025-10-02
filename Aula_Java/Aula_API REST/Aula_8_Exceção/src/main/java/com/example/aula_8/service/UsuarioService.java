package com.example.aula_8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula_8.model.UsuarioModel;
import com.example.aula_8.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }

    public UsuarioModel salvar(UsuarioModel usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Usuario já cadastrado");
            
        }
        return usuarioRepository.save(usuario);
    }

}

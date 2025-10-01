package com.example.Aula_7.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Aula_7.model.UsuarioModel;
import com.example.Aula_7.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public List<UsuarioModel> listarUsuario() {
        return usuarioRepository.findAll();
    }

    // MÉTODO PARA SALVAR USUÁRIO
    public UsuarioModel salvarUsuario(UsuarioModel usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        return usuarioRepository.save(usuario);
    }

    // MÉTODO PARA ATUALIZAR USUÁRIO
    public UsuarioModel atualizarUsuario(UUID id, UsuarioModel usuario) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        return usuarioRepository.save(usuario);
    }

    // MÉTODO PARA DELETAR USUÁRIO
    public void deletarUsuario(UUID id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}

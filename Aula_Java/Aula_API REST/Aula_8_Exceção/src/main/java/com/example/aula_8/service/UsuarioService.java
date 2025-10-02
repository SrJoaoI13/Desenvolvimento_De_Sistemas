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
    
    // Listar todos os usuarios
    
    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }

    // Salvar um novo usuario
    // Verificar se o email já está cadastrado
    //  Se estiver, lançar uma exceção
    //  Se não estiver, salvar o usuario
    public UsuarioModel salvar(UsuarioModel usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Usuario já cadastrado");
            
        }
        return usuarioRepository.save(usuario);
    }

//   Atualizar um usuario existente
//   Verificar se o usuario existe
//   Se não existir, lançar uma exceção
//   Se existir, atualizar o usuario
    public UsuarioModel atualizar (Long id, UsuarioModel usuario) {
        if(!usuarioRepository.existsById(id)){
            throw new IllegalArgumentException("Usuario não encontrado");
        }
            return usuarioRepository.save(usuario);
    }

    // Deletar um usuario existente
    // Verificar se o usuario existe
    // Se não existir, lançar uma exceção
    // Se existir, deletar o usuario
    public void deletar(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Usuario não encontrado");
        }
        usuarioRepository.deleteById(id);
    }

}


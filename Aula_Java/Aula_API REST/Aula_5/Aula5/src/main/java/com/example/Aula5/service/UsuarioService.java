package com.example.Aula5.service;

import com.example.Aula5.model.Usuario;
import com.example.Aula5.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    private UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //GET
    @GetMapping
    public List<Usuario> listartodos(){
        return usuarioRepository.findAll();
    }

    //POST
    @PostMapping
    public Usuario salvar (Usuario usuario){
        //verificar se o funcionario esta Usuario
        if(usuarioRepository.findByemail(usuario.getEmail()).isPresent()){
            throw new RuntimeException("Usuario cadastrado");
        }
        //se não encontra no banco salvar
        return usuarioRepository.save(usuario);
    }
}

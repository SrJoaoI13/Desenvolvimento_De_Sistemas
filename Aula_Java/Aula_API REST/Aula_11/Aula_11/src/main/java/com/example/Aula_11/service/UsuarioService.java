package com.example.Aula_11.service;

import com.example.Aula_11.dto.UsuarioRequestDTO;
import com.example.Aula_11.dto.UsuarioResponseDTO;
import com.example.Aula_11.model.UsuarioModel;
import com.example.Aula_11.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    // Consulta todos os usuarios no banco de dados
    public List<UsuarioResponseDTO> ListarTodos(){
        return usuarioRepository
                .findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(),u.getEmail()))
                .toList();
    }

    // salva um novo usuario
    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        //verificando se os dados do novo usuario ja existem  no banco de dados.
        if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("E-mail ja cadastrado");
        }
        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(usuarioRequestDTO.getNome());
        novoUsuario.setEmail(usuarioRequestDTO.getEmail());
                // criptografando a senha antes de salvar
                novoUsuario.setSenha((bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha())));
                usuarioRepository.save(novoUsuario);
                return novoUsuario;
    }

    // Update
    public UsuarioModel atualizarUsuario(Long id,UsuarioRequestDTO usuarioRequestDTO){
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado");
        }
        UsuarioModel atualizarUsuario = new UsuarioModel();
        atualizarUsuario.setId(id);
        atualizarUsuario.setNome(usuarioRequestDTO.getNome());
        atualizarUsuario.setEmail(usuarioRequestDTO.getEmail());
        // criptografando a senha antes de salvar
        atualizarUsuario.setSenha((bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha())));

        usuarioRepository.save(atualizarUsuario);
        return atualizarUsuario;
    }

    // Delete
    public void excluirUsuario(Long id){
       if(! usuarioRepository.existsById(id)){
           throw new RuntimeException("Usuario não encontrado");
       }
        usuarioRepository.deleteById(id);
    }
}

package com.example.Aula_10.service;

import com.example.Aula_10.dto.UsuarioRequestDTO;
import com.example.Aula_10.dto.UsuarioResponseDTO;
import com.example.Aula_10.model.UsuarioModel;
import com.example.Aula_10.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // salvar
    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        if (usuarioRepository.findByEmail(usuarioRequestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("Usuario ja cadastrado.");
        }
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome(usuarioRequestDTO.getNome());
        usuario.setEmail(usuarioRequestDTO.getEmail());
        usuario.setSenha(usuarioRequestDTO.getSenha());
        //criptografando a sena antes de salvar
        usuario.setSenha(bCryptPasswordEncoder.encode(usuarioRequestDTO.getSenha()));

        usuarioRepository.save(usuario);
        return usuario;
    }

    // Consulta ao banco de dados
    public List<UsuarioResponseDTO> listarTodos(){
        return usuarioRepository
                // Retorna com os dados de todos os usuarios da tabela.
                .findAll()
                //Envia os dados obitidos para os proximos funcoes abaixo.
                .stream()
                //Envia somente os dados necessarios para resposta.
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                // transforma todos os dados em uma lista.
                .toList();
    }


}

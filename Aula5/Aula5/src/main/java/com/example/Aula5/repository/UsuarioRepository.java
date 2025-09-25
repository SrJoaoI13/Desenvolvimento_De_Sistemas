package com.example.Aula5.repository;

import com.example.Aula5.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    //nao para aplicação na cosulta em caso de retorna nulo
    Optional<Usuario> findByemail(String email);
}

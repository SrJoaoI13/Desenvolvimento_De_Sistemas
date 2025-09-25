package com.example.Aula5.repository;

import com.example.Aula5.model.Funcionario;
import com.example.Aula5.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {
    //nao para aplicação na cosulta em caso de retorna nulo
    Optional<Usuario> findBycpf(String cpf);
}

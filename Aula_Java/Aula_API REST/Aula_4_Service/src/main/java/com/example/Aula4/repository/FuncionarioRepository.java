package com.example.Aula4.repository;

import com.example.Aula4.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {
    //nao para aplicação na cosulta em caso de retorna nulo
    Optional<Funcionario> findBytelefone(String telefone);
}

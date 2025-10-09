package com.example.aula_9.repository;

import com.example.aula_9.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository  extends JpaRepository<FuncionarioModel, Long>{

    Optional<FuncionarioModel> findByemail(String email);
}

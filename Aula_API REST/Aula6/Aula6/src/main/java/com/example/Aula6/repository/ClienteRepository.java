package com.example.Aula6.repository;

import com.example.Aula6.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
// Pesquisa por um cliente sem udar id no banco de dados
// Optional = retorna true e false sem trava aplicação
// Evitando retorna nulo
Optional<Cliente> findByemail(String email);
}

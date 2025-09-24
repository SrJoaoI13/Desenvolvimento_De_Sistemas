package com.example.API.Rest2.repository;

import com.example.API.Rest2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // interface responsavel por isso e muito mais
    // save
    // delete
    // update
    // findbyID
    // findALL
}

package com.example.Atv_Casa.repository;

import com.example.Atv_Casa.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
}

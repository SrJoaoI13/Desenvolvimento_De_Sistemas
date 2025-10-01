package com.example.Aula_7.repository;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Aula_7.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
// MÉTODO PARA VERIFICAR SE O EMAIL JÁ EXISTE NO BANCO DE DADOS
// Optional É UMA CLASSE QUE PODE OU NÃO CONTER UM VALOR NULO
// SE O VALOR ESTIVER PRESENTE, ELE RETORNA O OBJETO, CASO CONTRÁRIO, RETORNA UM OBJETO VAZIO
// ASSIM, EVITAMOS O USO DE NULL E PREVENIMOS ERROS DE PONTEIRO NULO
// Optional É UMA CLASSE GENÉRICA, ENTÃO PRECISAMOS ESPECIFICAR O TIPO DO OBJETO QUE ELA VAI CONTER
Optional<UsuarioModel> findByEmail(String email);
}

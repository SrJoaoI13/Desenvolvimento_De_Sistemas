package com.example.Aula_10.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.Objects;

@RestControllerAdvice
public class GlobalException {

    // Padronizando mensagem de exceção do Service.
    @ExceptionHandler(IllegalArgumentException.class)
        public ResponseEntity<Map<String, Object>>  illegalArgumentException(IllegalArgumentException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of("mensagem", erro.getMessage(),
                        "sucesso", false));

    }

    // Padronizando mensagem de exceção de validação do RequestDTO
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>>  methodArgumentNotValidException(MethodArgumentNotValidException erro){
        return ResponseEntity
                .badRequest()
                .body(Map.of("mensagem", erro.getFieldErrors().get(0).getDefaultMessage(),
                        "sucesso",false));

    }

}

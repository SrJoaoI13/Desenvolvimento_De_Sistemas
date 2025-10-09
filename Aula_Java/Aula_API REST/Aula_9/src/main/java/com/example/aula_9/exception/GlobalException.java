package com.example.aula_9.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> IllegalArgumentException
            (IllegalArgumentException erro){
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("mensagem",erro.getMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> RuntimeException
            (RuntimeException erro){
        return  ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("mensagem",erro.getMessage()));
    }
}

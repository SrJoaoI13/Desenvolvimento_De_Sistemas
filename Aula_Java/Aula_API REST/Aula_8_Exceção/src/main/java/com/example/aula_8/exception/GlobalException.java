package com.example.aula_8.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> 
    handleIllegalArgumentException(IllegalArgumentException errro) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST
        ).body(Map.of("Mensagem", errro.getMessage()));
    }
}

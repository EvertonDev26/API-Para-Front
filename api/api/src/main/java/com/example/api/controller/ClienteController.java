package com.example.api.controller;

import com.example.api.dto.ClienteRequestDTO;
import com.example.api.dto.ClienteResponseDTO;
import com.example.api.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")

    public class ClienteController{
        @Autowired

        private ClienteService service;

        @GetMapping
        public ResponseEntity<List<ClienteResponseDTO>> listar() {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(service.listarTodos());

        }

        @PostMapping
        public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ClienteRequestDTO dto) {
            service.salvarCliente(dto);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));
        }
    }


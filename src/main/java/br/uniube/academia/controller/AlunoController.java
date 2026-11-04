package br.uniube.academia.controller;

import br.uniube.academia.dto.AlunoDTO;
import br.uniube.academia.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AlunoDTO> cadastrar(@Valid @RequestBody AlunoDTO dto) {
        AlunoDTO salvo = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}
package br.uniube.academia.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public record AlunoDTO(
        Long id,
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotBlank(message = "CPF é obrigatório") String cpf,
        @NotBlank(message = "E-mail é obrigatório") String email,
        @NotNull(message = "Data de nascimento é obrigatória") LocalDate dataNascimento
) {}
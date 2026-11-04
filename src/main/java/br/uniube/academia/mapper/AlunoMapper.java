package br.uniube.academia.mapper;

import br.uniube.academia.dto.AlunoDTO;
import br.uniube.academia.model.Aluno;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public Aluno toEntity(AlunoDTO dto) {
        return new Aluno(dto.nome(), dto.cpf(), dto.email(), dto.dataNascimento());
    }

    public AlunoDTO toDto(Aluno a) {
        return new AlunoDTO(a.getId(), a.getNome(), a.getCpf(), a.getEmail(), a.getDataNascimento());
    }
}
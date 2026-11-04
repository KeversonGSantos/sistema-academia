package br.uniube.academia.service;

import br.uniube.academia.dto.AlunoDTO;
import br.uniube.academia.exception.CpfDuplicadoException;
import br.uniube.academia.mapper.AlunoMapper;
import br.uniube.academia.model.Aluno;
import br.uniube.academia.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    public AlunoService(AlunoRepository repository, AlunoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public AlunoDTO cadastrar(AlunoDTO dto) {
        if (repository.existsByCpf(dto.cpf())) {
            throw new CpfDuplicadoException();
        }
        Aluno aluno = mapper.toEntity(dto);
        return mapper.toDto(repository.save(aluno));
    }
}
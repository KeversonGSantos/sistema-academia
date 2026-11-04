package br.uniube.academia.exception;

public class CpfDuplicadoException extends RuntimeException {
    public CpfDuplicadoException() {
        super("Já existe um aluno cadastrado com esse CPF");
    }
}

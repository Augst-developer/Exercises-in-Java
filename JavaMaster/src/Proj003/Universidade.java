package Proj003;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

    private String nome;
    private List<Aluno> alunos;

    public Universidade(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos matriculados!");
            return;
        }

        for (var a : alunos) {
            System.out.println("Nome: " + a.getNome() + ", matrícula: " + a.getMatricula());
        }
    }

}
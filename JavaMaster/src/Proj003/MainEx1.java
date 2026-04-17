package Proj003;

public class MainEx1 {

    public static void main(String[] args) {
        /*
        Exemplo em aula:
        1. Crie 3 objetos Aluno.
        2. Crie 1 objeto Universidade.
        3. Adicione os 3 alunos à universidade usando adicionarAluno().
        4. Chame o método listarAlunos() da universidade.
        */

        Aluno a1 = new Aluno("Jasper", "10244569");
        Aluno a2 = new Aluno("Mary", "10030101");
        Aluno a3 = new Aluno("Storm", "10775695");

        Universidade uni = new Universidade("Universidade Presbiteriana Mackenzie");

        System.out.println("--------------------");
        System.out.println("Universidade criada:");
        uni.listarAlunos();

        System.out.println("--------------------");
        System.out.println("Adicionando aluno a1 à universidade:");
        uni.adicionarAluno(a1);
        uni.listarAlunos();

        System.out.println("--------------------");
        System.out.println("Adicionando aluno a2 à universidade:");
        uni.adicionarAluno(a2);
        uni.listarAlunos();

        System.out.println("--------------------");
        System.out.println("Adicionando aluno a3 à universidade:");
        uni.adicionarAluno(a3);
        uni.listarAlunos();
    }

}
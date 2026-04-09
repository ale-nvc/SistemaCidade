package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(String codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + codigo);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da turma " + codigo);
    }

    public void definirProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getNome() + " definido para a turma " + codigo);
    }

    public String getCodigo() { return codigo; }
    public Professor getProfessor() { return professor; }
    public List<Aluno> getAlunos() { return alunos; }
}
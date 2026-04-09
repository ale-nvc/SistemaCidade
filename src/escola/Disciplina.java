package escola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String codigo;
    private String dataHora;
    private Professor professor;
    private List<Aluno> alunos;
    private double nota;

    public Disciplina(String codigo, String dataHora) {
        this.codigo = codigo;
        this.dataHora = dataHora;
        this.alunos = new ArrayList<>();
        this.nota = 0.0;
    }

    public double calcularMedia(Aluno aluno) {
        System.out.println("Calculando média do aluno " + aluno.getNome() + " na disciplina " + codigo);
        return nota;
    }

    public boolean verificarAprovacao(Aluno aluno) {
        boolean aprovado = nota >= 6.0;
        System.out.println("Aluno " + aluno.getNome() + (aprovado ? " APROVADO" : " REPROVADO") + " na disciplina " + codigo);
        return aprovado;
    }

    public void listarAlunos() {
        System.out.println("Alunos da disciplina " + codigo + ":");
        alunos.forEach(a -> System.out.println("  - " + a.getNome()));
    }

    public String getCodigo() { return codigo; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
    public List<Aluno> getAlunos() { return alunos; }
}
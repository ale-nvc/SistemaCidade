package escola;

import pessoa.Pessoa;

public class Aluno extends Pessoa {

    private String matricula;
    private String turno;

    public Aluno(String nome, String cpf, String dataNascimento, String telefone, String email, String matricula, String turno) {
        super(nome, cpf, dataNascimento, telefone, email);
        this.matricula = matricula;
        this.turno = turno;
    }

    public void realizarMatricula(Turma turma, Disciplina disciplina) {
        System.out.println("Aluno " + nome + " realizando matrícula na turma " + turma.getCodigo() + " na disciplina " + disciplina.getCodigo());
    }

    public double consultarNota(Disciplina disciplina) {
        System.out.println("Aluno " + nome + " consultando nota na disciplina " + disciplina.getCodigo());
        return disciplina.getNota();
    }

    public String getMatricula() { return matricula; }
    public String getTurno() { return turno; }
}
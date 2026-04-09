package escola;

import pessoa.Pessoa;

public class Professor extends Pessoa {

    private String matricula;
    private double salario;

    public Professor(String nome, String cpf, String dataNascimento, String telefone, String email, String matricula, double salario) {
        super(nome, cpf, dataNascimento, telefone, email);
        this.matricula = matricula;
        this.salario = salario;
    }

    public boolean lancarNota(Aluno aluno, double nota) {
        System.out.println("Professor " + nome + " lançando nota " + nota + " para aluno " + aluno.getNome());
        return true;
    }

    public boolean lancarFrequencia(Turma turma, String data) {
        System.out.println("Professor " + nome + " lançando frequência da turma " + turma.getCodigo() + " na data " + data);
        return true;
    }

    public double receberSalario() {
        System.out.println("Professor " + nome + " recebendo salário de R$ " + salario);
        return salario;
    }

    public String getMatricula() { return matricula; }
    public double getSalario() { return salario; }
}
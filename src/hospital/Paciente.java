package hospital;

import pessoa.Pessoa;

public class Paciente extends Pessoa {

    private String prontuarioMedico;

    public Paciente(String nome, String cpf, String dataNascimento, String telefone, String email) {
        super(nome, cpf, dataNascimento, telefone, email);
        this.prontuarioMedico = "";
    }

    public void consultar() {
        System.out.println("Paciente " + nome + " realizando consulta.");
    }

    public void receberReceita(String receita) {
        System.out.println("Paciente " + nome + " recebeu receita: " + receita);
    }

    public void receberAtestado(String atestado) {
        System.out.println("Paciente " + nome + " recebeu atestado: " + atestado);
    }

    public String getProntuarioMedico() { return prontuarioMedico; }
    public void setProntuarioMedico(String prontuario) { this.prontuarioMedico = prontuario; }
}
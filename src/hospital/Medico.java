package hospital;

import pessoa.Pessoa;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String dataNascimento, String telefone, String email, String crm, String especialidade) {
        super(nome, cpf, dataNascimento, telefone, email);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Consulta realizarConsulta(Paciente paciente) {
        System.out.println("Dr(a). " + nome + " realizando consulta com paciente " + paciente.getNome());
        return new Consulta(this, paciente);
    }

    public String emitirReceita(Paciente paciente) {
        String receita = "Receita emitida por Dr(a). " + nome + " para " + paciente.getNome();
        System.out.println(receita);
        return receita;
    }

    public String emitirAtestado(Paciente paciente) {
        String atestado = "Atestado emitido por Dr(a). " + nome + " para " + paciente.getNome();
        System.out.println(atestado);
        return atestado;
    }

    public String getCrm() { return crm; }
    public String getEspecialidade() { return especialidade; }
}
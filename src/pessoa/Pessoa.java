package pessoa;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String cpf, String dataNascimento, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getDataNascimento() { return dataNascimento; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " | CPF: " + cpf;
    }
}
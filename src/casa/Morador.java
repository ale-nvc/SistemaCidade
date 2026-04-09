package casa;

import pessoa.Pessoa;

public class Morador extends Pessoa {

    private Casa casa;

    public Morador(String nome, String cpf, String dataNascimento, String telefone, String email) {
        super(nome, cpf, dataNascimento, telefone, email);
    }

    public boolean realizarCadastro() {
        System.out.println("Morador " + nome + " realizando cadastro.");
        return true;
    }

    public void atualizarEndereco(String novoEndereco) {
        if (casa != null) {
            System.out.println("Morador " + nome + " atualizando endereço para: " + novoEndereco);
        }
    }

    public boolean pagarIPTU(IPTU boleto) {
        System.out.println("Morador " + nome + " pagando IPTU no valor de R$ " + boleto.getValorAnual());
        return true;
    }

    public Casa getCasa() { return casa; }
    public void setCasa(Casa casa) { this.casa = casa; }
}
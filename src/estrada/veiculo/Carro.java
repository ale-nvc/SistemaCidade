package estrada.veiculo;

public class Carro extends Veiculo {

    private String proprietario;

    public Carro(String modelo, String placa, String proprietario) {
        super(modelo, placa);
        this.proprietario = proprietario;
    }

    public String getProprietario() { return proprietario; }
}
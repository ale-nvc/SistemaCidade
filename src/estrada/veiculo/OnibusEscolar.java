package estrada.veiculo;

public class OnibusEscolar extends Veiculo {

    private String rotaEscola;

    public OnibusEscolar(String placa, String rotaEscola) {
        super("Onibus Escolar", placa);
        this.rotaEscola = rotaEscola;
    }

    public String getRotaEscola() { return rotaEscola; }
}
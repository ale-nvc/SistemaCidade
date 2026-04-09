package estrada.veiculo;

public class Ambulancia extends Veiculo {

    public Ambulancia(String placa) {
        super("Ambulancia", placa);
    }

    public void acionarSirene() {
        System.out.println("Ambulancia " + placa + " — SIRENE ACIONADA!");
    }
}
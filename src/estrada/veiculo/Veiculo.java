package estrada.veiculo;

import estrada.Estrada;

public abstract class Veiculo implements Estrada {

    protected String modelo;
    protected String placa;
    protected String origem;
    protected String destino;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String getOrigem() { return origem; }

    @Override
    public String getDestino() { return destino; }

    @Override
    public void deslocar(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        System.out.println(modelo + " [" + placa + "] deslocando de " + origem + " para " + destino);
    }

    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
}
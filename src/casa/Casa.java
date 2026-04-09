package casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private String endereco;
    private String cep;
    private double valorIPTU;
    private int numeroComodos;
    private double areaM2;
    private List<Morador> moradores;

    public Casa(String endereco, String cep, int numeroComodos, double areaM2) {
        this.endereco = endereco;
        this.cep = cep;
        this.numeroComodos = numeroComodos;
        this.areaM2 = areaM2;
        this.moradores = new ArrayList<>();
        this.valorIPTU = areaM2 * 10; // cálculo simplificado
    }

    public void registrarMorador(Morador novoMorador) {
        moradores.add(novoMorador);
        novoMorador.setCasa(this);
        System.out.println("Morador " + novoMorador.getNome() + " registrado na casa " + endereco);
    }

    public String obterEndereco() {
        return endereco;
    }

    public IPTU gerarIPTU() {
        IPTU iptu = new IPTU(valorIPTU, this);
        System.out.println("IPTU gerado para casa " + endereco + " no valor de R$ " + valorIPTU);
        return iptu;
    }

    public String getEndereco() { return endereco; }
    public String getCep() { return cep; }
    public double getValorIPTU() { return valorIPTU; }
    public int getNumeroComodos() { return numeroComodos; }
    public double getAreaM2() { return areaM2; }
    public List<Morador> getMoradores() { return moradores; }
}
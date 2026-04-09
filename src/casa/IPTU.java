package casa;

import java.util.Date;

public class IPTU {

    private double valorAnual;
    private Date vencimento;
    private boolean status;
    private Casa casa;

    public IPTU(double valorAnual, Casa casa) {
        this.valorAnual = valorAnual;
        this.casa = casa;
        this.vencimento = new Date();
        this.status = false;
    }

    public void gerarBoleto(Casa casa) {
        System.out.println("Boleto IPTU gerado para casa " + casa.getEndereco() + " no valor de R$ " + valorAnual);
    }

    public boolean verificarDebito(Casa casa) {
        System.out.println("Verificando débito de IPTU para casa " + casa.getEndereco());
        return !status;
    }

    public double getValorAnual() { return valorAnual; }
    public Date getVencimento() { return vencimento; }
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
    public Casa getCasa() { return casa; }
}
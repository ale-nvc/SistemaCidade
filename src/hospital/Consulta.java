package hospital;

import java.util.Date;

public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private Date dataHora;
    private String diagnostico;

    public Consulta(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = new Date();
        this.diagnostico = "";
    }

    public void agendar(Medico medico, Paciente paciente, Date data) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = data;
        System.out.println("Consulta agendada para " + paciente.getNome() + " com Dr(a). " + medico.getNome() + " em " + data);
    }

    public void cancelar(String motivo) {
        System.out.println("Consulta de " + paciente.getNome() + " cancelada. Motivo: " + motivo);
    }

    public void adiar(Date novaData) {
        this.dataHora = novaData;
        System.out.println("Consulta de " + paciente.getNome() + " adiada para " + novaData);
    }

    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public Date getDataHora() { return dataHora; }
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
}
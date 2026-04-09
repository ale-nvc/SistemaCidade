package ponte;

import casa.Morador;
import hospital.Paciente;
import hospital.Medico;

public class ConexaoCasaHospital implements Ponte {

    private boolean conectado;

    public ConexaoCasaHospital() {
        this.conectado = false;
    }

    @Override
    public void conectar(String moduloA, String moduloB) {
        this.conectado = true;
        System.out.println("Conexão estabelecida entre " + moduloA + " e " + moduloB);
    }

    @Override
    public boolean isConectado() {
        return conectado;
    }

    @Override
    public void desconectar() {
        this.conectado = false;
        System.out.println("Conexão entre Casa e Hospital encerrada.");
    }

    // Morador vira Paciente
    public Paciente moradorViraPaciente(Morador morador) {
        conectar("Casa", "Hospital");
        System.out.println("Morador " + morador.getNome() + " agora é um Paciente no Hospital.");
        return new Paciente(
                morador.getNome(),
                morador.getCpf(),
                morador.getDataNascimento(),
                morador.getTelefone(),
                morador.getEmail()
        );
    }

    // Morador vira Médico
    public Medico moradorViraMedico(Morador morador, String crm, String especialidade) {
        conectar("Casa", "Hospital");
        System.out.println("Morador " + morador.getNome() + " agora é um Médico no Hospital.");
        return new Medico(
                morador.getNome(),
                morador.getCpf(),
                morador.getDataNascimento(),
                morador.getTelefone(),
                morador.getEmail(),
                crm,
                especialidade
        );
    }
}
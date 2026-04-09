package ponte;

import hospital.Medico;
import escola.Professor;

public class ConexaoHospitalEscola implements Ponte {

    private boolean conectado;

    public ConexaoHospitalEscola() {
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
        System.out.println("Conexão entre Hospital e Escola encerrada.");
    }

    // Médico vai à escola dar palestra
    public void medicoNaEscola(Medico medico) {
        conectar("Hospital", "Escola");
        System.out.println("Dr(a). " + medico.getNome() +
                " (" + medico.getEspecialidade() + ") realizando palestra na Escola.");
    }

    // Escola encaminha aluno ao hospital
    public void encaminharAoHospital(String nomeAluno) {
        conectar("Escola", "Hospital");
        System.out.println("Escola encaminhando aluno " + nomeAluno + " ao Hospital.");
    }
}
import casa.*;
import escola.*;
import estrada.veiculo.*;
import hospital.*;
import ponte.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("SISTEMA CIDADE\n");
        Morador joao = new Morador("João Silva", "111.111.111-11", "1990-05-10", "99999-1111", "joao@email.com");
        Morador maria = new Morador("Maria Souza", "222.222.222-22", "1985-08-20", "99999-2222", "maria@email.com");

        Casa casa = new Casa("Rua das Flores, 123", "12345-678", 4, 80.0);
        casa.registrarMorador(joao);
        casa.registrarMorador(maria);

        System.out.println("\nDeslocamento:");
        OnibusEscolar onibus = new OnibusEscolar("ESC-0001", "Bairro Norte -> Escola Central");
        onibus.deslocar("Casa", "Escola");

        Ambulancia ambulancia = new Ambulancia("ABC-1234");
        ambulancia.deslocar("Casa", "Hospital");

        // Pontes conectam os módulos e definem os papéis de cada morador
        System.out.println("\nConexoes entre modulos:");
        ConexaoCasaEscola conexaoEscola = new ConexaoCasaEscola();
        ConexaoCasaHospital conexaoHospital = new ConexaoCasaHospital();

        Professor joaoProfessor = conexaoEscola.moradorViraProfessor(joao, "PROF-001", 5000.0);
        Paciente mariaPaciente = conexaoHospital.moradorViraPaciente(maria);
        Medico joaoMedico = conexaoHospital.moradorViraMedico(joao, "CRM-12345", "Cardiologia");

        // Um dia na Escola
        System.out.println("\nEscola:");
        Turma turma = new Turma("T383-5TC");
        turma.definirProfessor(joaoProfessor);

        Disciplina disciplina = new Disciplina("Engenharia de Software II", "Segunda 08:00");
        disciplina.setNota(8.5);
        disciplina.verificarAprovacao(new Aluno(maria.getNome(), maria.getCpf(), maria.getDataNascimento(), maria.getTelefone(), maria.getEmail(), "MAT-001", "Manha"));

        // Um dia no Hospital
        System.out.println("\nHospital:");
        Consulta consulta = joaoMedico.realizarConsulta(mariaPaciente);
        consulta.setDiagnostico("Pressao alta");
        mariaPaciente.receberReceita(joaoMedico.emitirReceita(mariaPaciente));
    }
}
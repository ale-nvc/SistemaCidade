import casa.*;
import escola.*;
import estrada.veiculo.*;
import hospital.*;
import ponte.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("        SISTEMA CIDADE - INICIANDO        ");
        System.out.println("===========================================\n");

        // -------------------------------------------------------
        // CRIANDO MORADORES
        // -------------------------------------------------------
        System.out.println("----------- MÓDULO CASA -----------\n");

        Casa casa1 = new Casa("Rua das Flores, 123", "12345-678", 4, 80.0);
        Casa casa2 = new Casa("Av. Principal, 456", "98765-432", 3, 60.0);

        Morador joao = new Morador("João Silva", "111.111.111-11", "1990-05-10", "99999-1111", "joao@email.com");
        Morador maria = new Morador("Maria Souza", "222.222.222-22", "1985-08-20", "99999-2222", "maria@email.com");
        Morador ana = new Morador("Ana Lima", "333.333.333-33", "2000-03-15", "99999-3333", "ana@email.com");

        casa1.registrarMorador(joao);
        casa1.registrarMorador(maria);
        casa2.registrarMorador(ana);

        System.out.println();

        // Gerando e pagando IPTU
        IPTU iptuCasa1 = casa1.gerarIPTU();
        joao.pagarIPTU(iptuCasa1);

        System.out.println();

        // -------------------------------------------------------
        // USANDO A ESTRADA — VEÍCULOS SE DESLOCANDO
        // -------------------------------------------------------
        System.out.println("----------- MÓDULO ESTRADA -----------\n");

        Ambulancia ambulancia = new Ambulancia("ABC-1234");
        Carro carro = new Carro("Civic", "XYZ-5678", joao.getNome());
        OnibusEscolar onibus = new OnibusEscolar("ESC-0001", "Bairro Norte → Escola Central");

        // João usa o carro para ir ao trabalho
        carro.deslocar("Casa", "Hospital");

        // Ana pega o ônibus escolar
        onibus.deslocar("Casa", "Escola");

        // Ambulância atende uma emergência na escola
        ambulancia.acionarSirene();
        ambulancia.deslocar("Escola", "Hospital");

        System.out.println();

        // -------------------------------------------------------
        // USANDO AS PONTES — MORADORES ASSUMINDO PAPÉIS
        // -------------------------------------------------------
        System.out.println("----------- PONTES ENTRE MÓDULOS -----------\n");

        ConexaoCasaHospital conexaoCasaHospital = new ConexaoCasaHospital();
        ConexaoCasaEscola conexaoCasaEscola = new ConexaoCasaEscola();
        ConexaoHospitalEscola conexaoHospitalEscola = new ConexaoHospitalEscola();

        // João (Morador) vira Médico no Hospital
        Medico joaoMedico = conexaoCasaHospital.moradorViraMedico(joao, "CRM-12345", "Cardiologia");

        // Maria (Moradora) vira Paciente no Hospital
        Paciente mariaPaciente = conexaoCasaHospital.moradorViraPaciente(maria);

        // Ana (Moradora) vira Aluna na Escola
        Aluno anaAluna = conexaoCasaEscola.moradorViraAluno(ana, "MAT-2024", "Manhã");

        // João também é Professor na Escola (além de Médico!)
        Professor joaoProfessor = conexaoCasaEscola.moradorViraProfessor(joao, "PROF-001", 5000.0);

        System.out.println();

        // -------------------------------------------------------
        // MÓDULO HOSPITAL — CONSULTA ACONTECENDO
        // -------------------------------------------------------
        System.out.println("----------- MÓDULO HOSPITAL -----------\n");

        Consulta consulta = joaoMedico.realizarConsulta(mariaPaciente);
        consulta.setDiagnostico("Pressão alta");

        String receita = joaoMedico.emitirReceita(mariaPaciente);
        mariaPaciente.receberReceita(receita);

        String atestado = joaoMedico.emitirAtestado(mariaPaciente);
        mariaPaciente.receberAtestado(atestado);

        System.out.println();

        // -------------------------------------------------------
        // MÓDULO ESCOLA — AULA ACONTECENDO
        // -------------------------------------------------------
        System.out.println("----------- MÓDULO ESCOLA -----------\n");

        Turma turma = new Turma("T383-5TC");
        turma.definirProfessor(joaoProfessor);
        turma.adicionarAluno(anaAluna);

        Disciplina disciplina = new Disciplina("Engenharia de Software II", "Segunda 08:00");
        disciplina.setProfessor(joaoProfessor);
        disciplina.setNota(8.5);

        anaAluna.realizarMatricula(turma, disciplina);
        joaoProfessor.lancarNota(anaAluna, 8.5);
        joaoProfessor.lancarFrequencia(turma, "2026-04-08");
        anaAluna.consultarNota(disciplina);
        disciplina.verificarAprovacao(anaAluna);

        System.out.println();

        // -------------------------------------------------------
        // CONEXÃO HOSPITAL → ESCOLA
        // -------------------------------------------------------
        System.out.println("----------- HOSPITAL → ESCOLA -----------\n");

        conexaoHospitalEscola.medicoNaEscola(joaoMedico);
        conexaoHospitalEscola.encaminharAoHospital(anaAluna.getNome());
        ambulancia.acionarSirene();
        ambulancia.deslocar("Escola", "Hospital");

        System.out.println();
        System.out.println("===========================================");
        System.out.println("        SISTEMA CIDADE - ENCERRADO        ");
        System.out.println("===========================================");
    }
}
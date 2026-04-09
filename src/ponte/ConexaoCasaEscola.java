package ponte;

import casa.Morador;
import escola.Aluno;
import escola.Professor;

public class ConexaoCasaEscola implements Ponte {

    private boolean conectado;

    public ConexaoCasaEscola() {
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
        System.out.println("Conexão entre Casa e Escola encerrada.");
    }

    // Morador vira Aluno
    public Aluno moradorViraAluno(Morador morador, String matricula, String turno) {
        conectar("Casa", "Escola");
        System.out.println("Morador " + morador.getNome() + " agora é um Aluno na Escola.");
        return new Aluno(
                morador.getNome(),
                morador.getCpf(),
                morador.getDataNascimento(),
                morador.getTelefone(),
                morador.getEmail(),
                matricula,
                turno
        );
    }

    // Morador vira Professor
    public Professor moradorViraProfessor(Morador morador, String matricula, double salario) {
        conectar("Casa", "Escola");
        System.out.println("Morador " + morador.getNome() + " agora é um Professor na Escola.");
        return new Professor(
                morador.getNome(),
                morador.getCpf(),
                morador.getDataNascimento(),
                morador.getTelefone(),
                morador.getEmail(),
                matricula,
                salario
        );
    }
}
package ponte;

// Interface Ponte — módulo de reusabilidade
// Conecta dois módulos que não se comunicariam diretamente
public interface Ponte {

    // Estabelece a conexão entre dois módulos
    void conectar(String moduloA, String moduloB);

    // Verifica se a conexão está ativa
    boolean isConectado();

    // Encerra a conexão
    void desconectar();
}
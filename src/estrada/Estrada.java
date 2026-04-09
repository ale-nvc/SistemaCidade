package estrada;

// Interface Estrada — módulo de reusabilidade
// Qualquer classe que "usar a estrada" precisa implementar esses métodos
public interface Estrada {

    // De onde está partindo
    String getOrigem();

    // Para onde está indo
    String getDestino();

    // Realiza o deslocamento de um ponto a outro
    void deslocar(String origem, String destino);
}
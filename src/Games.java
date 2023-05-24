public class Games {
    String nome;
    String desenvolveraDoJogo;
    String historiaDoJogo;
    int anoDeLancamento;


    void exibeDadosDoJogo() {
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Desenvolvedora: " + desenvolveraDoJogo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historiaDoJogo);
    }
}
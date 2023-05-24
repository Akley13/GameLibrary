public class Games {
    String nome;
    String desenvolveraDoJogo;
    String historiaDoJogo;
    int anoDeLancamento;
    double avaliacaoMetacritic;
    double avaliacaoPessoal;
    double totalAvaliacoes;
    boolean valeAPena;

    void exibeDadosDoJogo() {
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Desenvolvedora: " + desenvolveraDoJogo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("História: " + historiaDoJogo);
        System.out.println("Nota Metacritic: " + avaliacaoMetacritic);
        System.out.println("Nota Pessoal: " + avaliacaoPessoal);
    }

    void calculoAvaliacao(double nota) {
        totalAvaliacoes = avaliacaoMetacritic + avaliacaoPessoal;
        if (totalAvaliacoes < 5)
    }


}
public class Principal {
    public static void main(String[] args) {
        Games gamePreferido = new Games();
        gamePreferido.nome = "The last of us";
        gamePreferido.desenvolveraDoJogo = "Naughty Dog";
        gamePreferido.anoDeLancamento = 2013;
        gamePreferido.historiaDoJogo = "A história de survival horror se passa em um mundo pós-apocalíptico. O fungo cordyceps infecta pessoas e criaturas e as torna “zumbis”. O desenrolar acontece num futuro distópico que começa com o surto da doença ocorrendo em 2013, mas o jogo em si se passa vinte anos depois, em 2033.";

        gamePreferido.exibeDadosDoJogo();
    }
}

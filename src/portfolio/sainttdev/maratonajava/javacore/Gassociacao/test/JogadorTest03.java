package portfolio.sainttdev.maratonajava.javacore.Gassociacao.test;

import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Jogador;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Haaland");
        Time time = new Time("Brasil");
        Time time2 = new Time("Noruega");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time2);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();
        time2.imprime();
    }
}

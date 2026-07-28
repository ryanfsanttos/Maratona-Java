package portfolio.sainttdev.maratonajava.javacore.Csobrecargametodos.exercicio;

import portfolio.sainttdev.maratonajava.javacore.Csobrecargametodos.dominio.SobrecargaExercicioJogo;

public class SobrecargaTest {
    public static void main(String[] args) {
        SobrecargaExercicioJogo jogo = new SobrecargaExercicioJogo();
            // De forma comum, poderíamos imprimir os dados desta maneira:
//        jogo.setNome("Grand Theft Auto: VI");
//        jogo.setGenero("Ação");
//        jogo.setIdadeClassificacao(18);
//        jogo.setAno(2026);

            // Há dois métodos com nomes idênticos, o "inicializacao". A diferença entre eles é basicamente o ultimo tipo que é pedido, a "Empresa" do jogo.
//        jogo.inicializacao("Grand Theft Auto: VI", "Ação", 18, 2026);
        jogo.inicializacao("Grand Theft Auto: VI", "Ação", 18, 2026, "Rockstar Games");
        jogo.imprime();
    }
}

package portfolio.sainttdev.maratonajava.javacore.Gassociacao.test;

import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Escola;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Vegetta Sensei");
        Professor professor2 = new Professor("Goku Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Câmara Gravitacional", professores);

        escola.imprime();
    }
}

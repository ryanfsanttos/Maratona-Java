package portfolio.sainttdev.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.sainttdev.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import portfolio.sainttdev.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Vegetta";
        estudante01.idade = 40;
        estudante01.sexo = 'M';

        estudante02.nome = "Bulma";
        estudante02.idade = 35;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("------------------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}

package portfolio.sainttdev.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.sainttdev.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Vegetta";
        estudante01.idade = 40;
        estudante01.sexo = 'M';

        estudante02.nome = "Bulma";
        estudante02.idade = 35;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}

package portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioteste;

import portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse.Estudante;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse.Laboratorio;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse.Orientador;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.exercicioClasse.Projeto;

public class ExercicioTest {
    public static void main(String[] args) {
        Projeto projeto = new Projeto("F The Police");
        Orientador orientador = new Orientador("N.W.A Straight Outta Compton", "RAP");
        Laboratorio laboratorio = new Laboratorio("LabTech", 'B');
        Estudante estudante1 = new Estudante("Ice Cube", 19);
        Estudante estudante2 = new Estudante("Dr. Dre", 23);
        Estudante estudante3 = new Estudante("Eazy-E", 23);
        Estudante estudante4 = new Estudante("DJ Yella", 26);
        Estudante estudante5 = new Estudante("MC Ren", 19);
        Estudante[] estudantes = {estudante1, estudante2, estudante3, estudante4, estudante5};


        projeto.setOrientador(orientador);
        projeto.setLaboratorio(laboratorio);
        projeto.setEstudantes(estudantes);
        projeto.imprime();
    }
}

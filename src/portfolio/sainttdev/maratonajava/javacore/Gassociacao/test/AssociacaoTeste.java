package portfolio.sainttdev.maratonajava.javacore.Gassociacao.test;

import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Aluno;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Local;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Professor;
import portfolio.sainttdev.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 19);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar One Piece",alunosParaSeminario, local);

        Seminario[] seminarioDisponiveis = {seminario};

        professor.setSeminarios(seminarioDisponiveis);

        professor.imprime();
    }
}

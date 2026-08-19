package portfolio.sainttdev.maratonajava.javacore.Hheranca.exerciciotest;

import portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse.Aluno;
import portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse.Pessoa;
import portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse.Professor;

public class AdsTest {
    public static void main(String[] args) {
        System.out.println("### TESTES ###");

        Pessoa p = new Pessoa("João Almeida");
        p.setCpf("454.434.564-32");
        p.setIdade(19);

        p.imprime();

        System.out.println("-------------");

        Aluno aluno = new Aluno("Carlin do grau", "Ciência da Computação");
        aluno.setCpf("999.888.777-65");
        aluno.setIdade(22);
        aluno.imprime();

        System.out.println("-------------");

        Professor fesssor = new Professor("George da Obra", "Fundamentos de Banco de Dados");
        fesssor.setCpf("000.000.000-01");
        fesssor.setIdade(38);

        fesssor.imprime();

    }
}

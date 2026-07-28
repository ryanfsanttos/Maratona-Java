package portfolio.sainttdev.maratonajava.javacore.Aintroducaoclasses.test;

import portfolio.sainttdev.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Sérgio";
        professor.idade = 46;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " +professor.idade + " " +professor.sexo);
    }
}

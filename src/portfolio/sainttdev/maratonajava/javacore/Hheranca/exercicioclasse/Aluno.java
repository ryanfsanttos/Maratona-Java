package portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.curso);
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

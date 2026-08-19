package portfolio.sainttdev.maratonajava.javacore.Hheranca.exercicioclasse;

public class Professor extends Pessoa{
    private String especialidade;

    public Professor(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

